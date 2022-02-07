package com.mp.mp.Model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mp.mun")
public class MunicipioModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idMunicipio")
    private int idMunicipio;


    @Column(name="nombreMunicipio")
    private String nombreMunicipio;

    @Column(name="iddepartamento")
    private int iddepartamento;

    
    public MunicipioModel(){}

    public MunicipioModel(int idMunicipio, String nombreMunicipio, int iddepartamento){
        this.idMunicipio = idMunicipio;
        this.nombreMunicipio = nombreMunicipio;
        this.iddepartamento = iddepartamento;
    }

    public int getIdMunicipio() {
        return this.idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
    
    public String getNombreMunicipio() {
        return this.nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }
    public int getIddepartamento() {
        return this.iddepartamento;
    }

    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }
}
