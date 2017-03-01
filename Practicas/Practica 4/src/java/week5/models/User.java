/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.models;

/**
 *
 * @author JoseAlejandro
 */
public class User {
    
    private final String username;
    private final String password;
    final String  email;
    final String  nombres;
    final String  apellidos;
    final String  ocupacion;


    public User(String username, String password,String email,String  nombres,String  apellidos,String  ocupacion) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ocupacion = ocupacion;
    }

    public String getUsername() {
        return this.username;
    }
        public String getEmail() {
        return this.email;
    }
        public String getNombres() {
        return this.nombres;
    }
        public String getApellidos() {
        return this.apellidos;
    }
        public String getOcupacion() {
        return this.ocupacion;
    }
        
}
