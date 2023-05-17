
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Apr 12 07:29:57 COT 2023
//----------------------------------------------------

package Analizador;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Apr 12 07:29:57 COT 2023
  */
public class Sintaxis extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintaxis() {super();}

  /** Constructor which sets the default scanner. */
  public Sintaxis(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintaxis(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\037\000\002\002\004\000\002\002\011\000\002\002" +
    "\010\000\002\003\004\000\002\003\003\000\002\003\004" +
    "\000\002\003\003\000\002\003\004\000\002\003\003\000" +
    "\002\004\005\000\002\004\005\000\002\004\007\000\002" +
    "\004\007\000\002\004\006\000\002\004\011\000\002\004" +
    "\007\000\002\004\011\000\002\004\006\000\002\004\006" +
    "\000\002\004\010\000\002\004\010\000\002\004\011\000" +
    "\002\004\011\000\002\007\003\000\002\007\005\000\002" +
    "\007\005\000\002\007\005\000\002\007\006\000\002\007" +
    "\007\000\002\005\011\000\002\006\015" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\131\000\006\015\006\036\004\001\002\000\004\030" +
    "\127\001\002\000\004\002\126\001\002\000\004\036\007" +
    "\001\002\000\004\030\010\001\002\000\004\031\011\001" +
    "\002\000\004\032\012\001\002\000\014\006\016\007\015" +
    "\010\013\015\020\041\023\001\002\000\004\030\102\001" +
    "\002\000\016\006\ufffd\007\ufffd\010\ufffd\015\ufffd\033\ufffd" +
    "\041\ufffd\001\002\000\004\041\063\001\002\000\006\026" +
    "\040\041\041\001\002\000\016\006\ufff9\007\ufff9\010\ufff9" +
    "\015\ufff9\033\ufff9\041\ufff9\001\002\000\004\041\033\001" +
    "\002\000\016\006\ufffb\007\ufffb\010\ufffb\015\ufffb\033\ufffb" +
    "\041\ufffb\001\002\000\016\006\016\007\015\010\013\015" +
    "\020\033\032\041\023\001\002\000\004\016\024\001\002" +
    "\000\004\042\025\001\002\000\004\037\026\001\002\000" +
    "\016\006\ufff4\007\ufff4\010\ufff4\015\ufff4\033\ufff4\041\ufff4" +
    "\001\002\000\016\006\ufffe\007\ufffe\010\ufffe\015\ufffe\033" +
    "\ufffe\041\ufffe\001\002\000\016\006\ufffa\007\ufffa\010\ufffa" +
    "\015\ufffa\033\ufffa\041\ufffa\001\002\000\016\006\ufffc\007" +
    "\ufffc\010\ufffc\015\ufffc\033\ufffc\041\ufffc\001\002\000\004" +
    "\002\000\001\002\000\006\016\035\037\034\001\002\000" +
    "\016\006\ufff8\007\ufff8\010\ufff8\015\ufff8\033\ufff8\041\ufff8" +
    "\001\002\000\004\042\036\001\002\000\004\037\037\001" +
    "\002\000\016\006\ufff5\007\ufff5\010\ufff5\015\ufff5\033\ufff5" +
    "\041\ufff5\001\002\000\004\041\061\001\002\000\012\016" +
    "\045\025\042\026\044\037\043\001\002\000\004\042\054" +
    "\001\002\000\016\006\ufff7\007\ufff7\010\ufff7\015\ufff7\033" +
    "\ufff7\041\ufff7\001\002\000\004\037\053\001\002\000\004" +
    "\042\046\001\002\000\006\037\047\040\050\001\002\000" +
    "\016\006\ufff2\007\ufff2\010\ufff2\015\ufff2\033\ufff2\041\ufff2" +
    "\001\002\000\004\042\051\001\002\000\004\037\052\001" +
    "\002\000\016\006\ufff1\007\ufff1\010\ufff1\015\ufff1\033\ufff1" +
    "\041\ufff1\001\002\000\016\006\ufff0\007\ufff0\010\ufff0\015" +
    "\ufff0\033\ufff0\041\ufff0\001\002\000\006\037\055\040\056" +
    "\001\002\000\016\006\ufff6\007\ufff6\010\ufff6\015\ufff6\033" +
    "\ufff6\041\ufff6\001\002\000\004\042\057\001\002\000\004" +
    "\037\060\001\002\000\016\006\ufff3\007\ufff3\010\ufff3\015" +
    "\ufff3\033\ufff3\041\ufff3\001\002\000\004\037\062\001\002" +
    "\000\016\006\uffef\007\uffef\010\uffef\015\uffef\033\uffef\041" +
    "\uffef\001\002\000\006\016\065\025\064\001\002\000\004" +
    "\005\074\001\002\000\004\005\066\001\002\000\006\005" +
    "\067\041\070\001\002\000\004\037\073\001\002\000\004" +
    "\005\071\001\002\000\004\037\072\001\002\000\016\006" +
    "\uffeb\007\uffeb\010\uffeb\015\uffeb\033\uffeb\041\uffeb\001\002" +
    "\000\016\006\uffed\007\uffed\010\uffed\015\uffed\033\uffed\041" +
    "\uffed\001\002\000\006\005\075\041\076\001\002\000\004" +
    "\037\101\001\002\000\004\005\077\001\002\000\004\037" +
    "\100\001\002\000\016\006\uffec\007\uffec\010\uffec\015\uffec" +
    "\033\uffec\041\uffec\001\002\000\016\006\uffee\007\uffee\010" +
    "\uffee\015\uffee\033\uffee\041\uffee\001\002\000\006\027\104" +
    "\041\105\001\002\000\004\031\116\001\002\000\004\031" +
    "\uffea\001\002\000\004\024\106\001\002\000\012\005\110" +
    "\027\111\041\112\042\107\001\002\000\004\031\uffe8\001" +
    "\002\000\006\005\113\041\114\001\002\000\004\031\uffe9" +
    "\001\002\000\004\031\uffe7\001\002\000\004\031\uffe6\001" +
    "\002\000\004\005\115\001\002\000\004\031\uffe5\001\002" +
    "\000\004\032\117\001\002\000\014\006\016\007\015\010" +
    "\013\015\020\041\023\001\002\000\016\006\016\007\015" +
    "\010\013\015\020\033\121\041\023\001\002\000\020\006" +
    "\uffe4\007\uffe4\010\uffe4\011\122\015\uffe4\033\uffe4\041\uffe4" +
    "\001\002\000\004\032\123\001\002\000\014\006\016\007" +
    "\015\010\013\015\020\041\023\001\002\000\016\006\016" +
    "\007\015\010\013\015\020\033\125\041\023\001\002\000" +
    "\016\006\uffe3\007\uffe3\010\uffe3\015\uffe3\033\uffe3\041\uffe3" +
    "\001\002\000\004\002\001\001\002\000\004\031\130\001" +
    "\002\000\004\032\131\001\002\000\014\006\016\007\015" +
    "\010\013\015\020\041\023\001\002\000\016\006\016\007" +
    "\015\010\013\015\020\033\133\041\023\001\002\000\004" +
    "\002\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\131\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\003\021\004\013\005" +
    "\020\006\016\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\004\026\005\030" +
    "\006\027\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\007" +
    "\102\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\012\003\117\004\013\005\020\006\016\001\001\000\010" +
    "\004\026\005\030\006\027\001\001\000\002\001\001\000" +
    "\002\001\001\000\012\003\123\004\013\005\020\006\016" +
    "\001\001\000\010\004\026\005\030\006\027\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\003\131\004\013\005\020\006\016\001" +
    "\001\000\010\004\026\005\030\006\027\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintaxis$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintaxis$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintaxis$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintaxis$actions {
  private final Sintaxis parser;

  /** Constructor */
  CUP$Sintaxis$actions(Sintaxis parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintaxis$do_action(
    int                        CUP$Sintaxis$act_num,
    java_cup.runtime.lr_parser CUP$Sintaxis$parser,
    java.util.Stack            CUP$Sintaxis$stack,
    int                        CUP$Sintaxis$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintaxis$result;

      /* select the action based on the action number */
      switch (CUP$Sintaxis$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // IF_ELSE ::= If Parent_a SENTENCIA_BOOLEANA Parent_c Llave_a SENTENCIA Llave_c Else Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("IF_ELSE",4, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-10)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // IF ::= If Parent_a SENTENCIA_BOOLEANA Parent_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("IF",3, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Identificador Comillas 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",5, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-4)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Comillas 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",5, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-3)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Identificador 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",5, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Numero 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",5, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",5, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // SENTENCIA_BOOLEANA ::= Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",5, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // DECLARACION ::= Cadena Identificador Igual Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECLARACION ::= Cadena Identificador Igual Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-5)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-5)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // DECLARACION ::= T_dato Op_incremento Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-3)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DECLARACION ::= T_dato Identificador Op_incremento P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-3)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DECLARACION ::= T_dato Identificador Igual Numero Punto Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // DECLARACION ::= T_dato Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-4)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // DECLARACION ::= T_dato Identificador Op_atribucion Numero Punto Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // DECLARACION ::= Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-3)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // DECLARACION ::= Int Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-4)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // DECLARACION ::= T_dato Identificador Op_atribucion Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-4)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DECLARACION ::= T_dato Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DECLARACION ::= Int Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA ::= SENTENCIA IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= IF 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= SENTENCIA IF 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIA ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTENCIA ::= SENTENCIA DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= Main Parent_a Parent_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-5)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Int Main Parent_a Parent_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)).value;
		RESULT = start_val;
              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintaxis$parser.done_parsing();
          return CUP$Sintaxis$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
