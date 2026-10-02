package org.example;

public class InsertionSort {

    public static int[] ordenar(int[] v) {
        if (v == null) {
            throw new IllegalArgumentException("Entrada nula");
        }

        int[] a = v.clone();

        for (int i = 1; i < a.length; i++) {
            int chave = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > chave) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = chave;
        }

        return a;
    }
}
