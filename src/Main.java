import java.util.Locale;
import java.util.Scanner;

public class Main {

    static Scanner key = new Scanner(System.in);;
    public static void main(String[] args) {
        ifs();
        whiles();
        doWhiles();
        fors();
        switches();
    }

    public static void ifs(){
        int numeroif;
        String resultado;
        numeroif = key.nextInt();
        if (numeroif > 0){
            resultado = "Positivo";
        } else if (numeroif < 0) {
            resultado = "Negativo";
        } else {
            resultado = "0";
        }
        System.out.println("El número " + numeroif + " es " + resultado + ".");
    }

    public static void whiles(){
        int numeroWhile;
        numeroWhile = key.nextInt();
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println("Numero While = " + numeroWhile);
        }
    }

    public static void doWhiles(){
        int numeroDoWhile;
        numeroDoWhile = key.nextInt();
        do{
            numeroDoWhile++;
            System.out.println("Numero Do While = " + numeroDoWhile);
        } while (numeroDoWhile < 3);
    }

    public static void fors(){
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
    }

    public static void switches(){
        String estacion;
        estacion = key.next();
        switch (estacion.toLowerCase()){
            case "invierno":
                System.out.println("Invierno");
                break;
            case "verano":
                System.out.println("Verano");
                break;
            case "otono":
                System.out.println("Otono");
                break;
            case "primavera":
                System.out.println("Primavera");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}