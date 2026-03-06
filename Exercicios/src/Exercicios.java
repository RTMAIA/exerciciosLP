import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Exercicios {

    public void mediaPonderada() {
        ArrayList<Integer> listaNumero = new ArrayList<>();
        Scanner telcado = new Scanner(System.in);
        int media;

        for (int i=0; i < 4; i++) {
            System.out.println("Digite um número:");
            listaNumero.add(telcado.nextInt());
        }
        media = (listaNumero.get(0) + listaNumero.get(1)*2 + listaNumero.get(2)*3 + listaNumero.get(3)*4)/10;
        System.out.println(String.format("A média é: %d", media));
    }

    public void inverterNumero() {
        Scanner teclado = new Scanner(System.in);
        int valor;
        char c, d, u;
        String valor_string;
        int valor_invertido;

        System.out.println("Digite um número:");
        valor = teclado.nextInt();
        valor_string = String.valueOf(valor);
        valor_invertido =  Integer.parseInt(Character.toString(valor_string.charAt(2)) + Character.toString(valor_string.charAt(1)) + Character.toString(valor_string.charAt(0)));

        System.out.println(String.format("Valor invertido: %s", valor_invertido));
    }

    public void calcularAreaLosango() {
        Scanner teclado = new Scanner(System.in);
        int diagonalMaior;
        int diagonalMenor;
        int areaDoLosango;

        System.out.println("Digite um valor para a diagonal maior:");
        diagonalMaior = teclado.nextInt();
        System.out.println("Digite um valor para a diagonal menor:");
        diagonalMenor = teclado.nextInt();

        areaDoLosango = (diagonalMaior * diagonalMenor) / 2;
        System.out.println(String.format("A área do losango é %d cm²:", areaDoLosango));
    }

    public void calcularProgressaoAritmetica() {
        // formula = a = a + (n -1) * r
        int r, primeiroTermo;
        int decimoTermo;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de razão(r): ");
        r = teclado.nextInt();
        System.out.println("Digite o valor do primeiro termo: ");
        primeiroTermo = teclado.nextInt();

        decimoTermo = primeiroTermo + (10 - 1) * r;

        System.out.println(String.format("O décimo termo é: %d", decimoTermo));


    }

    public  void calcularProgressaoGeometrica() {
        // formula = a= a.q**n-1
        int primeiroTermo;
        int q;
        int quintoTermo;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro termo: ");
        primeiroTermo = teclado.nextInt();

        System.out.println("Digite a razão(q): ");
        q = teclado.nextInt();
        quintoTermo =  primeiroTermo * (int )Math.pow(q, 5-1);

        System.out.println(String.format("O valor do quinto termo é: %d", quintoTermo));

    }

    public void calcularSalario() {
        double valorHoraAula;
        int numeroDeAula;
        double percentualDescontoINSS;
        double salario;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da hora aula:");
        valorHoraAula = teclado.nextDouble();

        System.out.println("Digite o número de aulas: :");
        numeroDeAula = teclado.nextInt();


        System.out.println("Digite o percentual do INSS:");
        percentualDescontoINSS = teclado.nextDouble();
        percentualDescontoINSS = percentualDescontoINSS / 100;

        salario = numeroDeAula * valorHoraAula;

        salario = salario - (salario * percentualDescontoINSS);
        System.out.println(String.format("O seu salario é: R$ %.2f", salario));

    }

    public void calcularMinutos() {
        String hora;
        int minutos;
        String[] letras;

        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite uma hora no formato (xx:xx): ");
        hora = teclado.next();
        letras = hora.split(":");

        minutos = ((Integer.parseInt(letras[0]) * 60) + Integer.parseInt(letras[1]));
        System.out.println(String.format("Se passaram %d minutos desde o inicio do dia.", minutos));
    }
}
