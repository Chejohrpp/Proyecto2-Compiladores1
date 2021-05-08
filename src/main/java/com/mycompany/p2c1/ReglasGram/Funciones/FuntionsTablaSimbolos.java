/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p2c1.ReglasGram.Funciones;

import com.mycompany.p2c1.objetos.Simbolo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sergi
 */
public class FuntionsTablaSimbolos {
    
    private List<Simbolo> listaSimbolos;
    
    public FuntionsTablaSimbolos(){
        listaSimbolos = new ArrayList();
    }
    
    public String buscarVariableTipo(String nameVar, int procesoDeclarado){        
        Simbolo simbol = getSimProceso(nameVar,procesoDeclarado);
        if (simbol != null) {
            return simbol.getTipo();
        }        
	return null;
    } 
    
    public boolean agregarSim(String identificador,String tipo, String valor, String modo, int ProcesoDecla,int poscion,String procedimiento){
        if ((getSimProceso(identificador,ProcesoDecla) == null)) {
            Simbolo simbol = new Simbolo(identificador,tipo,valor,modo);
            if (modo.equals("GLOBAL")) {
                simbol.setProcesoDeclarado(0);
            }else{
                simbol.setProcesoDeclarado(ProcesoDecla);
            }            
            simbol.setNoEjecucion(1);
            simbol.setPosicion(poscion);
            simbol.setProcedimiento(procedimiento);
            listaSimbolos.add(simbol);
            return true;
        }
        return false;
    }
    
    public Simbolo getSim(String identificador){
        for (Simbolo listaSimbolo : listaSimbolos) {
            if (listaSimbolo.getIdentificador().equals(identificador)) {
                return listaSimbolo;
            }
        }
        return null;
    }
    
    public Simbolo getSimProceso(String identificador, int proceso){
        for (Simbolo listaSimbolo : listaSimbolos) {
            if (listaSimbolo.getIdentificador().equals(identificador) && (listaSimbolo.getProcesoDeclarado() == proceso || listaSimbolo.getProcesoDeclarado() == 0) ) {
                return listaSimbolo;
            }
        }
        return null;
    }

    public List<Simbolo> getListaSimbolos() {
        return listaSimbolos;
    }

    public void setListaSimbolos(List<Simbolo> listaSimbolos) {
        this.listaSimbolos = listaSimbolos;
    }
    
    
}
