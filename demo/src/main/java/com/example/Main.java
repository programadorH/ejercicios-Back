package com.example;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.example.models.Factoria;

public class Main {
    public static void main(String[] args) {

        //Creando un objeto con el constructor vacio
        Factoria fabricaUno=new Factoria();
        System.out.println(fabricaUno.getDireccion());
        fabricaUno.registrar_turno("", "");
        

        //creando un objeto con el constructor lleno
        Factoria factoriaDos=new Factoria("calle 100 sur # 40-10");







        
        //La fabrica de Nutresa Itaguí debe implementar un sistema de entrada y salida del personal a su turno de trabajo,
        //se debe capturar el nombre la cédula y la hora de ingreso

        /* Scanner leerTeclado = new Scanner(System.in);
        System.out.println("*** Sistema de entrada a fabrica itagui ***");
        System.out.println("Digita tu nombre");
        String nombre = leerTeclado.nextLine();
        System.out.println("Digita el numero de tu cedula");
        String cedula = leerTeclado.nextLine();
        LocalDateTime fecha = LocalDateTime.now();

        System.out.println("Binevenido" +nombre);
        System.out.println("Tu hora de entrada quedo registrada con exito" +fecha); */


        //La fabrica de Nutresa Itaguí debe implementar un sistema para recojer 
        //El número de horas laboradas por sus operarios en la semana, el valor de la hora 
        // es de 22.500 se ingresa el numero de horas y se entrega el valor total a pagar

       /*  System.out.println("Bienvenido al sistema de nómina");
        System.out.println("Cuantas horas trabajaste esta semana");
        Integer numeroHoras=leerTeclado.nextInt();
        Integer salario=numeroHoras*22500;
        System.out.println("Su salario es: $" +salario); */

  /*   } */
}