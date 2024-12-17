package Forwhile;

import java.util.Scanner;

public class TabuadaDoWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String resposta = "";

        do {
            System.out.println("Digite um numero para gerar tabuada: ");
            int num = teclado.nextInt();
            for (int contador = 0; contador <= 10; contador++){
                System.out.println(num + "x" + contador + "=" + num * contador);
            }
            System.out.println("Deseja gerar novamente a tabuada de algum numero? ");
            resposta = teclado.next();
        }while (resposta.equalsIgnoreCase("Sim"));

        System.out.println("Obrigada !");
    }
}
