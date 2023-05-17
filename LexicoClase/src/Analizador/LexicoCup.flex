package Analizador;
import java_cup.runtime.Symbol;
%%
%class LexicoCup
%type java_cup.runtime.Symbol
%cup 
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Símbolo Almohadilla */
( "#" ) {return new Symbol(sym.Almohadillas, yychar, yyline, yytext());}

/* Palabra reservada Int */
( int ) {return new Symbol(sym.Int, yychar, yyline, yytext());}

/* Palabra reservada Include*/
( include ) {return new Symbol(sym.Include, yychar, yyline, yytext());}

/* Palabra reservada Define */
( define ) {return new Symbol(sym.Define, yychar, yyline, yytext());}

/*Palabra reservada Break*/
( break ) {return new Symbol(sym.Break, yychar, yyline, yytext());}  

/* Palabra reservada Case */
( case ) {return new Symbol(sym.Case, yychar, yyline, yytext());} 

/* Palabra reservada Char */
( char ) {return new Symbol(sym.Char, yychar, yyline, yytext());}

/* Palabra reservada Const */
( const ) {return new Symbol(sym.Const, yychar, yyline, yytext());}  

/* Palabra reservada Continue */
( continue ) {return new Symbol(sym.Continue, yychar, yyline, yytext());} 

/* Palabra reservada Default */
( default ) {return new Symbol(sym.Continue, yychar, yyline, yytext());} 

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Dos puntos */
( ":" ) {return new Symbol(sym.Dos_puntos, yychar, yyline, yytext());}

/* Palabra reservada Byte */
( byte ) {return new Symbol(sym.Byte, yychar, yyline, yytext());}

/* Palabra reservada Long */
( long ) {return new Symbol(sym.Long, yychar, yyline, yytext());}

/* Palabra reservada Double */
(double) {return new Symbol(sym.Double, yychar, yyline, yytext());}

/* Palabra reservada Float */
( float ) {return new Symbol(sym.Float, yychar, yyline, yytext());}

/* Tipo de dato String */
( String ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

/* Palabra reservada If */
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palabra reservada Else */
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palabra reservada Do */
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

/* Palabra reservada While */
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Palabra reservada For */
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}

/* Palabra reservada Register */
( register ) {return new Symbol(sym.Register, yychar, yyline, yytext());}

/* Palabra reservada Return */
( return ) {return new Symbol(sym.Return, yychar, yyline, yytext());}

/* Palabra reservada Short */
( short ) {return new Symbol(sym.Short, yychar, yyline, yytext());}

/* Palabra reservada Unsigned */
( unsigned ) {return new Symbol(sym.Unsigned, yychar, yyline, yytext());}

/* Palabra reservada Struct */
( struct ) {return new Symbol(sym.Struct, yychar, yyline, yytext());}

/* Palabra reservada Typedef */
( typedef ) {return new Symbol(sym.Typedef, yychar, yyline, yytext());}

/* Palabra reservada Void */
(void) {return new Symbol(sym.Void, yychar, yyline, yytext());}

/* Palabra reservada Switch */ 
(switch) {return new Symbol(sym.Switch, yychar, yyline, yytext());}

/* Palabra reservada Using */
(using) {return new Symbol(sym.Using, yychar, yyline, yytext());}

/* Palabra reservada Namespace */ 
(namespace) {return new Symbol(sym.Namespace, yychar, yyline, yytext());}

/* Palabra reservada Std */ 
(std) {return new Symbol(sym.Std, yychar, yyline, yytext());}

/* Palabra reservada Cin*/ 
(cin) {return new Symbol(sym.Cin, yychar, yyline, yytext());}

/* Palabra reservada Cout*/ 
(cout) {return new Symbol(sym.Cout, yychar, yyline, yytext());}

/* Palabra reservada Scanf*/ 
(scanf) {return new Symbol(sym.Scanf, yychar, yyline, yytext());}

/* Palabra reservada Printf*/ 
(printf) {return new Symbol(sym.Printf, yychar, yyline, yytext());}

/* Operador Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

/* Operador Modulo */ 
( "%" ) {return new Symbol(sym.Modulo, yychar, yyline, yytext());}

/* Tipos de Datos */
( byte | long | double | int | string | char | float ) {return new Symbol(sym.T_dato, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/* Operador && */
( "&&" ) {return new Symbol(sym.Op_and, yychar, yyline, yytext());}

/* Operador || */
( "||" ) {return new Symbol(sym.Op_or, yychar, yyline, yytext());}

/* Operador ! */
( "!" ) {return new Symbol(sym.Op_exclam, yychar, yyline, yytext());}

/*Operador Mayor Que */
( ">" ) {return new Symbol(sym.Mayor_que, yychar, yyline, yytext());}

/*Operador Menor Que */
( "<" ) {return new Symbol(sym.Menor_que, yychar, yyline, yytext());}

/*Operador Igual Que */
( "==" ) {return new Symbol(sym.Igual_que, yychar, yyline, yytext());}

/*Operador Diferente De */
( "!=" ) {return new Symbol(sym.Diferente_de, yychar, yyline, yytext());}

/*Operador Mayor o Igual Que */
( ">=" ) {return new Symbol(sym.Mayor_eq, yychar, yyline, yytext());}

/*Operador Menor o Igual Que */
( "<=" ) {return new Symbol(sym.Menor_eq, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" | "=" ) {return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());}

/* Operador Incremento*/
( "++" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}

/* Operador Decremento */
( "--" ) {return new Symbol(sym.Op_Decremento, yychar, yyline, yytext());}

/*Operador Booleano True*/
( true ) {return new Symbol(sym.Op_true, yychar, yyline, yytext());}

/*Operador Booleano False*/
( false ) {return new Symbol(sym.Op_false, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parent_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parent_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "main" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Punto */
( "." ) {return new Symbol(sym.Punto, yychar, yyline, yytext());}

/* Coma */
( "," ) {return new Symbol(sym.Coma, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
