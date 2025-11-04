package edu.rico.estructurasrepetitivas.ejercicio4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws InterruptedException {
        int[] numeros_usados = new int[100];
        int numero_secreto = (int) (Math.random() * 100) + 1;
        System.out.println(numero_secreto);
        int numero_usuario;
        int it = 0;

        do{
            System.out.println("Adivina un número entre 1 y 100:");
            Scanner teclado = new Scanner(System.in);
            //recogemos número usuario
            numero_usuario = teclado.nextInt();
            boolean repetido = false;


            //recorrer un array (vector) unidimensional
            for(int i = 0; i<numeros_usados.length; i++) {
                //comprobamos si el número existe -> mensaje repeticion
                if (numero_usuario == numeros_usados[i]) {
                    repetido = true;
                }
            }
            if(!repetido) {
                numeros_usados[it] = numero_usuario;
                it++;
            }

        }while((numero_secreto != numero_usuario) && (it < numeros_usados.length));

        if(numero_secreto == numero_usuario){
            System.out.println("Has acertado! el número secreto era: " + numero_secreto);
            System.out.println("Has utilizado " + it + " intentos para acertar");
            for(int i = 0; i<3; i++){
                Thread.sleep(1000);
                System.out.println("FELICIDADES");
            }


        }else{
            System.out.println("PROGRAMA FINALIZADO, USASTE " + numeros_usados.length + " NÚMEROS");
        }
        System.out.println("NUMEROS USADOS POR EL USUARIO");
        for(int i = 0; i<numeros_usados.length; i++){
            System.out.println(numeros_usados[i]);
        }



    }
}
