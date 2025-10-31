package org.example;

import java.util.Scanner;

public class Paga_bronca {
    static void main() {
        Scanner teclado = new Scanner(System.in);
int contador = 1;
int valor = 50;
int resultado = 0;
String otra = "";
boolean repetir = true;
int resultadofinal = 0;
final int sin_paga = 100000;
final int paga_entera = 5000;

        System.out.println("*** BIENVENIDO A LA APP DE BRONCAS ***");

do {

    System.out.println("------------------------------");
    System.out.println("Datos de la bronca "+contador+ ":");
    System.out.println("Selecciona la persona encargada de la bronca:");
    System.out.println("[-]. Profes");
    System.out.println("[-]. Padre");
    System.out.println("[-]. Madre");
    System.out.println("[-]. Monitor (extraescolares)");
    System.out.println("[-]. Suegra");
    System.out.println("Otros");
    System.out.println("------------------------------");


    System.out.println("Elige una opción ---> ");
    String persona = teclado.next();

    switch (persona.toLowerCase()){

        case "profes":
            resultado = valor*10;
            break;

        case "padre":
        case "madre":
            resultado = valor*100;
            break;

        case "monitor":
            resultado= valor*5;
            break;

        case "suegra":
            resultado= valor*1000;
            break;

        default:
            System.out.println("Otros. No se aplica ningun multiplicador");
            resultado = valor;
            System.out.println("Puntuacion de la bronca:" +resultado);
            return;


    }

    System.out.println("Puntuación de la broca "+contador+ ": "+resultado);

    System.out.println("¿Quieres añadir otra bronca? (S/N):");
    otra = teclado.next();
//    System.out.println(otra);

    repetir = otra.equalsIgnoreCase("s");
//    System.out.println(repetir);

    if (repetir){
        contador++;
    }
    resultadofinal += resultado;


}while (repetir);


        System.out.println("Resultados semanales:");
        System.out.println("------------------------------");

        System.out.println("Puntuacion total: "+resultadofinal);




        if (resultadofinal>=sin_paga){
            System.out.println("ESTA SEMANA SIN PAGA");
        } else if (resultadofinal>paga_entera) {
            System.out.println("ESTA SEMANA MEDIA PAGA");

        }else {
            System.out.println("ESTA SEMANA TE LIBRAS");
        }

    }
}
