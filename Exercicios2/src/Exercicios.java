import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Scanner;

public class Exercicios {

    public void verificarPositivoNegativoNeutro() {
        Scanner teclado = new Scanner(System.in);
        int entrada;

        System.out.println("Digite um numero inteiro: ");
        entrada = teclado.nextInt();

        if (entrada == 0) {
            System.out.println(String.format("O numero <%d> é NEUTRO.", entrada));
        } else {
            if (entrada > 0) {
                System.out.println(String.format("O numero <%d> é POSITIVO.", entrada));
            } else {
                System.out.println(String.format("O numero <%d> é NEGATIVO.", entrada));
            }
        }
    }

    public void retornarMaiorEMenorValor() {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, maiorValor, menorValor;

        System.out.println("Digite um numero inteiro: ");
        a = teclado.nextInt();

        System.out.println("Digite um numero inteiro: ");
        b = teclado.nextInt();

        System.out.println("Digite um numero inteiro: ");
        c = teclado.nextInt();

        maiorValor = a;
        menorValor = a;

        if (b > maiorValor) {
            maiorValor = b;
        } else {
            menorValor = b;
        }
        if (c > maiorValor) {
            maiorValor = c;
        } else {
            if (c < menorValor) {
                menorValor = c;
            }
        }
        System.out.println(String.format("O maior valor é: %d\nO menor valor é: %d", maiorValor, menorValor));

    }

    public void verificarImparOuPar() {
        Scanner teclado = new Scanner(System.in);
        int entrada;

        System.out.println("Digite um numero inteiro: ");
        entrada = teclado.nextInt();

        if (entrada % 2 == 1) {
            System.out.println(String.format("O numero <%d> é impar.", entrada));
        } else {
            System.out.println(String.format("O numero <%d> é par.", entrada));

        }
    }

    public void VerificarIdade() {
        Scanner teclado = new Scanner(System.in);
        int idade;

        System.out.println("Digite a idade (anos): ");
        idade = teclado.nextInt();

        if (idade >= 60) {
            System.out.println("— Idoso");
        } else {
            if (idade >= 18 && idade <= 59) {
                System.out.println("— Adulto");
            } else {
                if (idade >= 12 && idade <= 17) {
                    System.out.println("— Adolescente");
                } else {
                    if (idade <= 11 && idade > 0) {
                        System.out.println("— Criança");
                    } else {
                        System.out.println("Idade Inválida.");

                    }
                }
            }
        }
    }

    public void verificarTriangulo() {
        int valor, unidade, dezena, centena;
        Scanner telcado = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        valor = telcado.nextInt();

        unidade = valor / 100;
        dezena = (valor / 10) % 10;
        centena = valor % 10;

        if (Integer.toString(valor).length() == 3) {
            if (unidade == dezena && dezena == centena) {
                System.out.println("— Equilátero");
            } else {
                if (unidade == dezena && dezena != centena ||
                        unidade != dezena && dezena == centena ||
                        unidade == centena && centena != dezena) {
                    System.out.println("— Isósceles");
                } else {
                    System.out.println("— Escaleno");
                }
            }
        } else {
            System.out.println("— Entrada Inválida.");
        }

    }
}
