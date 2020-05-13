/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_banca_entornos_ivan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Proyecto_final_Banca_Entornos_Ivan {

   static Scanner sc = new Scanner(System.in);
    static ArrayList <Datos_Cliente>Cuentas=new ArrayList<Datos_Cliente>();

    public static void main(String[] args) {

        int cantidad;
        int NumCuenta;
        int opcion = menu();
        
                
        
        Cuentas.add(new Datos_Cliente("Juan", "Perez", "Casa", 1, 689751300, 18, 1, 0));
        switch (opcion) {

           case 0:
                System.out.println("Cerrando");
                break;

            case 1:
                MostrarCuentas();
                System.out.println("Elige el numero de la cuenta que vayas a usar");
                NumCuenta=sc.nextInt();
                sc.nextLine();
                System.out.println("Que cantidad vas a ingresar");
                cantidad = sc.nextInt();
                sc.nextLine();

                Cuentas.get(NumCuenta).ingresar(cantidad);
                break;

            case 2:
                MostrarCuentas();
                System.out.println("Elige el numero de la cuenta que vayas a usar");
                NumCuenta=sc.nextInt();
                sc.nextLine();
                System.out.println("Que cantidad vas a retirar");
                cantidad = sc.nextInt();
                sc.nextLine();
                Cuentas.get(NumCuenta).retirar(cantidad);
                break;

            case 3:
                System.out.println("Siga los pasos");
                CrearPerfil();
                break;
            case 4:
                
                
                break;

            default:
                System.out.println("No esta disponible actualmente esa opcion");
                break;

        }

    }

    public static int menu() {
        int opcion;
        System.out.println("*********************************");
        System.out.println("*           Menu                *");
        System.out.println("*********************************");
        System.out.println("*   1-Ingresar                  *");
        System.out.println("*********************************");
        System.out.println("*   2-Retirar                   *");
        System.out.println("*********************************");
        System.out.println("*   3-Crear una cuenta          *");
        System.out.println("*********************************");
        System.out.println("*   0-Salir                     *");
        System.out.println("*********************************");
        System.out.println("Elige una opcion");
        opcion = sc.nextInt();
        return opcion;
    }

    public static void CrearCuenta() {
        System.out.println("Cual es su nombre");
        String nombre = sc.nextLine();
        System.out.println("Cual es su apellido");
        String apellido = sc.nextLine();
        System.out.println("Cual es su direccion");
        String direccion = sc.nextLine();
        System.out.println("Cual es su nif");
        int nif = sc.nextInt();
        sc.nextLine();
        System.out.println("Cual es su telefono");
        int telefono = sc.nextInt();
        sc.nextLine();
        System.out.println("Cual es su edad");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Cantidad de cuentas que tengas");
        int cantidad_cuentas = sc.nextInt();
        sc.nextLine();
        
        Cuentas.add(new Datos_Cliente(nombre, apellido, direccion, nif, telefono, edad, cantidad_cuentas, 0));
    }
    public static void CrearPerfil() {
        System.out.println("Cual es su nombre");
        String nombre = sc.nextLine();
        System.out.println("Cual es su apellido");
        String apellido = sc.nextLine();
        System.out.println("Cual es su direccion");
        String direccion = sc.nextLine();
        System.out.println("Cual es su nif");
        int nif = sc.nextInt();
        sc.nextLine();
        System.out.println("Cual es su telefono");
        int telefono = sc.nextInt();
        sc.nextLine();
        System.out.println("Cual es su edad");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Cantidad de cuentas que tengas");
        int cantidad_cuentas = sc.nextInt();
        sc.nextLine();

        Cuentas.add(new Datos_Cliente(nombre, apellido, direccion, nif, telefono, edad, cantidad_cuentas, 0));
    }

    public static void MostrarCuentas() {
        for (int i = 0; i < Cuentas.size(); i++) {
            System.out.println(i + " = " + Cuentas.get(i).toString());
        }
    }
    
    public static void ModificarlaCuenta(){
        int NumCuenta;
        MostrarCuentas();
        System.out.println("Elige el numero de la cuenta que quieres modificar");
        NumCuenta=sc.nextInt();
        sc.nextLine();
        System.out.println("¿Que quieres modificar algo de tu cuenta?");
        int opcion = MenuModificar();
        Cuentas.get(NumCuenta).setApellido("");
    }
    
    
    
    
    public static int MenuModificar() {
        int opcion;
        System.out.println("*********************************");
        System.out.println("*       Menu Modificar          *");
        System.out.println("*********************************");
        System.out.println("*   1-Nombre                    *");
        System.out.println("*********************************");
        System.out.println("*   2-Apellido                  *");
        System.out.println("*********************************");
        System.out.println("*   3-Crear una Cuenta          *");
        System.out.println("*********************************");
        System.out.println("*   4-Dirección                 *");
        System.out.println("*********************************");
        System.out.println("*   5-NIF                       *");
        System.out.println("*********************************");
        System.out.println("*   6-Telefono                  *");
        System.out.println("*********************************");
        System.out.println("*   7-Edad                      *");
        System.out.println("*********************************");
        System.out.println("*   8-Todo                      *");
        System.out.println("*********************************");
        System.out.println("Elige una opcion");
        opcion=sc.nextInt();
        sc.nextLine();
        return opcion;
    }

}
