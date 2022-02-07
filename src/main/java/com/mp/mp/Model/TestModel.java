// package com.mp.mp.Model;

// import java.io.Serializable;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// @Entity
// public class TestModel implements Serializable {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;

//     @Column(name="nombre")
//     private String nombre;

//     @Column(name="apellido")
//     private String apellido;

//     public TestModel(){}

//     public TestModel(int id, String nombre, String apellido){
//         this.id = id;
//         this.nombre = nombre;
//         this.apellido = apellido;
//     }

//     public int getId(){
//         return id;
//     }

//     public String getNombre(){
//         return nombre;
//     }

//     public String getApellido(){
//         return apellido;
//     }

//     public void setId(int id){
//         this.id = id;
//     }

//     public void setNombre(String nombre){
//         this.nombre = nombre;
//     }

//     public void setApellido(String apellido){
//         this.apellido = apellido;
//     }
// }
