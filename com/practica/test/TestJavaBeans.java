/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.test;

import com.practica.Persona;

/**
 *
 * @author
 * x
 */
public class TestJavaBeans {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        
    // los javabean deben tener un constructor vacio de por ley , obligatorio para spring
    // para que se considere un java bean debe tener constructor publico
    // atributos privados
    //constructor vacio
    //get y setter publicos
    // implementar inferface serializable de java.io.Serializable;
    // para transferir de un servidor a otro debe ser serializable
    // es decir se serializa se transforma a 0z y 1z
    // necesario por eso implementar la interface serializable
        
        persona.setNombre("Pancho");
        persona.setApellido("Juan");
        
        System.out.println("persona="+persona.getNombre());
        
        System.out.println("persona="+persona.getApellido());
    }
    
}
