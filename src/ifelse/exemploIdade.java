package ifelse;

import java.util.Scanner;

public class exemploIdade {

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, digite sua idade: ");
        int idade = teclado.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);


    }

    public static String getIdade(int idade) {

        if (idade >=0 && idade<= 5){
            return "Voce é bebe ";
        } else if (idade >=6 && idade <= 10){
            return "Voce é criança ";
        } else if (idade >=11 && idade <= 18 ) {
            return "Voce é  adolecente ";
        } else {
            return "Voce é Adulto ";
        }
    }

}
