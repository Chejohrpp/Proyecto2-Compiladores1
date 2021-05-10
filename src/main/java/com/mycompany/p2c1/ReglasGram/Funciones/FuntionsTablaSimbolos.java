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
    
    public String buscarVariableTipo(String nameVar, int procesoDeclarado,boolean isEstruc, int processEstruc){        
        Simbolo simbol = getSimProceso(nameVar,procesoDeclarado,isEstruc,processEstruc);
        if (simbol != null) {
            return simbol.getTipo();
        }        
	return null;
    }
    
    public String getValorVariable(String nameVar, int procesoDeclarado,boolean isEstruc, int processEstruc){
        Simbolo simbol = getSimProceso(nameVar,procesoDeclarado,isEstruc,processEstruc);
        if (simbol != null) {
            return simbol.getValor();
        }        
	return null;
    }
    
    public boolean agregarSim(String identificador,String tipo, String valor, String modo, int ProcesoDecla,int poscion
            ,String procedimiento,boolean isEstruc, int processEstruc){
        if ((getSimProceso(identificador,ProcesoDecla,isEstruc,processEstruc) == null)) {
            Simbolo simbol = new Simbolo(identificador,tipo,valor,modo);
            if (modo.equals("GLOBAL")) {
                simbol.setProcesoDeclarado(0);
            }else{
                simbol.setProcesoDeclarado(ProcesoDecla);
            }            
            simbol.setNoEjecucion(0);
            simbol.setPosicion(poscion);
            simbol.setProcedimiento(procedimiento);
            if (isEstruc) {
                System.out.println("Esta en una estructura: " + identificador);
                simbol.setProcesoDeclaradoEstruc(processEstruc);
            }else{
                simbol.setProcesoDeclaradoEstruc(-1);
            }
            listaSimbolos.add(simbol);
            return true;
        }
        return false;
    }
    
    public boolean addValor(String nameVar, int proceso,String valor, boolean isEstruc, int processEstruc){
       /* for (Simbolo listaSimbolo : listaSimbolos) {
            if (listaSimbolo.getIdentificador().equals(nameVar) && (listaSimbolo.getProcesoDeclarado() == proceso || listaSimbolo.getProcesoDeclarado() == 0) ) {
                listaSimbolo.setValor(valor);
                return true;
            }
        }*/
       Simbolo simbol = getSimProceso(nameVar,proceso,isEstruc,processEstruc);
       if (simbol != null) {
           simbol.setValor(valor);
            return true;
        }
        return false;
    }
    public boolean addOneEjecucion(String nameVar, int proceso,boolean isEstruc, int processEstruc){
        /*for (Simbolo listaSimbolo : listaSimbolos) {
            if (listaSimbolo.getIdentificador().equals(nameVar) && (listaSimbolo.getProcesoDeclarado() == proceso || listaSimbolo.getProcesoDeclarado() == 0) ) {
                listaSimbolo.setNoEjecucion(listaSimbolo.getNoEjecucion() + 1 );
                return true;
            }
        }*/
        Simbolo simbol = getSimProceso(nameVar,proceso,isEstruc,processEstruc);
       if (simbol != null) {
           simbol.setNoEjecucion(simbol.getNoEjecucion() + 1);
            return true;
        }
        return false;
    }
    
    public void addValorDefecto(String nameVar, int proceso,boolean isEstruc, int processEstruc){
       /* for (Simbolo listaSimbolo : listaSimbolos) {
            if (listaSimbolo.getIdentificador().equals(nameVar) && (listaSimbolo.getProcesoDeclarado() == proceso || listaSimbolo.getProcesoDeclarado() == 0) ) {
                switch(listaSimbolo.getTipo()){
                    case "integer": case "decimal" :{
                        listaSimbolo.setValor("0");
                        break;
                    }
                    case "char":{
                        listaSimbolo.setValor("a");
                        break;
                    }
                    case "string":{
                        listaSimbolo.setValor("");
                        break;
                    }
                    case "boolean":{
                        listaSimbolo.setValor("true");
                        break;
                    }
                    default: break;
                }
            }
        }*/
        Simbolo simbol = getSimProceso(nameVar,proceso,isEstruc,processEstruc);
        switch(simbol.getTipo()){
            case "integer": case "decimal" :{
                simbol.setValor("0");
                break;
            }
            case "char":{
                simbol.setValor("a");
                break;
            }
            case "string":{
                simbol.setValor("");
                break;
            }
            case "boolean":{
                simbol.setValor("true");
                break;
            }
            default: break;
        }
    }
    
 /*   public Simbolo getSim(String identificador){
        for (Simbolo listaSimbolo : listaSimbolos) {
            if (listaSimbolo.getIdentificador().equals(identificador)) {
                return listaSimbolo;
            }
        }
        return null;
    }
    */
    public Simbolo getSimProceso(String identificador, int proceso, boolean isEstruc, int processEstruc){
        for (Simbolo listaSimbolo : listaSimbolos) {
            if(listaSimbolo.getIdentificador().equals(identificador)){
                if (isEstruc) {
                    if ((listaSimbolo.getProcesoDeclaradoEstruc()== processEstruc) ) {
                        return listaSimbolo;
                    }   
                }
                if ((listaSimbolo.getProcesoDeclarado() == proceso || listaSimbolo.getProcesoDeclarado() == 0) ) {
                    if(listaSimbolo.getProcesoDeclaradoEstruc() == - 1){
                        return listaSimbolo;
                    }                    
                }
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
