/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p2c1.objetos;

/**
 *
 * @author sergi
 */
public class Simbolo {
    private int posicion;
    private String identificador;
    private String tipo;
    private String valor;
    private String modo;
    private String procedimiento;
    private int noEjecucion;
    private int procesoDeclarado;

    public Simbolo(String identificador, String tipo, String valor, String modo) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.valor = valor;
        this.modo = modo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int Posicion) {
        this.posicion = Posicion;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public int getNoEjecucion() {
        return noEjecucion;
    }

    public void setNoEjecucion(int noEjecucion) {
        this.noEjecucion = noEjecucion;
    }

    public int getProcesoDeclarado() {
        return procesoDeclarado;
    }

    public void setProcesoDeclarado(int procesoDeclarado) {
        this.procesoDeclarado = procesoDeclarado;
    }
    
    
}
