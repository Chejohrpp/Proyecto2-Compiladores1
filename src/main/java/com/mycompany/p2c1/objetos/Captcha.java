/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p2c1.objetos;

import java.util.Date;
import java.util.List;

/**
 *
 * @author sergi
 */
public class Captcha {
    
    private String id;
    private String codigoHTML;
    private String link;
    private String nombreCaptcha;
    private List<Simbolo> listaSimbolos;
    private int cantUtilizados;
    private int cantAciertos;
    private int cantFallos;
    private String lastFecha;    

    public Captcha(String id, String codigoHTML, String link,String nombreCaptcha, List<Simbolo> listaSimbolos) {
        this.id = id;
        this.codigoHTML = codigoHTML;
        this.link = link;
        this.nombreCaptcha = nombreCaptcha;
        this.listaSimbolos = listaSimbolos;
        this.cantUtilizados = 0;
        this.cantAciertos = 0;
        this.cantFallos = 0;
        this.lastFecha = "No hay fecha registrada";        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigoHTML() {
        return codigoHTML;
    }

    public void setCodigoHTML(String codigoHTML) {
        this.codigoHTML = codigoHTML;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getCantUtilizados() {
        return cantUtilizados;
    }

    public void setCantUtilizados(int cantUtilizados) {
        this.cantUtilizados = cantUtilizados;
    }

    public int getCantAciertos() {
        return cantAciertos;
    }

    public void setCantAciertos(int cantAciertos) {
        this.cantAciertos = cantAciertos;
    }

    public int getCantFallos() {
        return cantFallos;
    }

    public void setCantFallos(int cantFallos) {
        this.cantFallos = cantFallos;
    }

    public String getLastFecha() {
        return lastFecha;
    }

    public void setLastFecha(String lastFecha) {
        this.lastFecha = lastFecha;
    }

    public List<Simbolo> getListaSimbolos() {
        return listaSimbolos;
    }

    public void setListaSimbolos(List<Simbolo> listaSimbolos) {
        this.listaSimbolos = listaSimbolos;
    }

    public String getNombreCaptcha() {
        return nombreCaptcha;
    }

    public void setNombreCaptcha(String nombreCaptcha) {
        this.nombreCaptcha = nombreCaptcha;
    }
    
    
    
    
    
}
