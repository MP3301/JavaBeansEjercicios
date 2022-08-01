/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica;

/**
 *
 * @author
 * x
 */

import java.io.Serializable;


public class Persona implements Serializable {
    
    private String nombre;
    
    private String apellido;
    
    // los javabean deben tener un constructor vacio de por ley , obligatorio para spring
    // para que se considere un java bean debe tener constructor publico
    // atributos privados
    //constructor vacio
    //get y setter publicos
    // implementar inferface serializable de java.io.Serializable;
    // para transferir de un servidor a otro debe ser serializable
    // es decir se serializa se transforma a 0z y 1z
    // necesario por eso implementar la interface serializable

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
}
