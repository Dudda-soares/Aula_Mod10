package ifelse;

import java.util.Scanner;

public class exemploPPT2 {

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor insira um numero de 1 a 8: ");
        int result = teclado.nextInt();

        if (result > 1 && result < 5){
            System.out.println("o valor digitado " + result + " esta entre 1 e 5.");
        }else if (result >= 5 && result <= 8 ){
            System.out.println("o valor digitado " + result + " esta entre 5 e 8.");
        } else {
            System.out.println("o valor digitado incorreto, tente novamente !" );
        }
    }
}
