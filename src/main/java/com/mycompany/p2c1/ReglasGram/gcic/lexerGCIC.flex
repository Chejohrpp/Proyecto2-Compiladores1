/*Codigo importado*/
package com.mycompany.p2c1.ReglasGram.gcic;
import com.mycompany.p2c1.ReglasGram.Token;
import java_cup.runtime.*;
import static com.mycompany.p2c1.ReglasGram.gcic.symGCIC.*;
import java.util.ArrayList;
import java.util.List;

%%
/*configuracion*/
%class LexerGCIC
%public
%unicode
%line
%column
%cup
decimal=([0]|[1-9][0-9]*)[\.][0-9][0-9]?[0-9]?[0-9]?
entero = [0-9]+
char = [\'][^\'][\']
id_element = [\']([^\'])*[\']
cadena = [\"]([^\"])*[\"]
cadena_sin_espacios = [\"]([^\"\r\n\t\f\ ])*[\"]
string_total = [a-zA-Z\?\¿\.\@\_]+
id_variable = [a-zA-Z][a-zA-Z0-9\_]*
comentario_linea = "!!"[^\r\n\t\f]+
comentario_bloque = "<!--"([^\-]|"-"[^\-] |"--"[^\>])*"-->"

C_GCIC = [cC][_][gG][cC][iI][cC]
C_HEAD = [cC][_][hH][eE][aA][dD]
C_TITLE =  [cC][_][tT][iI][tT][lL][eE]
C_LINK =  [cC][_][lL][iI][nN][kK]
C_BODY = [cC][_][bB][oO][dD][yY]
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
C_SCRIPTING = [cC][_][sS][cC][rR][iI][pP][tT][iI][nN][gG]


process_ = "PROCESS_"
nombre_funcion = {process_}([a-zA-Z]*)

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
  return new java_cup.runtime.Symbol(symGCIC.EOF);
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

/*Script */
<YYINITIAL> {process_}			{}
<YYINITIAL> "ON_LOAD"  			{return new Symbol(ON_LOAD,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "INSERT"  			{return new Symbol(INSERT,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "getElemenById"		{return new Symbol(GET_ELEMENT_BY_ID,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
/*funciones especiales*/
<YYINITIAL> "ASC"				{return new Symbol(ASC,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "DESC"				{return new Symbol(DESC,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "LETPAR_NUM"		{return new Symbol(LETPAR_NUM,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "LETIMPAR_NUM"		{return new Symbol(LETIMPAR_NUM,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "REVERSE"			{return new Symbol(REVERSE,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "CARACTER_ALEATORIO"	{return new Symbol(CARACTER_ALEATORIO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "NUM_ALEATORIO"		{return new Symbol(NUM_ALEATORIO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "ALERT_INFO"		{return new Symbol(ALERT_INFO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "EXIT"				{return new Symbol(EXIT,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "REDIRECT"			{return new Symbol(REDIRECT,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }

<YYINITIAL> "@global"			{return new Symbol(GLOBAL,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }

/*tipos de variables*/
<YYINITIAL> "integer"			{return new Symbol(ID_INTEGER,yyline+1,yycolumn+1, new Token("int",yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "string"			{return new Symbol(ID_STRING,yyline+1,yycolumn+1, new Token("string",yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "boolean"			{return new Symbol(ID_BOOLEAN,yyline+1,yycolumn+1, new Token("boolean",yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "decimal"			{return new Symbol(ID_DECIMAL,yyline+1,yycolumn+1, new Token("decimal",yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "char"				{return new Symbol(ID_CHAR,yyline+1,yycolumn+1, new Token("char",yytext(),yyline+1,yycolumn+1 )); }


<YYINITIAL> "true"			{return new Symbol(BOOLEAN,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "false"			{return new Symbol(BOOLEAN,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }

/*sentencias*/
<YYINITIAL> "IF"				{return new Symbol(IF,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "ELSE"				{return new Symbol(ELSE,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "THEN"				{return new Symbol(THEN,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "INIT"				{return new Symbol(INIT,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "END"				{return new Symbol(END,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }

<YYINITIAL> "REPEAT"			{return new Symbol(REPEAT,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "HUNTIL"			{return new Symbol(HUNTIL,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }

<YYINITIAL> "WHILE"				{return new Symbol(WHILE,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }
<YYINITIAL> "THENWHILE"			{return new Symbol(THENWHILE,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1 )); }

/*etiquetas HTML */
<YYINITIAL> {C_GCIC}			{return new Symbol(C_GCIC,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
<YYINITIAL> {C_HEAD}			{return new Symbol(C_HEAD,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
<YYINITIAL> {C_TITLE}			{return new Symbol(C_TITLE,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
<YYINITIAL> {C_LINK}			{return new Symbol(C_LINK,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
<YYINITIAL> {C_BODY}			{return new Symbol(C_BODY,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
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
<YYINITIAL> {C_SCRIPTING}		{return new Symbol(C_SCRIPTING,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}


<YYINITIAL>{
	/*cadenas*/
	{cadena_sin_espacios}		{return new Symbol(STRING_WS,yyline+1,yycolumn+1, new Token(quitarComillas(yytext()),yyline+1,yycolumn+1));}
	{cadena}					{return new Symbol(STRING,yyline+1,yycolumn+1, new Token(quitarComillas(yytext()),yyline+1,yycolumn+1));}	
	/* otros */
	{nombre_funcion}			{return new Symbol(NOMBRE_FUNCION,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	{id_variable}				{return new Symbol(ID_VARIABLE,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	{string_total}				{return new Symbol(STRING_TOTAL,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}

	{decimal}				{return new Symbol(DECIMAL,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	{entero}				{return new Symbol(ENTERO,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	{char}					{return new Symbol(CHAR,yyline+1,yycolumn+1, new Token(quitarComillasSimples(yytext()),yyline+1,yycolumn+1));}
	
	{id_element}	{return new Symbol(ID_ELEMENT,yyline+1,yycolumn+1, new Token(quitarComillasSimples(yytext()),yyline+1,yycolumn+1));}

	/*simbolos*/
	"/"									{return new Symbol(DIAG,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"{"									{return new Symbol(LLAI,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"}"									{return new Symbol(LLAD,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	":"									{return new Symbol(DOS_PUNTOS,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"["									{return new Symbol(CORI,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"]"									{return new Symbol(CORD,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"("									{return new Symbol(PAI,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	")"									{return new Symbol(PAD,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	","									{return new Symbol(COMA,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
 	"<"									{return new Symbol(MENQ,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	">"									{return new Symbol(MAQ,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"!"									{return new Symbol(ADMIRACION,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"="									{return new Symbol(IGUAL,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"=="								{return new Symbol(IGUALACION,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"<="								{return new Symbol(MEN_QUE,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	">="								{return new Symbol(MAY_QUE,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"!="								{return new Symbol(DIFERENTE,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	";"									{return new Symbol(SEMI,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"|"									{return new Symbol(BARRA90,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"+"									{return new Symbol(SUMA,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"-"									{return new Symbol(MENOS,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"*"									{return new Symbol(MULT,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}
	"&"									{return new Symbol(AND_1,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}

	/* espacios en blanco */
	{whiteSpace}                   		{ /* ignorar */ }
	{comentario_linea}					{ /* ignorar */ }
	{comentario_bloque}					{ /* ignorar */ }
}

/* error */
    [^]                              	{return new Symbol(INVALID,yyline+1,yycolumn+1, new Token(yytext(),yyline+1,yycolumn+1));}