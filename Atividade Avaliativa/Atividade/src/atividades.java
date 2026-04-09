import java.util.Scanner;

public class atividades {

    public void Solucao01() {
        int limiteSuperior, incremento, saida;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um limite: ");
        limiteSuperior = teclado.nextInt();

        System.out.print("Digite o valor de incremento: ");
        incremento = teclado.nextInt();

        System.out.print("Saida: ");

        for (saida = 0; saida <= limiteSuperior; saida+=incremento) {
            System.out.print(saida + "  ");
        }
    }

    public void soloucao02() {
        int limiteSuperior, saida;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um limite: ");
        limiteSuperior = teclado.nextInt();

        System.out.print("Saida: ");

        for (saida = 0; saida <= limiteSuperior; saida++) {
            if (saida % 2 == 1) {
                if (saida < 15) {
                    System.out.print(saida + "  ");
                }
            }
        }
    }

    public void solucao03() {
        int num, valor, saida = 1, saidaTemp = 0, total = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        valor = teclado.nextInt();

        System.out.print("Saida: ");

        for (num = 1; num <= valor; num++) {
            saidaTemp = saida;
            if (num == valor) {
                System.out.print(saidaTemp + " = ");
            } else {
                System.out.print(saidaTemp + " + ");
            }
            saida = saida + 2;
            total += saidaTemp;
        }

        System.out.println(total);
    }

    public void solucao04() {
        int num, entrada, soma = 0, maior = 0, menor = 0;
        double media;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero de entradas: ");
        entrada = teclado.nextInt();

        for (int i = 1; i <= entrada; i++) {
            System.out.print("Digite o valor: ");
            num = teclado.nextInt();

            if (num >= 0) {
                soma += num;
                if (maior == 0 && menor == 0) {
                    maior = num;
                    menor = num;
                }
                if (num > maior) {
                    maior = num;
                    if (maior < menor) {
                        menor = maior;
                    }
                }

            }else {
                System.out.print("Valor invalido. Digite um valor maior que zero.");
            }
        }
        media = soma / entrada;
        System.out.print(String.format("Maior Número: %d\nMenor Número: %d\nValor médio: %.2f", maior, menor, media));
    }

    public void solucao05() {
        int termoUm, termoDois, valores;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número do primeiro termo: ");
        termoUm = teclado.nextInt();

        System.out.print("Digite o número do segundo termo: ");
        termoDois = teclado.nextInt();

        System.out.print("Saida: " + termoUm + "  " + termoDois + "  ");

        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 1) {
                termoUm = termoDois + termoUm;
                termoDois = termoUm - termoDois;

                System.out.print(termoUm + "  ");
                System.out.print(termoDois + "  ");
            }
        }
    }
}
