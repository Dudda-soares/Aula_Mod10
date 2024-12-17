package Forwhile;

import java.util.Scanner;

public class TabuadaFor {

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero para gerar a tabuada: ");
        int num = teclado.nextInt();

        for (int i = 0 ; i <= 10; i++){
            System.out.println(num + "x" + i + " = " + num * i );
        }


    }
}
