/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author pc06
 */
public class Perro {

    private String nombre;
    private int edad;
    private String raza;
    
    public Perro(){}
    
    public void setNombre (String n){
        this.nombre = n;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setEdad (int a){
        this.edad = a;
    }
    
    public int getEdad (){
        return this.edad; 
    }
    
    public void setRaza (String b){
        this.raza = b;
    }
    
    public String getRaza (){
        return this.raza;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1;
        int i;
        Perro labrador[]= new Perro[a];
        for (i=0;i<labrador.length;i++){
            labrador [i]=new Perro();
            labrador [i].setNombre(JOptionPane.showInputDialog("Ingrese Nombre: "));
            labrador [i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese edad (en años): ")));
            labrador [i].setRaza(JOptionPane.showInputDialog("Ingrese reza: "));     
        }
        for(i=0;i<labrador.length;i++){
            JOptionPane.showMessageDialog(null, "Nombre: "+labrador[i].getNombre()+"\n Años: "+labrador[i].getEdad()+"\n Raza"+labrador[i].getRaza());
        }
    }
    
}
