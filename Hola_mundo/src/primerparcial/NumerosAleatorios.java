package primerparcial;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);

        System.out.println("los numeros aleatorios son: \n" + num1 +"\n" + num2);

        if(num1 < num2){
            System.out.println("el numero mayor es: " + num2);
        } else {
            System.out.println("el numero mayor es: " + num1);
        }
    }
}
