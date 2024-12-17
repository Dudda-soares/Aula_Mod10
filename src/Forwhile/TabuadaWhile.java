package Forwhile;

import java.util.Scanner;

public class TabuadaWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Deseja gerar tabuada de algum numero? ");
        String resposta = teclado.next();

        while (resposta.equalsIgnoreCase("SIM")){

            System.out.println("Por favor digite o numero para gerar a tabuada: ");
            int num = teclado.nextInt();

            for (int contador = 0; contador <= 10; contador++){
                System.out.println (num + "x" + contador + " = " + num * contador );
            }

            System.out.println("Deseja gerar um nova tabualda? ");
            resposta = teclado.next();
        }
        System.out.println("Obrigada ");

    }
}
