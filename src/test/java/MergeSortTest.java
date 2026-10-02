import org.example.MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void deveOrdenarVetor() {
        int[] entrada = {5, 2, 8, 1, 3};
        int[] esperado = {1, 2, 3, 5, 8};

        int[] resultado = MergeSort.ordernarMergeSort(entrada);

        assertArrayEquals(esperado, resultado);
    }

    @Test
    void deveAceitarVetorVazio() {
        int[] entrada = {};
        int[] esperado = {};

        int[] resultado = MergeSort.ordernarMergeSort(entrada);

        assertArrayEquals(esperado, resultado);
    }

    @Test
    void deveAceitarVetorComUmElemento() {
        int[] entrada = {10};
        int[] esperado = {10};

        int[] resultado = MergeSort.ordernarMergeSort(entrada);

        assertArrayEquals(esperado, resultado);
    }

    @Test
    void deveOrdenarNumerosNegativosEZero() {
        int[] entrada = {3, -5, 0, -2, 8, -1};
        int[] esperado = {-5, -2, -1, 0, 3, 8};

        int[] resultado = MergeSort.ordernarMergeSort(entrada);

        assertArrayEquals(esperado, resultado);
    }

    @Test
    void devePreservarElementosRepetidos() {
        int[] entrada = {5, 2, 5, 2, 2, 8, 5};
        int[] esperado = {2, 2, 2, 5, 5, 5, 8};

        int[] resultado = MergeSort.ordernarMergeSort(entrada);

        assertArrayEquals(esperado, resultado);
    }

    @Test
    void devePreservarOVetorOriginal() {
        int[] entrada = {5, 3, 1, 4, 2};
        int[] copiaOriginal = entrada.clone();

        MergeSort.ordernarMergeSort(entrada);

        assertArrayEquals(copiaOriginal, entrada);
    }

    @Test
    void deveRetornarUmaNovaCopia() {
        int[] entrada = {3, 1, 2};

        int[] resultado = MergeSort.ordernarMergeSort(entrada);

        assertNotSame(entrada, resultado);
    }

    @Test
    void devePreservarTamanhoDoVetor() {
        int[] entrada = {5, 2, 8, 2, -1, 0};

        int[] resultado = MergeSort.ordernarMergeSort(entrada);

        assertEquals(entrada.length, resultado.length);
    }

    @Test
    void deveLancarExcecaoParaVetorNulo() {
        assertThrows(
                IllegalArgumentException.class,
                () -> MergeSort.ordernarMergeSort(null)
        );
    }
}
