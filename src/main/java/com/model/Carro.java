/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author Felipe
 */
public class Carro {

    private Integer id;
    private String placa;
    private String modelo;
    
     public Carro(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }
    
    
    public Integer getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
   
    
}
