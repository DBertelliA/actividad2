
package ar.charlycimino.ejemplos.excepcionespropias;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Calculadora {
    public int factorial (int num) {
        if (num < 0) {
            throw new ArithmeticException("No se puede calcular el factorial de un número negativo");
        }
        final int MAX_FACTORIAL = 12;

        if (num > MAX_FACTORIAL) {
            throw new IntegerOverflowException("Por limitaciones técnicas, no se puede calcular el factorial");
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
