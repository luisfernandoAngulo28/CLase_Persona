/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapadeNegocio;

/**
 * 1 Atributos
 * 2 Constructor
 * 3 set'S
 * 4 Get'S
 * 5 toString
 *
 * @author hp
 */
public class Persona {
    //Atributos
    private String nombre;
    private int ci;
    private byte edad;
    private char sexo;
    //Constructor 

    public Persona() {
        this.nombre = "";
        this.ci = 0;
        this.edad = 0;
        this.sexo = ' ';
        
    }

    public Persona(String nombre, int ci, byte edad, char sexo) {
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
        String S="";
        S=S+"Persona\n" + "nombre=" + nombre +"\n"+ ", ci=" + ci +"\n"+ ", edad=" + edad +"\n"+ ", sexo=" + sexo +"\n"+ "}";
        return S;
    }
    
    
    public static void main(String[] args) {
    
      Persona persona1=new Persona();
      persona1.setNombre("Fernando");
      persona1.setCi(1234);
      persona1.setEdad((byte)23);
      persona1.setSexo('M');
      
        System.out.println(persona1.toString());  
      //----------------------------------------
      Persona persona2=new Persona("Pedro", 12345, (byte)25, 'M');
      Persona persona3=new Persona("Maria", 11345, (byte)23, 'F');
       System.out.println(persona2.toString());
        System.out.println(persona3.toString());
        
    } 
    
}
