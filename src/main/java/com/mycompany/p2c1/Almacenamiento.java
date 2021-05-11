/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p2c1;

import com.mycompany.p2c1.ReglasGram.DB.LexerDB;
import com.mycompany.p2c1.ReglasGram.DB.ParserDB;
import com.mycompany.p2c1.objetos.Captcha;
import com.mycompany.p2c1.objetos.ReportError;
import com.mycompany.p2c1.objetos.Simbolo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergi
 */
public class Almacenamiento {
    private static final String DIRECTORIO = "CAPTCHA555";
    private static final String PATH_CAPTCHAS = getPath(DIRECTORIO + "/dbCaptchas.txt");
    
    public Almacenamiento(){
        
    }
    
    private static String getPath(String document){
        File file0 =  new File(DIRECTORIO);
        boolean bol = file0.mkdir();
        if (bol) {
            //System.out.println("El directorio si fue creado");
        }else{
            //System.out.println("El directorio no fue creado");
        }            
        File file = new File(document);        
        if (!file.exists()) {            
            try {
                file.createNewFile();
                System.out.println("path : "+file.getAbsolutePath());
            } catch (IOException ex) {
                //System.out.println("No fue creado la el archivo: " + ex.getMessage());
            }
        }
        return file.getAbsolutePath();
    }
    
    public List getListCaptchas(){
        List<Captcha> listaCaptchas =  new ArrayList<Captcha>();
        List<ReportError> errores = new ArrayList<ReportError>();
         try{
            BufferedReader bufer = new BufferedReader(new FileReader(PATH_CAPTCHAS));
            try{
                LexerDB lexico = new LexerDB(bufer);
                ParserDB parse = new ParserDB(lexico);          
                
                try {
                    parse.parse();
                } catch (Exception ex) {
                 System.out.println("error en el parser: " + ex.getMessage());
                }
                listaCaptchas = parse.getListCaptchas();
                errores = parse.getListaErrores();
                for (ReportError errore : errores) {
                    System.out.println(errore.toString());
                }
            
            }catch(Exception e){
               System.out.println("error en el lexer: " + e.getMessage());
            }
        }catch(Exception e){           
            System.out.println("error en el buffer: " + e.getMessage());
        } 
        return listaCaptchas;
    }
    public void setListCaptchas(List<Captcha> listaCaptchas){
        FileWriter fileWriter = null;
        try {
            String captchas = "CAPTCHAS : (\n";
            for (Captcha captcha : listaCaptchas) {
                captchas += " CAPTCHA : {\n";
                captchas += " ID = [$]" +  captcha.getId()+"[$];\n";
                captchas += " CODIGO_HTML = [$]" +  captcha.getCodigoHTML() +"[$];\n";
                captchas += " LINK = [$]" +  captcha.getLink() +"[$];\n";
                captchas += " NOMBRE_CAPTCHA = [$]" +  captcha.getNombreCaptcha() +"[$];\n";
                captchas += " CANT_UTILIZADOS = [$]" +  captcha.getCantUtilizados() +"[$];\n";
                captchas += " ACIERTOS = [$]" +  captcha.getCantAciertos() +"[$];\n";
                captchas += " FALLOS = [$]" +  captcha.getCantFallos() +"[$];\n";
                captchas += " LAST_FECHA = [$]" +  captcha.getLastFecha() +"[$];\n";
                captchas += " SIMBOLOS = (\n";
                for (Simbolo listaSimbolo : captcha.getListaSimbolos()) {
                    captchas += "    {\n";
                    captchas += "       POSICION = [$]" +  listaSimbolo.getPosicion() +"[$];\n";
                    captchas += "       IDENTIFICADOR = [$]" +  listaSimbolo.getIdentificador() +"[$];\n";
                    captchas += "       TIPO = [$]" +  listaSimbolo.getTipo() +"[$];\n";
                    captchas += "       VALOR = [$]" +  listaSimbolo.getValor() +"[$];\n";
                    captchas += "       MODO = [$]" +  listaSimbolo.getModo() +"[$];\n";
                    captchas += "       PROCEDIMIENTO = [$]" +  listaSimbolo.getProcedimiento() +"[$];\n";
                    captchas += "       NO_EJECUCION = [$]" +  listaSimbolo.getNoEjecucion() +"[$];\n";
                    captchas += "       PROCESO_DECLARADO = [$]" +  listaSimbolo.getProcesoDeclarado() +"[$];\n";
                    captchas += "       PROCESO_DECLARADO_ESTRUCT = [$]" +  listaSimbolo.getProcesoDeclaradoEstruc() +"[$];\n";
                    captchas += "    }\n";
                }
                captchas += "           )\n";
                captchas += "}\n";
            }   captchas += ")";
            fileWriter = new FileWriter(PATH_CAPTCHAS);
            fileWriter.write(captchas);
        } catch (IOException ex) {
            Logger.getLogger(Almacenamiento.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(Almacenamiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
