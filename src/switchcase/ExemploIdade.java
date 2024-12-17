package switchcase;

import java.util.Scanner;

public class ExemploIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);

    }

    public static String getIdade(int idade){
        String resultado = "";

        switch (idade){
            case 0:
            case 5:
                resultado = "Voce é Bebe";
                break;

            case 6:
            case 10:
                resultado = "Voce é Criança";
                break;
            case 11:
            case 18:
                resultado= "Voce é adolecente";
                break;
            default:
                resultado = "Voce é adulto";
                break;
        }
        return resultado;
    }
}
