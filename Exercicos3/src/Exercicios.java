import java.util.Scanner;

public class Exercicios {

    public void fatorial() {
        int valor, resultado;
        Scanner teclado = new Scanner(System.in);

        resultado = 1;

        System.out.print("Digite um valor inteiro: ");
        valor = teclado.nextInt();

        System.out.print(String.format("- Fatorial(%d) = ", valor));

        for (int i = valor; i >= 2; i--) {
            resultado = resultado * i;
            System.out.print(i);
            if (i != 2) {
                System.out.print(" x ");
            }
        }
        System.out.print(" = " + resultado);
    }

    public void fibonacci() {
        int valorUm, valorDois, entrada;
        Scanner telcado = new Scanner(System.in);

        valorUm = 0;
        valorDois = 1;

        System.out.print("Digite o número de termos: ");
        entrada = telcado.nextInt();

        System.out.print(String.format("- Série de Fibonacci[%d]: ", entrada));

        for (int i = 1; i <= entrada; i++) {
            valorUm = valorUm + valorDois;
            valorDois = valorUm - valorDois;

            System.out.print(String.format("%d ", valorUm));
        }
    }

    public void quadrado() {
        int entrada;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        entrada = teclado.nextInt();

        for (int j = 1; j <= entrada; j++) {
            for (int i = 1; i <= entrada; i++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }

    public void somaDePares() {
        int entradaUm, entradaDois, total;
        Scanner teclado = new Scanner(System.in);

        total = 0;

        System.out.print("Digite dois valores inteiros: ");
        entradaUm = teclado.nextInt();
        entradaDois = teclado.nextInt();

        if (entradaUm < entradaDois) {
            System.out.print("Somando valores pares: ");
            for (entradaUm = entradaUm + 1; entradaUm <= entradaDois - 1; entradaUm++) {
                if (entradaUm % 2 == 0) {
                    System.out.print(entradaUm);
                    if (entradaUm + 2 != entradaDois && entradaUm + 1 != entradaDois) {
                        System.out.print(" + ");
                    }else {
                        System.out.print(" = ");
                    }
                    total += entradaUm;
                }
            }
            System.out.print(total);
        }else {
            System.out.print("Valores incorretos.");
        }
    }
}
