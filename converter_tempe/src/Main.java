import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c1 = " ";
        do {
            System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
            System.out.println("------------------------------------------------");
            System.out.println("Choisissez le mode de conversion :");
            System.out.println("1 - Convertisseur Celsius - Fahrenheit");
            System.out.println("2 - Convertisseur Fahrenheit - Celsius");
            int c2 = scanner.nextInt();
            System.out.println("Temperature a convertir :");
            float temp = scanner.nextFloat();
            double result;
            if (c2 == 1) {
                result = arrondi(((float) 9 / 5) * temp + 32, 2);
                System.out.println(temp + "°C correspond a : " + result + "°F");

            } else {
                result = arrondi((float) ((temp - 32) * 5) / 9, 2);
                System.out.println(temp + "°F correspond a : " + result + "°C");
            }
            System.out.println("Souhaitez-vous convertir une autre temperature ? (y/n)");
            c1 = scanner.next();
        } while (Objects.equals(c1, "y"));
    }

    public static double arrondi(double A, int B){
        return (double) ((int) (A * Math.pow(10, B) + .5))/ Math.pow(10, B);
    }

}