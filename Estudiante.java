/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author CARLOS MARIO
 */
public class Estudiante {
    private int cedula;
    private String nombre;

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimirArray(int []a)
    {
        for(int element:a)
            System.out.println("Elemento: " + element);
        a[0] = 20;
    }
    
}