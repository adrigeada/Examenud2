package org.example;

import java.util.Random;

public class Suma_descendente {
    static void main() {
        Random aleatorio = new Random();
         String num = "";
         int num1= 0;
         int resultado2 = 0;

        int numero = aleatorio.nextInt(500, 100001);

        String numero_string = Integer.toString(numero);
        System.out.println("Suma descendente del número generado: "+numero);
        System.out.println(numero_string+"+");

        int longitud = numero_string.length();

        for (int i = 1 ; i< longitud; i++){
            num =numero_string.substring(i, longitud);
            num1 = Integer.parseInt(num);
            System.out.println(num.concat("+"));
            resultado2 +=  num1;
//            System.out.println(resultado2);
        }

        int resultado = numero+resultado2;
        System.out.println("="+resultado);




    }
}
