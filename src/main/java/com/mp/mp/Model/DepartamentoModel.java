package com.mp.mp.Model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mp.dep")
public class DepartamentoModel implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepartamento")
    private int idDepartamento;


    @Column(name="nombreDepartamento")
    private String nombreDepartamento;


    public DepartamentoModel(){}

    public DepartamentoModel(int idDepartamento, String nombreDepartamento){
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getIdDepartamento() {
        return this.idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    public String getNombreDepartamento() {
        return this.nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
}
