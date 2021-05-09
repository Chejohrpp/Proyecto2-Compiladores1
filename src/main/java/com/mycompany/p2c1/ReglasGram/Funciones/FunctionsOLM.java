/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p2c1.ReglasGram.Funciones;

import com.mycompany.p2c1.ReglasGram.Token;

/**
 *
 * @author sergi
 */
public class FunctionsOLM {
    
    public FunctionsOLM(){
        
    }
    
    public String and(Token expr1, Token expr2){
        if (expr1.getNombreToken().equals(expr2.getNombreToken())) {
            if (expr1.getNombreToken().equals("boolean")) {
                if (expr1.getLexema().equals(expr2.getLexema())) {
                    if (expr1.getLexema().equals("true")) {
                        return "true";
                    }else{
                        return "false";
                    }
                }else{
                    return "false";
                }
            }
        }
        return  null;
    }
    
    public String or(Token expr1, Token expr2){
        if (expr1.getNombreToken().equals(expr2.getNombreToken())) {
            if (expr1.getNombreToken().equals("boolean")) {
                if (expr1.getLexema().equals("true")) {
                    return "true";
                }else if(expr2.getLexema().equals("true")){
                    return "true";
                }else{
                    return "false";
                }
            }
        }
        return  null;
    }
    public String menQ(Token expr1, Token expr2){
        try{
            if (expr1.getNombreToken().equals(expr2.getNombreToken())) {
                if (expr1.getNombreToken().equals("integer")) {
                    int dato1 = Integer.parseInt(expr1.getLexema());
                    int dato2 = Integer.parseInt(expr2.getLexema());
                    if (dato1 < dato2) {
                        return "true";
                    }else{
                        return "false";
                    }
                }else if(expr1.getNombreToken().equals("decimal")){                    
                    Double dato1 = Double.parseDouble(expr1.getLexema());
                    Double dato2 = Double.parseDouble(expr2.getLexema());
                    if (dato1 < dato2) {
                        return "true";
                    }else{
                        return "false";
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }        
        return  null;
    }    
    public String mayQ(Token expr1, Token expr2){
        try{
            if (expr1.getNombreToken().equals(expr2.getNombreToken())) {
                if (expr1.getNombreToken().equals("integer")) {
                    int dato1 = Integer.parseInt(expr1.getLexema());
                    int dato2 = Integer.parseInt(expr2.getLexema());
                    if (dato1 > dato2) {
                        return "true";
                    }else{
                        return "false";
                    }
                }else if(expr1.getNombreToken().equals("decimal")){                    
                    Double dato1 = Double.parseDouble(expr1.getLexema());
                    Double dato2 = Double.parseDouble(expr2.getLexema());
                    if (dato1 > dato2) {
                        return "true";
                    }else{
                        return "false";
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }        
        return  null;
    }    
    public String menIgual(Token expr1, Token expr2){
        try{
            if (expr1.getNombreToken().equals(expr2.getNombreToken())) {
                if (expr1.getNombreToken().equals("integer")) {
                    int dato1 = Integer.parseInt(expr1.getLexema());
                    int dato2 = Integer.parseInt(expr2.getLexema());
                    if (dato1 <= dato2) {
                        return "true";
                    }else{
                        return "false";
                    }
                }else if(expr1.getNombreToken().equals("decimal")){                    
                    Double dato1 = Double.parseDouble(expr1.getLexema());
                    Double dato2 = Double.parseDouble(expr2.getLexema());
                    if (dato1 <= dato2) {
                        return "true";
                    }else{
                        return "false";
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }        
        return  null;
    }
    public String mayIgual(Token expr1, Token expr2){
        try{
            if (expr1.getNombreToken().equals(expr2.getNombreToken())) {
                if (expr1.getNombreToken().equals("integer")) {
                    int dato1 = Integer.parseInt(expr1.getLexema());
                    int dato2 = Integer.parseInt(expr2.getLexema());
                    if (dato1 >= dato2) {
                        return "true";
                    }else{
                        return "false";
                    }
                }else if(expr1.getNombreToken().equals("decimal")){                    
                    Double dato1 = Double.parseDouble(expr1.getLexema());
                    Double dato2 = Double.parseDouble(expr2.getLexema());
                    if (dato1 >= dato2) {
                        return "true";
                    }else{
                        return "false";
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }        
        return  null;
    }

    public String diferente(Token expr1, Token expr2){
        if (expr1.getNombreToken().equals(expr2.getNombreToken())) {
            if (!expr1.getLexema().equals(expr2.getLexema())) {
                return "true";
            }else{
                return "false";
            }
        }
        return  null;
    }
    public String igual(Token expr1, Token expr2){
        if (expr1.getNombreToken().equals(expr2.getNombreToken())) {
            if (expr1.getLexema().equals(expr2.getLexema())) {
                return "true";
            }else{
                return "false";
            }
        }
        return  null;
    }
    
    public Token suma(Token expr1, Token expr2){
        try{
            String tipo1 = expr1.getNombreToken();
            String tipo2 = expr2.getNombreToken();            
            if (tipo1.equals(tipo2)) {
                if (tipo1.equals("string")) {
                    expr1.setNombreToken("string");
                    expr1.setLexema(expr1.getLexema() + expr2.getLexema());
                    return expr1;
                }
                if (tipo1.equals("boolean")) {
                    expr1.setLexema(or(expr1,expr2));
                    return expr1;
                }
                if (tipo1.equals("integer")) {
                    int dato1 = Integer.parseInt(expr1.getLexema());
                    int dato2 = Integer.parseInt(expr2.getLexema());
                    expr1.setLexema(String.valueOf(dato1+dato2));
                    return expr1;
                }
                if (tipo1.equals("decimal")) {
                    Double dato1 = Double.parseDouble(expr1.getLexema());
                    Double dato2 = Double.parseDouble(expr2.getLexema());                       
                    expr1.setLexema(String.valueOf(dato1+dato2));
                    return expr1;
                }
                if (tipo1.equals("char")) {
                    char dat = expr1.getLexema().charAt(0);
                    int dato1 = (int) dat;
                    dat = expr2.getLexema().charAt(0);
                    int dato2 = (int) dat;         
                    expr1.setNombreToken("integer");
                    expr1.setLexema(String.valueOf(dato1+dato2));
                    return expr1;
                }
            }            
            switch(tipo1){
                case "integer":{
                    int dato1 = Integer.parseInt(expr1.getLexema());
                    switch(tipo2){
                        case "decimal":{                            
                            Double dato2 = Double.parseDouble(expr2.getLexema());
                            expr1.setNombreToken("decimal");
                            expr1.setLexema(String.valueOf(dato1+dato2));
                            return expr1;
                        }
                        case "string":{
                            expr1.setNombreToken("string");
                            expr1.setLexema(expr1.getLexema() + expr2.getLexema());
                            return expr1;
                        }
                        case "char":{
                            char dat = expr2.getLexema().charAt(0);
                            int dato2 = (int) dat;
                            expr1.setLexema(String.valueOf(dato1+dato2));
                            return expr1;
                        }
                        case "boolean":{
                            int dato2 = convertBooleanInt(expr2.getLexema());
                            expr1.setLexema(String.valueOf(dato1+dato2));
                            return expr1;
                        }
                        default:return null;
                    }
                }
                case "decimal":{
                    Double dato1 = Double.parseDouble(expr1.getLexema());
                    switch(tipo2){
                        case "integer":{
                            int dato2 = Integer.parseInt(expr2.getLexema());
                            expr1.setLexema(String.valueOf(dato1+dato2));
                            return expr1;
                        }
                        case "string":{
                            expr1.setNombreToken("string");
                            expr1.setLexema(expr1.getLexema() + expr2.getLexema());
                            return expr1;
                        }
                        case "char":{
                            char dat = expr2.getLexema().charAt(0);
                            int dato2 = (int) dat;
                            expr1.setLexema(String.valueOf(dato1+dato2));
                            return expr1;
                        }
                        case "boolean":{
                            int dato2 = convertBooleanInt(expr2.getLexema());
                            expr1.setLexema(String.valueOf(dato1+dato2));
                            return expr1;
                        }
                        default:return null;
                    }
                }
                case "string":{                    
                    switch(tipo2){
                        case "integer":{
                            expr1.setLexema(expr1.getLexema() + expr2.getLexema());
                            return expr1;
                        }
                        case "decimal":{                            
                            expr1.setLexema(expr1.getLexema() + expr2.getLexema());
                            return expr1;
                        }
                        case "char":{
                            expr1.setLexema(expr1.getLexema() + expr2.getLexema());
                            return expr1;
                        }
                        default:return null;
                    }                    
                }
                case "char":{
                    char dat = expr1.getLexema().charAt(0);
                    int dato1 = (int) dat;
                    switch(tipo2){
                        case "integer":{
                            expr1.setNombreToken("integer");
                            int dato2 = Integer.parseInt(expr2.getLexema());
                            expr1.setLexema(String.valueOf(dato1+dato2));
                            return expr1;
                        }
                        case "decimal":{                            
                            Double dato2 = Double.parseDouble(expr2.getLexema());
                            expr1.setNombreToken("decimal");
                            expr1.setLexema(String.valueOf(dato1+dato2));
                            return expr1;
                        }
                        case "string":{
                            expr1.setNombreToken("string");
                            expr1.setLexema(expr1.getLexema() + expr2.getLexema());
                            return expr1;
                        }
                        case "boolean":{
                            int dato2 = convertBooleanInt(expr2.getLexema());
                            expr1.setNombreToken("integer");
                            expr1.setLexema(String.valueOf(dato1+dato2));
                            return expr1;
                        }
                        default:return null;
                    }                    
                }
                case "boolean":{
                int dato1 = convertBooleanInt(expr1.getLexema());
                    switch(tipo2){
                        case "integer":{
                            int dato2 = Integer.parseInt(expr2.getLexema());
                            expr1.setNombreToken("integer");
                            expr1.setLexema(String.valueOf(dato1+dato2));
                            return expr1;
                        }
                        case "decimal":{                            
                            Double dato2 = Double.parseDouble(expr2.getLexema());
                            expr1.setNombreToken("decimal");
                            expr1.setLexema(String.valueOf(dato1+dato2));
                            return expr1;
                        }
                        case "char":{
                            char dat = expr2.getLexema().charAt(0);
                            int dato2 = (int) dat;
                            expr1.setNombreToken("integer");
                            expr1.setLexema(String.valueOf(dato1+dato2));
                            return expr1;
                        }
                        default:return null;
                    }                    
                }
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    private int convertBooleanInt(String e){
        if (e.equals("true")) {
            return 1;
        }
        return 0;
    }
    
    public Token resta(Token expr1, Token expr2){
        try{
            String tipo1 = expr1.getNombreToken();
            String tipo2 = expr2.getNombreToken();            
            if (tipo1.equals(tipo2)) {
                if (tipo1.equals("integer")) {
                    int dato1 = Integer.parseInt(expr1.getLexema());
                    int dato2 = Integer.parseInt(expr2.getLexema());
                    expr1.setLexema(String.valueOf(dato1-dato2));
                    return expr1;
                }
                if (tipo1.equals("decimal")) {
                    Double dato1 = Double.parseDouble(expr1.getLexema());
                    Double dato2 = Double.parseDouble(expr2.getLexema());                       
                    expr1.setLexema(String.valueOf(dato1-dato2));
                    return expr1;
                }
                if (tipo1.equals("char")) {
                    char dat = expr1.getLexema().charAt(0);
                    int dato1 = (int) dat;
                    dat = expr2.getLexema().charAt(0);
                    int dato2 = (int) dat;         
                    expr1.setNombreToken("integer");
                    expr1.setLexema(String.valueOf(dato1-dato2));
                    return expr1;
                }
                return null;
            }            
            switch(tipo1){
                case "integer":{
                    int dato1 = Integer.parseInt(expr1.getLexema());
                    switch(tipo2){
                        case "decimal":{                            
                            Double dato2 = Double.parseDouble(expr2.getLexema());
                            expr1.setNombreToken("decimal");
                            expr1.setLexema(String.valueOf(dato1-dato2));
                            return expr1;
                        }
                        case "char":{
                            char dat = expr2.getLexema().charAt(0);
                            int dato2 = (int) dat;
                            expr1.setLexema(String.valueOf(dato1-dato2));
                            return expr1;
                        }
                        case "boolean":{
                            int dato2 = convertBooleanInt(expr2.getLexema());
                            expr1.setLexema(String.valueOf(dato1-dato2));
                            return expr1;
                        }
                        default:return null;
                    }
                }
                case "decimal":{
                    Double dato1 = Double.parseDouble(expr1.getLexema());
                    switch(tipo2){
                        case "integer":{
                            int dato2 = Integer.parseInt(expr2.getLexema());
                            expr1.setLexema(String.valueOf(dato1-dato2));
                            return expr1;
                        }
                        case "char":{
                            char dat = expr2.getLexema().charAt(0);
                            int dato2 = (int) dat;
                            expr1.setLexema(String.valueOf(dato1-dato2));
                            return expr1;
                        }
                        case "boolean":{
                            int dato2 = convertBooleanInt(expr2.getLexema());
                            expr1.setLexema(String.valueOf(dato1-dato2));
                            return expr1;
                        }
                        default:return null;
                    }
                }
                case "char":{
                    char dat = expr1.getLexema().charAt(0);
                    int dato1 = (int) dat;
                    switch(tipo2){
                        case "integer":{
                            expr1.setNombreToken("integer");
                            int dato2 = Integer.parseInt(expr2.getLexema());
                            expr1.setLexema(String.valueOf(dato1-dato2));
                            return expr1;
                        }
                        case "decimal":{                            
                            Double dato2 = Double.parseDouble(expr2.getLexema());
                            expr1.setNombreToken("decimal");
                            expr1.setLexema(String.valueOf(dato1-dato2));
                            return expr1;
                        }                      
                        default:return null;
                    }                    
                }
                case "boolean":{
                int dato1 = convertBooleanInt(expr1.getLexema());
                    switch(tipo2){
                        case "integer":{
                            int dato2 = Integer.parseInt(expr2.getLexema());
                            expr1.setNombreToken("integer");
                            expr1.setLexema(String.valueOf(dato1-dato2));
                            return expr1;
                        }
                        case "decimal":{                            
                            Double dato2 = Double.parseDouble(expr2.getLexema());
                            expr1.setNombreToken("decimal");
                            expr1.setLexema(String.valueOf(dato1-dato2));
                            return expr1;
                        }                        
                        default:return null;
                    } 
                }
                default:return null;
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public Token mult(Token expr1, Token expr2){
        try{
            String tipo1 = expr1.getNombreToken();
            String tipo2 = expr2.getNombreToken();            
            if (tipo1.equals(tipo2)) {
                if (tipo1.equals("boolean")) {
                    expr1.setLexema(and(expr1,expr2));
                    return expr1;
                }
                if (tipo1.equals("integer")) {
                    int dato1 = Integer.parseInt(expr1.getLexema());
                    int dato2 = Integer.parseInt(expr2.getLexema());
                    expr1.setLexema(String.valueOf(dato1*dato2));
                    return expr1;
                }
                if (tipo1.equals("decimal")) {
                    Double dato1 = Double.parseDouble(expr1.getLexema());
                    Double dato2 = Double.parseDouble(expr2.getLexema());                       
                    expr1.setLexema(String.valueOf(dato1*dato2));
                    return expr1;
                }
                if (tipo1.equals("char")) {
                    char dat = expr1.getLexema().charAt(0);
                    int dato1 = (int) dat;
                    dat = expr2.getLexema().charAt(0);
                    int dato2 = (int) dat;         
                    expr1.setNombreToken("integer");
                    expr1.setLexema(String.valueOf(dato1*dato2));
                    return expr1;
                }
                return null;
            }            
            switch(tipo1){
                case "integer":{
                    int dato1 = Integer.parseInt(expr1.getLexema());
                    switch(tipo2){
                        case "decimal":{                            
                            Double dato2 = Double.parseDouble(expr2.getLexema());
                            expr1.setNombreToken("decimal");
                            expr1.setLexema(String.valueOf(dato1*dato2));
                            return expr1;
                        }                        
                        case "char":{
                            char dat = expr2.getLexema().charAt(0);
                            int dato2 = (int) dat;
                            expr1.setLexema(String.valueOf(dato1*dato2));
                            return expr1;
                        }
                        case "boolean":{
                            int dato2 = convertBooleanInt(expr2.getLexema());
                            expr1.setLexema(String.valueOf(dato1*dato2));
                            return expr1;
                        }
                        default:return null;
                    }
                }
                case "decimal":{
                    Double dato1 = Double.parseDouble(expr1.getLexema());
                    switch(tipo2){
                        case "integer":{
                            int dato2 = Integer.parseInt(expr2.getLexema());
                            expr1.setLexema(String.valueOf(dato1*dato2));
                            return expr1;
                        }                        
                        case "char":{
                            char dat = expr2.getLexema().charAt(0);
                            int dato2 = (int) dat;
                            expr1.setLexema(String.valueOf(dato1*dato2));
                            return expr1;
                        }
                        case "boolean":{
                            int dato2 = convertBooleanInt(expr2.getLexema());
                            expr1.setLexema(String.valueOf(dato1*dato2));
                            return expr1;
                        }
                        default:return null;
                    }
                }                
                case "char":{
                    char dat = expr1.getLexema().charAt(0);
                    int dato1 = (int) dat;
                    switch(tipo2){
                        case "integer":{
                            expr1.setNombreToken("integer");
                            int dato2 = Integer.parseInt(expr2.getLexema());
                            expr1.setLexema(String.valueOf(dato1*dato2));
                            return expr1;
                        }
                        case "decimal":{                            
                            Double dato2 = Double.parseDouble(expr2.getLexema());
                            expr1.setNombreToken("decimal");
                            expr1.setLexema(String.valueOf(dato1*dato2));
                            return expr1;
                        }                        
                        case "boolean":{
                            int dato2 = convertBooleanInt(expr2.getLexema());
                            expr1.setNombreToken("integer");
                            expr1.setLexema(String.valueOf(dato1*dato2));
                            return expr1;
                        }
                        default:return null;
                    }                    
                }
                case "boolean":{
                int dato1 = convertBooleanInt(expr1.getLexema());
                    switch(tipo2){
                        case "integer":{
                            int dato2 = Integer.parseInt(expr2.getLexema());
                            expr1.setNombreToken("integer");
                            expr1.setLexema(String.valueOf(dato1*dato2));
                            return expr1;
                        }
                        case "decimal":{                            
                            Double dato2 = Double.parseDouble(expr2.getLexema());
                            expr1.setNombreToken("decimal");
                            expr1.setLexema(String.valueOf(dato1*dato2));
                            return expr1;
                        }
                        case "char":{
                            char dat = expr2.getLexema().charAt(0);
                            int dato2 = (int) dat;
                            expr1.setNombreToken("integer");
                            expr1.setLexema(String.valueOf(dato1*dato2));
                            return expr1;
                        }
                        default:return null;
                    }                    
                }
                default:return null;
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public Token div(Token expr1, Token expr2){
        try{
            String tipo1 = expr1.getNombreToken();
            String tipo2 = expr2.getNombreToken();            
            if (tipo1.equals(tipo2)) {
                if (tipo1.equals("decimal") || tipo1.equals("integer")) {
                    expr1.setNombreToken("decimal");
                    Double dato1 = Double.parseDouble(expr1.getLexema());
                    Double dato2 = Double.parseDouble(expr2.getLexema());                       
                    expr1.setLexema(String.valueOf(dato1/dato2));
                    return expr1;
                }
                if (tipo1.equals("char")) {
                    char dat = expr1.getLexema().charAt(0);
                    double dato1 = (int) dat;
                    dat = expr2.getLexema().charAt(0);
                    double dato2 = (int) dat;         
                    expr1.setNombreToken("decimal");
                    expr1.setLexema(String.valueOf(dato1/dato2));
                    return expr1;
                }
                return null;
            }            
            switch(tipo1){
                case "integer":{
                    int dato1 = Integer.parseInt(expr1.getLexema());
                    switch(tipo2){
                        case "decimal":{                            
                            Double dato2 = Double.parseDouble(expr2.getLexema());
                            expr1.setNombreToken("decimal");
                            expr1.setLexema(String.valueOf(dato1/dato2));
                            return expr1;
                        }                        
                        case "char":{
                            char dat = expr2.getLexema().charAt(0);
                            double dato2 = (int) dat;
                            expr1.setNombreToken("decimal");
                            expr1.setLexema(String.valueOf(dato1/dato2));
                            return expr1;
                        }
                        case "boolean":{
                            double dato2 = convertBooleanInt(expr2.getLexema());
                            expr1.setNombreToken("decimal");
                            expr1.setLexema(String.valueOf(dato1/dato2));
                            return expr1;
                        }
                        default:return null;
                    }
                }
                case "decimal":{
                    Double dato1 = Double.parseDouble(expr1.getLexema());
                    switch(tipo2){
                        case "integer":{
                            int dato2 = Integer.parseInt(expr2.getLexema());
                            expr1.setLexema(String.valueOf(dato1/dato2));
                            return expr1;
                        }                        
                        case "char":{
                            char dat = expr2.getLexema().charAt(0);
                            int dato2 = (int) dat;
                            expr1.setLexema(String.valueOf(dato1/dato2));
                            return expr1;
                        }
                        case "boolean":{
                            int dato2 = convertBooleanInt(expr2.getLexema());
                            expr1.setLexema(String.valueOf(dato1/dato2));
                            return expr1;
                        }
                        default:return null;
                    }
                }                
                case "char":{
                    char dat = expr1.getLexema().charAt(0);
                    double dato1 = (int) dat;
                    switch(tipo2){
                        case "integer":{
                            expr1.setNombreToken("decimal");
                            int dato2 = Integer.parseInt(expr2.getLexema());
                            expr1.setLexema(String.valueOf(dato1/dato2));
                            return expr1;
                        }
                        case "decimal":{                            
                            Double dato2 = Double.parseDouble(expr2.getLexema());
                            expr1.setNombreToken("decimal");
                            expr1.setLexema(String.valueOf(dato1/dato2));
                            return expr1;
                        }                        
                        case "boolean":{
                            int dato2 = convertBooleanInt(expr2.getLexema());
                            expr1.setNombreToken("decimal");
                            expr1.setLexema(String.valueOf(dato1/dato2));
                            return expr1;
                        }
                        default:return null;
                    }                    
                }
                case "boolean":{
                int dato1 = convertBooleanInt(expr1.getLexema());
                    switch(tipo2){
                        case "integer":{
                            int dato2 = Integer.parseInt(expr2.getLexema());
                            expr1.setNombreToken("integer");
                            expr1.setLexema(String.valueOf(dato1/dato2));
                            return expr1;
                        }
                        case "decimal":{                            
                            Double dato2 = Double.parseDouble(expr2.getLexema());
                            expr1.setNombreToken("decimal");
                            expr1.setLexema(String.valueOf(dato1/dato2));
                            return expr1;
                        }
                        case "char":{
                            char dat = expr2.getLexema().charAt(0);
                            int dato2 = (int) dat;
                            expr1.setNombreToken("integer");
                            expr1.setLexema(String.valueOf(dato1/dato2));
                            return expr1;
                        }
                        default:return null;
                    }                    
                }
                default:return null;
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    
}
