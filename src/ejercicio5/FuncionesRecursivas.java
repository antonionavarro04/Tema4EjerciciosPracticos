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
        resultado = potencia(numA, num);

        // ! Devolvemos el resultado
        return resultado;
    }

    static int serieFibonacci(int num){
        // ^ Definimos la variable resultado
        int resultado = 0;

        // ! Calculamos la serie de Fibonacci de forma recursiva
        if (num == 0 || num == 1) {
            resultado = num;
        } else {
            resultado = serieFibonacci(num - 1) + serieFibonacci(num - 2);
        }

        // ! Devolvemos el resultado
        return resultado;
    }
}
