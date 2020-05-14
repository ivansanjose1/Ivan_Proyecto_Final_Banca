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
    int CantidadIngresos;
    int CantidadPagosRetiradas;
    int ContadorIngresos = 0;
    int ContadorPagosRetiradas = 0;
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
                CantidadIngresos+=cantidad;
                this.saldo += cantidad;
                ContadorIngresos++;
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
                if (cantidad <= 500) {
                    System.out.println("Correcto");
                    CantidadPagosRetiradas+=cantidad;
                    this.saldo -= cantidad;
                    ContadorPagosRetiradas++;
                } else {
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

    public int getCantidadIngresos() {
        return CantidadIngresos;
    }

    public void setCantidadIngresos(int CantidadIngresos) {
        this.CantidadIngresos = CantidadIngresos;
    }

    public int getCantidadPagosRetiradas() {
        return CantidadPagosRetiradas;
    }

    public void setCantidadPagosRetiradas(int CantidadPagosRetiradas) {
        this.CantidadPagosRetiradas = CantidadPagosRetiradas;
    }

    public int getContadorIngresos() {
        return ContadorIngresos;
    }

    public void setContadorIngresos(int ContadorIngresos) {
        this.ContadorIngresos = ContadorIngresos;
    }

    public int getContadorPagosRetiradas() {
        return ContadorPagosRetiradas;
    }

    public void setContadorPagosRetiradas(int ContadorPagosRetiradas) {
        this.ContadorPagosRetiradas = ContadorPagosRetiradas;
    }
    

    @Override
    public String toString() {
        return "Datos_Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", nif=" + nif + ", telefono=" + telefono + ", edad=" + edad + ", cantidad_cuentas=" + cantidad_cuentas + ", saldo=" + saldo + '}';
    }

}
