/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.proyectofinaldata;

import java.util.Scanner;

/**
 *
 * @author 2511TK0506523    
 */
public class proyectofinaldata {
    public static void  main(String[] args){
    Scanner lectura= new Scanner(System.in);
    String cliente;
    double compra1, compra2, compra3,tc,pc,resta;
    
     System.out.print("Ingresar el nombre del cliente: ");
    cliente=lectura.next();
    
    System.out.print("Ingresar compra1: ");
    compra1=lectura.nextDouble();
    System.out.print("Ingresar compra2: ");
    compra2=lectura.nextDouble();
    System.out.print("Ingresar compra3: ");
    compra3=lectura.nextDouble();
    
    tc= compra1+compra2+compra3;
    pc=tc/3;
    resta=compra3-compra2;
    System.out.println("Total de compras: "+tc);
    System.out.println("Promedio compras:"+pc);
     System.out.println("resta de compra3 con compra2 : "+resta);

    }
}


