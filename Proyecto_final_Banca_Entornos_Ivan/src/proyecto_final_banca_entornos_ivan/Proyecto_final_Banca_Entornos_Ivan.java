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
    static ArrayList<Datos_Cliente> Cuentas = new ArrayList<Datos_Cliente>();

    public static void main(String[] args) {

        //Cuentas de pruebas
        Cuentas.add(new Datos_Cliente("Juan", "Perez", "Casa", 1, 689751300, 18, 2, 0));
        Cuentas.add(new Datos_Cliente("Juan", "Perez", "Plaza", 1, 689854821, 18, 2, 10));
        int Cantidad;
        int NumCuenta;
        System.out.println("¿Las operaciones que vas a realizar son Fisicas o Digitales?");

        int Operaciones = EleccionOperaciones();
        switch (Operaciones) {
            case 1:
                int opcion = Menu();

                switch (opcion) {

                    case 0:
                        System.out.println("Cerrando");
                        break;

                    case 1:
                        MostrarCuentas();
                        System.out.println("Elige el numero de la cuenta que vayas a usar");
                        NumCuenta = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Que cantidad vas a ingresar");
                        Cantidad = sc.nextInt();
                        sc.nextLine();

                        Cuentas.get(NumCuenta).ingresar(Cantidad);
                        break;

                    case 2:
                        MostrarCuentas();
                        System.out.println("Elige el numero de la cuenta que vayas a usar");
                        NumCuenta = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Que cantidad vas a retirar");
                        Cantidad = sc.nextInt();
                        sc.nextLine();
                        Cuentas.get(NumCuenta).retirar(Cantidad);
                        break;

                    case 3:
                        System.out.println("Siga los pasos");
                        CrearPerfil();
                        break;
                    case 4:
                        ModificarlaCuenta();
                        break;
                    case 5:
                        InformacionCuenta();
                        break;

                    default:
                        System.out.println("No esta disponible actualmente esa opcion");
                        break;

                }
                break;
            case 2:
                int Opcion = MenuInternet();
                switch (Opcion) {
                    case 0:
                        System.out.println("Saliendo");
                        break;
                    case 1:
                        MostrarCuentas();
                        System.out.println("Elige el numero de la cuenta que vayas a usar");
                        NumCuenta = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Escribe la cantidad del pago");
                        Cantidad = sc.nextInt();
                        sc.nextLine();
                        Cuentas.get(NumCuenta).retirar(Cantidad);
                        break;

                    case 2:

                        break;

                    default:
                        System.out.println("No esta disponible actualmente esa opcion");
                        break;
                }
                break;
        }

    }

    public static int EleccionOperaciones() {
        int opcion;
        System.out.println("*********************************");
        System.out.println("*           Menu                *");
        System.out.println("*********************************");
        System.out.println("*   1-Fisica                    *");
        System.out.println("*********************************");
        System.out.println("*   2-Digital                   *");
        System.out.println("*********************************");
        System.out.println("*   0-Salir                     *");
        System.out.println("*********************************");
        System.out.println("Elige una opcion");
        opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    public static int Menu() {
        int Opcion;
        System.out.println("*********************************");
        System.out.println("*           Menu                *");
        System.out.println("*********************************");
        System.out.println("*   1-Ingresar                  *");
        System.out.println("*********************************");
        System.out.println("*   2-Retirar                   *");
        System.out.println("*********************************");
        System.out.println("*   3-Crear una cuenta          *");
        System.out.println("*********************************");
        System.out.println("*   4-Modificar la cuenta       *");
        System.out.println("*********************************");
        System.out.println("*   5-Información de tu cuenta  *");
        System.out.println("*********************************");
        System.out.println("*   0-Salir                     *");
        System.out.println("*********************************");
        System.out.println("Elige una opcion");
        Opcion = sc.nextInt();
        sc.nextLine();
        return Opcion;
    }

    public static int MenuInternet() {
        int Opcion;
        System.out.println("*********************************");
        System.out.println("*           Menu                *");
        System.out.println("*********************************");
        System.out.println("*   1-Realizar Pago             *");
        System.out.println("*********************************");
        System.out.println("*   2-Información de tu cuenta  *");
        System.out.println("*********************************");
        System.out.println("*   0-Salir                     *");
        System.out.println("*********************************");
        System.out.println("Elige una opcion");
        Opcion = sc.nextInt();
        sc.nextLine();
        return Opcion;
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
        System.out.println("*   3-Dirección                 *");
        System.out.println("*********************************");
        System.out.println("*   4-NIF                       *");
        System.out.println("*********************************");
        System.out.println("*   5-Telefono                  *");
        System.out.println("*********************************");
        System.out.println("*   6-Edad                      *");
        System.out.println("*********************************");
        System.out.println("Elige una opcion");
        opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
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
            System.out.println(i + " = " + Cuentas.get(i).getNombre() + Cuentas.get(i).getApellido());
        }
    }

    public static void ModificarlaCuenta() {
        int Comprobacion;
        int NumCuenta;
        int Decision;
        String Nombre;
        String Apellido;
        String Direccion;
        int NIF;
        int Telefono;
        int Edad;
        MostrarCuentas();
        System.out.println("Elige el numero de la cuenta que quieres modificar");
        NumCuenta = sc.nextInt();
        sc.nextLine();
        System.out.println("Escribe tu NIF para ver si eres tu");
        Comprobacion = sc.nextInt();
        sc.nextLine();
        if (Comprobacion == Cuentas.get(NumCuenta).getNif()) {

            System.out.println("¿Que quieres modificar algo de tu cuenta?");
            Decision = sc.nextInt();
            sc.nextLine();
            int opcion = MenuModificar();

            switch (opcion) {
                case 1:
                    System.out.println("Escribe tu nuevo Nombre");
                    Nombre = sc.nextLine();
                    Cuentas.get(NumCuenta).setNombre(Nombre);
                    break;

                case 2:
                    System.out.println("Escribe tu nuevo Apellido");
                    Apellido = sc.nextLine();
                    Cuentas.get(NumCuenta).setApellido(Apellido);
                    break;

                case 3:
                    System.out.println("Escribe tu nueva direccion Direccion");
                    Direccion = sc.nextLine();
                    Cuentas.get(NumCuenta).setDireccion(Direccion);
                    break;

                case 4:
                    System.out.println("Escribe tu nuevo NIF");
                    NIF = sc.nextInt();
                    sc.nextLine();
                    Cuentas.get(NumCuenta).setNif(NIF);
                    break;

                case 5:
                    System.out.println("Escribe tu nuevo numero de Telefono");
                    Telefono = sc.nextInt();
                    sc.nextLine();
                    Cuentas.get(NumCuenta).setTelefono(Telefono);
                    break;

                case 6:
                    System.out.println("Escribe tu Edad Actual");
                    Edad = sc.nextInt();
                    sc.nextLine();
                    Cuentas.get(NumCuenta).setEdad(Edad);
                    break;

            }
        } else {
            System.out.println("No eres tu");
        }

    }

    public static void InformacionCuenta() {
        int NumCuenta;
        int NIF;
        MostrarCuentas();
        System.out.println("Elige el numero de tu cuenta");
        NumCuenta = sc.nextInt();
        sc.nextLine();
        System.out.println("Escribe tu NIF para ver si eres tu");
        NIF = sc.nextInt();
        sc.nextLine();
        if (NIF == Cuentas.get(NumCuenta).getNif()) {
            System.out.println(Cuentas.get(NumCuenta).toString());
        } else {
            System.out.println("No eres tu realmente");
        }
    }

    public static void SaldoMedio() {
        int NumCuenta;
        int NIF;
        MostrarCuentas();
        System.out.println("Elige el numero de tu cuenta");
        NumCuenta = sc.nextInt();
        sc.nextLine();
        System.out.println("Escribe tu NIF para ver si eres tu");
        NIF = sc.nextInt();
        sc.nextLine();
    }

}
