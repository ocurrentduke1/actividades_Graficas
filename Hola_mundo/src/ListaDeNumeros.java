import java.util.Random;
import java.util.Arrays;

public class ListaDeNumeros {

    public static void main(String[] args) {

        Random random = new Random();

        int[] arreglo = new int[10];

        for(int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100);
        }

        System.out.println("arreglo original: ");
        for(int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ",");
        }

        System.out.println("");

        Arrays.sort(arreglo);

        System.out.println("arreglo ordenado: ");
        for(int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ",");
        }
    }
}
