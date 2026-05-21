import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean draw = isDraw(a, b, c);
        int higher = max(a, b,c); /* esses parametros vão parar lá em x, y, z */ /* CHAMOU A FUNÇÃO AQUI */

        showResult(higher, draw);

        scanner.close();
    }

    public static int max(int x, int y, int z) { /* Repare que aqui ele não usa void, devido a função retornar um valor inteiro */

        int aux = 0;

        if (x > y && x > z) {
            aux = x;
        } else if (y > z ) {
            aux = y;
        } else {
            aux = z;
        }

        return aux;
    }

    public static boolean isDraw (int x, int y, int z) {

        return x == y || x == z || y == z;
    }

    /* criação de uma função que recebe numeros inteiros, os valores que recebem não precisam ter o mesmo nome da variável anterior */

    public static void showResult(int value, /* Recebe um número inteiro (HIGHER) */ boolean draw) { /* Aqui utilizamos o void, pois não retorna valor, apenas informa uma mensagem na tela */
        if (draw) {
            System.out.println("EMPATE! Valor = " + value);
        } else {
            System.out.println("HIGHER = " + value);
        }
    }

}