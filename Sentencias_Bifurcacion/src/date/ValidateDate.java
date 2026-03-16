package date;

import java.util.Date;
import java.util.Scanner;

public class ValidateDate {

    public static boolean EsBisiesto(int anio){
        return (anio % 4 == 0 && anio % 100 !=0) || (anio % 400 == 0);
    }

    public static boolean ValidarFecha(int dia, int mes, int anio){
        if (mes < 1 || mes > 12) { return false; }

        int[] diasmes = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (EsBisiesto(anio)){
            diasmes[1] = 29;
        }

        return dia > 0 && dia <= diasmes[mes - 1];
    }

    public static void main(String[] args) {

        System.out.println("Escribe una fecha utilizando el formato: dd-mm-aa\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Dia: ");
        int dia = sc.nextInt();

        System.out.println("Mes: ");
        int mes = sc.nextInt();

        System.out.println("Año: ");
        int anio = sc.nextInt();

        sc.close();

        if (ValidarFecha(dia, mes, anio)){
            System.out.println("La fecha si existe");
            return;
        }
        System.out.println("La fecha no existe");
    }
}
