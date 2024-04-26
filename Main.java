package com.mycompany.analitica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Mascota> mascotas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        agregarMascota();
        System.out.println("");
        mostrarMascotas();
        System.out.println("Ingresel número de la mascota a eliminar de la lista: ");
        int id = sc.nextInt();
        eliminarMascotas(id);
        System.out.println("");
        mostrarMascotas();

    }

    static void agregarMascota() {
        char rpta = 'y';
        String nombre, raza;
        int id = 0;
        int edad = 0;
        do {
            System.out.println("Desea agregar una mascota  [y], [n]: ");
            rpta = sc.next().charAt(0);
            if (rpta == 'y') {
                Mascota mascota = new Mascota();//creamos un objecto de tipo mascota
                System.out.println("Ingrese el nombre de la mascota: ");
                nombre = sc.next();
                mascota.setNombre(nombre);
                System.out.println("Ingrese la raza de la mascota: ");
                raza = sc.next();
                mascota.setRaza(raza);

                id = (int) (Math.random() * 100 + 1);
                mascota.setId(id);
                edad = (int) (Math.random() * 20 + 1);
                mascota.setEdad(edad);
                mascotas.add(mascota);
            }//fin del if
        } while (rpta != 'n');

        
    }//fin del método agregar

    static void mostrarMascotas() {
        for (Mascota m : mascotas) {
            System.out.println("El Id de la mascota es: " + m.getId());
            System.out.println("El nombre de la mascota es: " + m.getNombre());
            System.out.println("La raza de la mascota es: " + m.getRaza());
            System.out.println("La edad de la mascota es: " + m.getEdad());
         }//fin del for
    }

        static void eliminarMascotas(int id) {
        for (Mascota m : mascotas) {
            if(m.getId()==id){
                mascotas.remove(m);
                break;
            }
        System.out.println("Se ha eliminado la mascota con id: " + id);
         }//fin del for
        
        
    }
}
