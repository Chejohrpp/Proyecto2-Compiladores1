/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p2c1.ReglasGram.Funciones;

/**
 *
 * @author sergi
 */
public class FunctionsSpecials {
    
    public FunctionsSpecials(){
        
    }
    public String getCharRandom(){
        String code ="function charRandom() {\n";
        code += "var result           = [];\n" +
                "    var characters       = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz';\n" +
                "    var charactersLength = characters.length;";
        
        code += "for ( var i = 0; i < 1; i++ ) {\n" +
                "      result.push(characters.charAt(Math.floor(Math.random() * \n" +
                " charactersLength)));\n" +
                "   }\n" +
                "   return result.join('');\n" +
                "}\n";        
        return code;
    }
    
    public String getLetParNum(){
        return "function letParNum(palabra) {\n" +
                "var texto = \"\";\n" +
                "   for ( var i = 0; i < palabra.length; i++ ) {\n" +
                "      if(i % 2){\n" +
                "      	texto += palabra.charCodeAt(i);\n" +
                "      }else{\n" +
                "      	texto += palabra.charAt(i);\n" +
                "      }\n" +
                "   }\n" +
                "   return texto;\n" +
                "}\n";
    }
    public String getLetImparNum(){
        return "function letImparNum(palabra) {\n" +
                "var texto = \"\";\n" +
                "   for ( var i = 0; i < palabra.length; i++ ) {\n" +
                "      if((i % 2)){\n" +
                "      	texto += palabra.charAt(i);\n" +
                "      }else{      	\n" +
                "        texto += palabra.charCodeAt(i);\n" +
                "      }\n" +
                "   }\n" +
                "   return texto;\n" +
                "}\n";
    }
}
