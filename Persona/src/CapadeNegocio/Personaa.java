/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapadeNegocio;

/**
 *
 * @author hp
 */
public class Personaa {
     //Atributos
    private String nombre;
    private int ci;
    private byte edad;
    private char sexo;
    //Constructor 

    public Personaa() {
    }

    public Personaa(String nombre, int ci, byte edad, char sexo) {
        this.nombre = nombre;
        this.ci = ci;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    
    ///set's
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    //Get'S
    public String getNombre() {
        return nombre;
    }

    public int getCi() {
        return ci;
    }

    public byte getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }
   ///toString(imprimir,Mostrar)

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", ci=" + ci + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
    
    public static void main(String[] args) {
    
      Personaa persona1=new Personaa();
      persona1.setNombre("Fernando");
      persona1.setCi(1234);
      persona1.setEdad((byte)23);
      persona1.setSexo('M');
      
        System.out.println(persona1.toString());  
    } 
}
