package com.mp.mp.Model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mp.fiscalia")
public class FiscaliaModel implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFiscalia")
    private int idFiscalia;

    @Column(name="telefono")
    private String telefono;

    @Column(name="zona")
    private String zona;

    @Column(name="calle")
    private String calle;

    @Column(name="nombreFiscalia")
    private String nombreFiscalia;

    @Column(name="idmunicipio")
    private int idmunicipio;



    public FiscaliaModel(){}

    public FiscaliaModel(int idFiscalia, String telefono, String zona ,String calle, String nombreFiscalia , int idmunicipio ){
        this.idFiscalia = idFiscalia;
        this.telefono = telefono;
        this.zona = zona;
        this.calle = calle;
        this.nombreFiscalia = nombreFiscalia;
        this.idmunicipio = idmunicipio;
    }


    public int getIdFiscalia() {
        return this.idFiscalia;
    }

    public void setIdFiscalia(int idFiscalia) {
        this.idFiscalia = idFiscalia;
    }
    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getZona() {
        return this.zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    public String getCalle() {
        return this.calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNombreFiscalia() {
        return this.nombreFiscalia;
    }

    public void setNombreFiscalia(String nombreFiscalia) {
        this.nombreFiscalia = nombreFiscalia;
    }
    public int getIdmunicipio() {
        return this.idmunicipio;
    }

    public void setIdmunicipio(int idmunicipio) {
        this.idmunicipio = idmunicipio;
    }


}
