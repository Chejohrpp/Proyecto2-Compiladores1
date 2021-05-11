/*Codigo importado*/
package com.mycompany.p2c1.ReglasGram.insert;
import com.mycompany.p2c1.ReglasGram.Token;
import java_cup.runtime.*;
import static com.mycompany.p2c1.ReglasGram.insert.symInsert.*;
import java.util.ArrayList;
import java.util.List;

%%
/*configuracion*/
%class LexerInsert
%public
%unicode
%line
%column
%cup
cadena = [\"]([^\"])*[\"]
cadena_sin_espacios = [\"]([^\"\r\n\t\f\ ])*[\"]
comentario_linea = "!!"[^\r\n\t\f]+
comentario_bloque = "<!--"([^\-]|"-"[^\-] |"--"[^\>])*"-->"

C_SPAM = [cC][_][sS][pP][aA][mM]
C_INPUT =  [cC][_][iI][nN][pP][uU][tT]
C_TEXTAREA = [cC][_][tT][eE][xX][tT][aA][rR][eE][aA]
C_SELECT = [cC][_][sS][eE][lL][eE][cC][Tt]
C_OPTION = [cC][_][oO][pP][tT][iI][oO][nN]
C_DIV = [cC][_][dD][iI][vV]
C_IMG = [cC][_][iI][mM][gG]
C_BR = [cC][_][bB][rR]
C_BUTTON = [cC][_][bB][uU][tT][tT][oO][nN]
C_H1 = [cC][_][hH][1]
C_P = [cC][_][pP]

lineTerminator = \r|\n|\r\n
whiteSpace     = {lineTerminator} | [ \t\f]

%{
	private String quitarComillas(String text){
		return text.replace("\"","");
	}
	private String quitarComillasSimples(String text){
		return text.replace("\'","");
	}

	List<String> errores = new ArrayList<String>();

     private void estructuraError(String charError, int linea, int columna){
     	String elError = "Error: No se reconoce el caracter: " + charError + " -> {Linea: "+ linea +", Columna: "+ columna +" }" ;
     	errores.add(elError);
     }

     public List getErroresLexicos(){
     	return errores;
     }
%}

%eofval{
  return new java_cup.runtime.Symbol(symInsert.EOF);
%eofval}

%%

/* reglas gramaticales */
/*Parametros*/
<YYINITIAL> "href"				{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "background"		{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "color"				{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "font-size"			{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "font-family"		{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "text-align"		{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "type"				{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "id"				{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "name"				{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "cols"				{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "rows"				{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "class"				{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "src"				{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "width"				{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "height"			{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "alt"				{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "onclick"			{return new Symbol(PARAMETRO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }

/*etiquetas HTML */
<YYINITIAL> {C_SPAM}			{return new Symbol(C_SPAM,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
<YYINITIAL> {C_INPUT}			{return new Symbol(C_INPUT,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
<YYINITIAL> {C_TEXTAREA}		{return new Symbol(C_TEXTAREA,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
<YYINITIAL> {C_SELECT}			{return new Symbol(C_SELECT,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
<YYINITIAL> {C_OPTION}			{return new Symbol(C_OPTION,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
<YYINITIAL> {C_DIV}				{return new Symbol(C_DIV,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
<YYINITIAL> {C_IMG}				{return new Symbol(C_IMG,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
<YYINITIAL> {C_BR}				{return new Symbol(C_BR,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
<YYINITIAL> {C_BUTTON}			{return new Symbol(C_BUTTON,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
<YYINITIAL> {C_H1}				{return new Symbol(C_H1,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
<YYINITIAL> {C_P}				{return new Symbol(C_P,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}


<YYINITIAL>{
	/*cadenas*/
	{cadena_sin_espacios}		{return new Symbol(STRING_WS,yyline+1,yycolumn+1, new Token(quitarComillas(yytext()),yyline+1,yycolumn+1));}
	{cadena}					{return new Symbol(STRING,yyline+1,yycolumn+1, new Token(quitarComillas(yytext()),yyline+1,yycolumn+1));}
	/*simbolos*/
	"/"									{return new Symbol(DIAG,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"["									{return new Symbol(CORI,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"]"									{return new Symbol(CORD,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}	
 	"<"									{return new Symbol(MENQ,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	">"									{return new Symbol(MAQ,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"="									{return new Symbol(IGUAL,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}

	/* espacios en blanco */
	{whiteSpace}                   		{ /* ignorar */ }
	{comentario_linea}					{ /* ignorar */ }
	{comentario_bloque}					{ /* ignorar */ }
}

/* error */
    [^]                              	{return new Symbol(INVALID,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}