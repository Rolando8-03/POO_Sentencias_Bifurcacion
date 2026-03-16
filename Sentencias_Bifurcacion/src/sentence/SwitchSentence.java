package sentence;

import java.lang.reflect.ClassFileFormatVersion;
import java.util.Scanner;

public class SwitchSentence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba su nota (del 1-10) para probar el switch expression: ");

        int nota;

        nota = sc.nextInt();

        sc.close();

        String Clasificacion = switch (nota){
            case 10, 9 -> "Excelente";
            case 8, 7 -> "Muy bien";
            case 6 -> "Aprobado";
            default -> "Reprobado";
        };

        System.out.println(Clasificacion);
    }
}
