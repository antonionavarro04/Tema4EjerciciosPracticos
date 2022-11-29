// € Hecho por Antonio Navarro

package ejercicio5;

public class FuncionesRecursivas {
    static int sumatorio(int num){
        // ^ Definimos la variable resultado
        int resultado = 0;

        // ! Mediante un bucle for sumamos los numeros entre 1 y num
        for (int i = 2; i < num; i++) {
            resultado += i;
        }

        // ! Devolvemos el resultado
        return resultado;
    }

    static double potencia(double numA, int num){
        // ^ Definimos la variable resultado
        double resultado;

        // ! Exponemos numA a num
        resultado = Math.pow(numA, num);

        // ! Devolvemos el resultado
        return resultado;
    }

    static int serieFibonacci(int num){
        // ^ Definimos la variable resultado
        int resultado = 0;

        // ^ Definimos la variable fib0 y fib1
        int fib0 = 0;
        int fib1 = 1;

        // ! Mediante un bucle for calculamos la serie de Fibonacci
        for (int i = 1; i < num; i++) {
            resultado = fib0 + fib1;
            fib0 = fib1;
            fib1 = resultado;
        }

        // ! Devolvemos el resultado
        return resultado;
    }
}
