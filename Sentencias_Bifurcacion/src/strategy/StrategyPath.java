package strategy;

import java.util.Scanner;

class Cliente{

    String membresia;

    Cliente(int num){
        membresia = switch (num){
            case 1 -> "Bronce";
            case 2 -> "Oro";
            case 3 -> "Diamante";
            default -> "Sin membresia";
        };
    }
}
public class StrategyPath {
    public static void main(String[] args) {

        System.out.println("!!!     EJEMPLO     !!!\n\n");

        int num;

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Seleccione una membresia");
            System.out.println("1. Bronce");
            System.out.println("2. Oro");
            System.out.println("3. Diamante");

            num = sc.nextInt();

            if (num > 0 && num < 4) {break;}

            System.out.println("Seleccione uno de los numeros");
        }

        Cliente cl = new Cliente(num);

        System.out.print("Ingrese el precio del producto que desea comprar: ");
        double precio = sc.nextInt();

        double descuento = switch (cl.membresia){
            case "Oro" -> 0.1;
            case "Diamante" -> 0.2;
            default -> 0;
        };

        double precio_final = precio - (precio * descuento);

        System.out.println("Precio final: " + precio_final);
    }
}
