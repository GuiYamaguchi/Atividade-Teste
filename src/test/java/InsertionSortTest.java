import static org.junit.jupiter.api.Assertions.*;

import org.example.InsertionSort;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

    @Test
    void deveOrdenarVetorNormal() {
        int[] entrada = {3, -1, 3, 0};

        int[] resultado = InsertionSort.ordenar(entrada);

        assertArrayEquals(
                new int[]{-1, 0, 3, 3},
                resultado
        );
    }

    @Test
    void deveAceitarVetorVazio() {
        int[] entrada = {};

        int[] resultado = InsertionSort.ordenar(entrada);

        assertArrayEquals(new int[]{}, resultado);
    }

    @Test
    void deveAceitarVetorComUmElemento() {
        int[] entrada = {7};

        int[] resultado = InsertionSort.ordenar(entrada);

        assertArrayEquals(new int[]{7}, resultado);
    }

    @Test
    void deveAceitarNegativosEZero() {
        int[] entrada = {-5, 0, -2, 3, -1};

        int[] resultado = InsertionSort.ordenar(entrada);

        assertArrayEquals(
                new int[]{-5, -2, -1, 0, 3},
                resultado
        );
    }

    @Test
    void deveAceitarElementosRepetidos() {
        int[] entrada = {3, 1, 3, 2, 1, 3};

        int[] resultado = InsertionSort.ordenar(entrada);

        assertArrayEquals(
                new int[]{1, 1, 2, 3, 3, 3},
                resultado
        );
    }

    @Test
    void devePreservarVetorOriginal() {
        int[] entrada = {3, -1, 3, 0};
        int[] original = entrada.clone();

        InsertionSort.ordenar(entrada);

        assertArrayEquals(original, entrada);
    }

    @Test
    void devePreservarTamanho() {
        int[] entrada = {5, 2, 8, 1};

        int[] resultado = InsertionSort.ordenar(entrada);

        assertEquals(entrada.length, resultado.length);
    }

    @Test
    void deveLancarExcecaoParaVetorNulo() {
        assertThrows(
                IllegalArgumentException.class,
                () -> InsertionSort.ordenar(null)
        );
    }

    @Test
    void deveFuncionarComSeteElementos() {
        int[] entrada = {7, 3, 5, 1, 6, 2, 4};

        int[] resultado = InsertionSort.ordenar(entrada);

        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6, 7},
                resultado
        );
    }
}
