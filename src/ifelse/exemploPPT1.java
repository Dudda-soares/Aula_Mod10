package ifelse;

import java.util.Scanner;

public class exemploPPT1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int result = teclado.nextInt();

        if (result > 10){
            System.out.println("Resultado maior que 10");
        } else {
            System.out.println("Resultado menor que 10");
        }

    }
}