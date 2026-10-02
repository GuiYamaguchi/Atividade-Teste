package org.example;
import java.util.Arrays;

public class MergeSort {

    public static int[] ordernarMergeSort(int[] vetor){
        if (vetor == null) {
            throw new IllegalArgumentException("Entrada nula");
        }

        if (vetor.length <= 1) {
            return vetor.clone();
        }

        int meio = vetor.length / 2;

        int[] esquerda = Arrays.copyOfRange(vetor, 0, meio);
        int[] direita = Arrays.copyOfRange(vetor, meio, vetor.length);

        esquerda = ordernarMergeSort(esquerda);
        direita = ordernarMergeSort(direita);

        return intercalar(esquerda, direita);

    }

    public static int[] intercalar(int[] esquerda, int[] direita) {
        int[] resultado = new int[esquerda.length + direita.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < esquerda.length && j < direita.length){
            if (esquerda[i] <= direita[j]) {
                resultado[k++] = esquerda[i++];
            } else {
                resultado[k++] = direita[j++];
            }
        }

        while (i < esquerda.length){
            resultado[k++] = esquerda[i++];
        }

        while (j < direita.length){
            resultado[k++] = direita[j++];
        }

        return resultado;
    }


}
