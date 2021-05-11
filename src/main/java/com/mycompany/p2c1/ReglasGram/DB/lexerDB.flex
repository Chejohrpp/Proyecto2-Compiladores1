/*Codigo importado*/
package com.mycompany.p2c1.ReglasGram.DB;
import com.mycompany.p2c1.ReglasGram.Token;
import java_cup.runtime.*;
import static com.mycompany.p2c1.ReglasGram.DB.symDB.*;
import java.util.ArrayList;
import java.util.List;

%%
/*configuracion*/
%class LexerDB
%public
%unicode
%line
%column
%cup
cadena = "[$]"([^\[]|"["[^\$]|"[$"[^\]])*"[$]"
lineTerminator = \r|\n|\r\n
whiteSpace     = {lineTerminator} | [ \t\f]

%{
	private String quitar(String text){
		return text = text.substring(3, text.length() - 3);
	}
%}

%eofval{
  return new java_cup.runtime.Symbol(symDB.EOF);
%eofval}

%%

/* reglas gramaticales */
/*Parametros*/
<YYINITIAL> "CAPTCHAS"				{return new Symbol(CAPTCHAS,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "CAPTCHA"				{return new Symbol(CAPTCHA,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "ID"					{return new Symbol(ID,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "CODIGO_HTML"			{return new Symbol(CODIGO_HTML,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "LINK"					{return new Symbol(LINK,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "NOMBRE_CAPTCHA"		{return new Symbol(NOMBRE_CAPTCHA,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "CANT_UTILIZADOS"		{return new Symbol(CANT_UTILIZADOS,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "ACIERTOS"				{return new Symbol(ACIERTOS,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "FALLOS"				{return new Symbol(FALLOS,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "LAST_FECHA"			{return new Symbol(LAST_FECHA,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "SIMBOLOS"				{return new Symbol(SIMBOLOS,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "POSICION"				{return new Symbol(POSICION,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "IDENTIFICADOR"			{return new Symbol(IDENTIFICADOR,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "TIPO"					{return new Symbol(TIPO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "VALOR"					{return new Symbol(VALOR,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "MODO"					{return new Symbol(MODO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "PROCEDIMIENTO"			{return new Symbol(PROCEDIMIENTO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "NO_EJECUCION"			{return new Symbol(N_E,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "PROCESO_DECLARADO"		{return new Symbol(P_D,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "PROCESO_DECLARADO_ESTRUCT"		{return new Symbol(P_D_E,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }


<YYINITIAL>{
	/*cadenas*/
	{cadena}					{return new Symbol(STRING,yyline+1,yycolumn+1, new Token(quitar(yytext()),yyline+1,yycolumn+1));}
	/*simbolos*/
	"{"									{return new Symbol(LLAI,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"}"									{return new Symbol(LLAD,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
 	"("									{return new Symbol(PAI,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	")"									{return new Symbol(PAD,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"="									{return new Symbol(IGUAL,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	":"									{return new Symbol(DOS_PUNTOS,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	";"									{return new Symbol(SEMI,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}

	/* espacios en blanco */
	{whiteSpace}                   		{ /* ignorar */ }
}

/* error */
    [^]                              	{return new Symbol(INVALID,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}