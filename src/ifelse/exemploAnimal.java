package ifelse;

import java.util.Scanner;

public class exemploAnimal {

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor digite a especie do seu Pet:");
        String texto = teclado.next();
        String animal = getAnimal(texto);
        System.out.println(animal);
    }

    //**metodo para validar/pegar o 'animal'***

    private static String getAnimal(String animal) {
        String result;

        if (animal.equalsIgnoreCase("DOG") || animal.equalsIgnoreCase("CAT")){
            return  "Animal domestico";
        } else if (animal.equalsIgnoreCase("TIGER")) {
            return "Animal selvagem";
        } else {
            result = "Animal nao localizado";
        }
        return result;
    }

}
