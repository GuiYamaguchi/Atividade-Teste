package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] vetorMergeSort = {1, -5, 10, 999, 67, -11, 3};
        int[] ordenadoMerge = MergeSort.ordernarMergeSort(vetorMergeSort);

        System.out.println(java.util.Arrays.toString(vetorMergeSort));
        System.out.println(java.util.Arrays.toString(ordenadoMerge));

        int[] vetor = {3, -1, 3, 0};

        int[] resultado = InsertionSort.ordenar(vetor);

        System.out.println("Vetor original:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }

        System.out.println("\nVetor ordenado:");
        for (int valor : resultado) {
            System.out.print(valor + " ");
        }

    }
}