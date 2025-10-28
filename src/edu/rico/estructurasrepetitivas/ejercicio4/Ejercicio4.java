package edu.rico.estructurasrepetitivas.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros_usados = new int[3];
        int numero_secreto = (int) (Math.random() * 100) + 1;
        System.out.println(numero_secreto);
        int numero_usuario;
        int iteradora = 0;
        do{
            System.out.println("Adivina un número entre 1 y 100:");
            Scanner teclado = new Scanner(System.in);
            numero_usuario = teclado.nextInt();


            //recorrer un array (vector) unidimensional
            for(int i = 0; i<numeros_usados.length; i++){
                if(numero_usuario == numeros_usados[i]){
                    System.out.println("El número ya ha sido usado. No es el número secreto");
                }else{
                    numeros_usados[i] = numero_usuario;
                }
            }

        }while(numero_secreto != numero_usuario);



    }
}
