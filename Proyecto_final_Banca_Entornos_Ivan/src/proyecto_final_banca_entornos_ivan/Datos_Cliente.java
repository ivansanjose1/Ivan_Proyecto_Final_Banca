/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_banca_entornos_ivan;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Datos_Cliente {

    static Scanner sc = new Scanner(System.in);
    /*Se desea construir una aplicación de banca en la que se gestionan las cuentas de los clientes. 
    El banco desea almacenar alguna información de los clientes como su nombre, apellidos, dirección, nif, teléfono y edad. 
    Un cliente puede tener varias cuentas en el sistema y debe poder realizar las operaciones de ingresar y retirar saldo de cada una de las cuentas. 
    Además, los clientes pueden tener tarjetas de crédito asociadas a las cuentas, con límite de retirada de saldo en cajero y límite para los pagos por Internet. 
    Cuando se retira saldo (en efectivo o se realiza un pago) se debe comprobar antes, que el saldo sea mayor que 0 al finalizar la operación en la cuenta asociada. 
    La cuenta bancaria dispone de un determinado saldo, un límite, además de una fecha de apertura. 
    Los gestores del banco pueden acceder a las cuentas de los usuarios para crear perfiles y para modificar los datos de los clientes cuando llamen por teléfono. 
    En el perfil del usuario se debe poder ver el saldo medio de la cuenta durante los últimos doce meses, así como la cantidad de pagos totales realizados con las tarjetas de los clientes.*/
    String nombre;
    String apellido;
    String direccion;
    int nif;
    int telefono;
    int edad;
    int cantidad_cuentas;
    int saldo;

    public Datos_Cliente(String nombre, String apellido, String direccion, int nif, int telefono, int edad, int cantidad_cuentas, int dinero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.nif = nif;
        this.telefono = telefono;
        this.edad = edad;
        this.cantidad_cuentas = cantidad_cuentas;
        this.saldo = dinero;
    }

    public void ingresar(int cantidad) {

        System.out.println("Escribe tu NIF para ver si eres tu");
        int Comprobacion = sc.nextInt();
        sc.nextLine();
        if (Comprobacion == this.getNif()) {
            if (cantidad <= 0) {
                System.out.println("No puedes realizar esta funcion");
            } else {
                System.out.println("Se ha ingresado la siguiente cantidad " + cantidad);
                this.saldo += cantidad;
            }
        } else {
            System.out.println("No eres tu");
        }
    }

    public void retirar(int cantidad) {

        System.out.println("Escribe tu NIF para ver si eres tu");
        int Comprobacion = sc.nextInt();
        sc.nextLine();
        if (Comprobacion == this.getNif()) {
            this.saldo -= cantidad;

            if (this.saldo < 0) {
                System.out.println("Error no puedes le delvolvemos a la cuenta la cantidad que has intentado sacar");
                this.saldo += cantidad;
            } else {
                if (cantidad<=500) {
                  System.out.println("Correcto");
                   this.saldo -= cantidad;  
                }else{
                    System.out.println("No puedes hacer pagos/retirar de esa cantidad");
                }
            }
        } else {
            System.out.println("No eres tu");
        }
    }
    
   

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidad_cuentas() {
        return cantidad_cuentas;
    }

    public void setCantidad_cuentas(int cantidad_cuentas) {
        this.cantidad_cuentas = cantidad_cuentas;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Datos_Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", nif=" + nif + ", telefono=" + telefono + ", edad=" + edad + ", cantidad_cuentas=" + cantidad_cuentas + ", saldo=" + saldo + '}';
    }

}
