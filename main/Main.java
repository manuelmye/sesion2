package main;

import data.PersonData;
import entities.Person;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        // System.out.println("ingrese nombre:");
        // String name=input.nextLine();
        // System.out.println("Escribiste: "+name);
        int opt = 0;
        do {
        System.out.println("***** CRUD PERSON *****");
        System.out.println("1 List ");
        System.out.println("2 New ");
        System.out.println("3 Delete ");
        System.out.println("0 Exit ");
        System.out.println("Choice option: ");
        opt = input.nextInt();
        System.out.println("You chosed: " + opt);
        input.nextLine(); // Limpiar el buffer
        switch (opt) {
            case 1: 
                System.out.println("Opcion 1 eligida");
 
                Person p = new Person();
                System.out.print("ingrese nombre:");
                p.setName(input.nextLine());
                System.out.println("ingrese sexo:");
                p.setSex(input.nextLine());
 
                System.out.println();
            break;
            case 2: System.out.println("Opcion 2 elegida");
 
            break;
 
            default: System.out.println("Opcion no valida");
        }
     
        } while (opt != 0);
    }
    
}
