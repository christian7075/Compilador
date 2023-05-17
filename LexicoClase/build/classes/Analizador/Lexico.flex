package SoloLexico;
import static SoloLexico.Tokens.*;
%%
%class Lexico
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t \r]+
%{
    public String lexemas;
%}
%%

/* Símbolo Almohadilla */
( "#" ) {lexemas=yytext(); return Almohadilla;}

/* Palabra reservada Include */
( include ) {lexemas=yytext(); return Include; }

/* Palabra reservada Define */
( define ) {lexemas=yytext(); return Define;}

/*Palabra reservada Break */
( break ) {lexemas=yytext(); return Break;}

/* Palabra reservada Case */
( case ) {lexemas=yytext(); return Case; }

/* Palabra reservada Char */
( char ) {lexemas=yytext(); return Char;}

/* Palabra reservada Const */
( const ) {lexemas=yytext(); return Const;}

/* Palabra reservada Continue */
( continue ) {lexemas=yytext(); return Continue;}

/* Palabra reservada Default */
( default ) {lexemas=yytext(); return Default;}

/* Palabra reservada Do */
( do ) {lexemas=yytext(); return Do;}

/* Palabra reservada Double */
( double ) {lexemas=yytext(); return Double;}

/* Tipo de dato Byte */
( byte ) {lexemas=yytext(); return Byte;}

/* Float Integer */
(float) {lexemas=yytext(); return Float;}

/* Palabra reservada For */
(for) {lexemas=yytext(); return For;}

/* Palabra reservada If */
(if) {lexemas=yytext(); return If; }

/* Palabra reservada Else */
(else) {lexemas=yytext(); return Else; }

/* Integer */
(int) {lexemas=yytext(); return Int;}

/* LongInteger */
(long) {lexemas=yytext(); return Long;}

/* Palabra reservada Register */
(register) {lexemas=yytext(); return Register;}

/* Palabra reservada Return */
(return) {lexemas=yytext(); return Return;}

/* Palabra reservada Short */
(short) {lexemas=yytext(); return Short;}

/* Palabra reservada Unsigned */
(unsigned) {lexemas=yytext(); return Unsigned;}

/* Palabra reservada Struct */
(struct) {lexemas=yytext(); return Struct;}

/* Palabra reservada Typedef */
(typedef) {lexemas=yytext(); return Typedef;}

/* Palabra reservada Void */
(void) {lexemas=yytext(); return Void;}

/* Palabra reservada Switch */ 
(switch) {lexemas=yytext(); return Switch; }

/* Palabra reservada While */ 
(while) {lexemas=yytext(); return While; }

/* Palabra reservada Using */
(using) {lexemas=yytext(); return Using; }

/* Palabra reservada Namespace */ 
(namespace) {lexemas=yytext(); return Namespace; }

/* Palabra reservada Std */ 
(std) {lexemas=yytext(); return Std; }

/* Palabra reservada Cin */ 
(cin) {lexemas=yytext(); return Cin; }

/* Palabra reservada Cout */ 
(cout) {lexemas=yytext(); return Cout; }

/* Palabra reservada Scanf */ 
(scanf) {lexemas=yytext(); return Scanf; }

/* Palabra reservada Printf */ 
(printf) {lexemas=yytext(); return Printf; }

/* Tipo de dato String */ 
(String) {lexemas=yytext(); return Cadena; }

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( \n ) {return Linea;}

/* Comillas */
( "\"" ) {lexemas=yytext(); return Comillas;}

/* Operador Igual */
( "=" ) {lexemas=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexemas=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexemas=yytext(); return Resta;}

/* Operador Multiplicacion */ 
( "*" ) {lexemas=yytext(); return Multiplicacion; }

/* Operador Division */ 
( "/" ) {lexemas=yytext(); return Division; }

/* Operador Modulo */ 
( "%" ) {lexemas=yytext(); return Modulo; }

/* Tipos de Datos */
( byte | long | double | int | string | char | float ) {lexemas=yytext(); return T_dato; }

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexemas=yytext(); return Op_logico; }

/* Operador && */
( "&&" ) {lexemas=yytext(); return Op_and; }

/* Operador || */
( "||" ) {lexemas=yytext(); return Op_or; }

/* Operador ! */
( "!" ) {lexemas=yytext(); return Op_exclam; }

/*Operador Mayor Que */
( ">" ) {lexemas = yytext(); return Mayor_que;}

/*Operador Menor Que */
( "<" ) {lexemas = yytext(); return Menor_que;}

/*Operador Igual Que */
( "==" ) {lexemas = yytext(); return Igual_que;}

/*Operador Diferente De */
( "!=" ) {lexemas = yytext(); return Diferente_de;}

/*Operador Mayor o Igual Que */
( ">=" ) {lexemas = yytext(); return Mayor_eq;}

/*Operador Menor o Igual Que */
( "<=" ) {lexemas = yytext(); return Menor_eq;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexemas = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-=" | "*=" | "/=" | "%=" ) {lexemas = yytext(); return Op_atribucion; }

/* Operador Incremento*/
( "++" ) {lexemas = yytext(); return Op_incremento; }

/* Operador Decremento */
( "--" ) {lexemas = yytext(); return Op_Decremento; }

/*Operador Booleano True */
( true ) {lexemas = yytext(); return Op_true; }

/*Operador Booleano False */
( false ) {lexemas = yytext(); return Op_false; }

/* Parentesis de apertura */
( "(" ) {lexemas=yytext(); return Parent_a;}

/* Parentesis de cierre */
( ")" ) {lexemas=yytext(); return Parent_c;}

/* Llave de apertura */
( "{" ) {lexemas=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexemas=yytext(); return Llave_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexemas=yytext(); return Main;}

/* Dos puntos */
( ":" ) {lexemas=yytext(); return Dos_puntos; }

/* P_coma */
( ";" ) {lexemas=yytext(); return P_coma;}

/* Coma */
( "," ) {lexemas=yytext(); return Coma; }

/* Punto */
( "." ) {lexemas=yytext(); return Punto; }

/* Identificador */
{L}({L}|{D})* {lexemas=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexemas=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}