public class CoderDecoder {
//PRE: 0 <= n <=127
//POS: Si es n<64, se devuelve n+1. Si n=64 se devuelve 0. 
//Si n=65, se devuelve 127. Si n>65, se devuelve n-1. 
 
  static int claveEncode(int n){
    if (n<=64)
      if (n==64)
        return 0;
      else
        return ++n;
    else
      if (n==65)
        return 127;
      else
        return --n;
  }
  
//PRE: 0 <= n <=127
//POS: Si es n<=64, se devuelve n-1. Si n=0 se devuelve 64. 
//Si n=127, se devuelve 65. Si n>65, se devuelve n+1. 
  
  static int claveDecode(int n){
    if (n<=64)
      if (n==0)
        return 64;
      else
        return --n;
    else
      if (n==127)
        return 65;
      else
        return ++n;
  }
   
//PRE: c simbolo de tabla ASCII de 127 caracteres.
//POS: Se devuelve el numero decimal correspondiente al caracter c de la tabla ASCII.
  
    static int encodeASCIIChar(char c){
        return (int) c;
    }
    
//PRE: 0 <= n <=127
//POS: Se devuelve el caracter de la tabla ASCII correspondiente al numero decimal n.
    
    static char decodeASCIIChar(int n){
        return (char) n;
    }
    
//PRE: c simbolo de tabla ASCII de 127 caracteres.
//POS: Se devuelve un caracter de la tabla ASCII asociado segun la funcion claveEncode.
 
    static char encodeChar(char c){
      int ascii = encodeASCIIChar(c);
      return (char) decodeASCIIChar(claveEncode(ascii));
    }
    
//PRE: c simbolo de tabla ASCII de 127 caracteres.
//POS: Se devuelve un caracter de la tabla ASCII asociado segun la funcion claveDecode.
   
    static char decodeChar(char c){
      int ascii= encodeASCIIChar(c);
      return (char)decodeASCIIChar(claveDecode(ascii));
    }
    
//MAIN CON LOS CASOS DE PRUEBA    
    
    public static void main(String[] args){
      int prueba1= encodeASCIIChar('c');
      System.out.println(prueba1);
      char prueba2= decodeASCIIChar(67);
      System.out.println(prueba2);
      char prueba3= encodeChar('*');
      System.out.println(prueba3);
      char prueba4= decodeChar('+');
      System.out.println(prueba4);
      char prueba5= decodeASCIIChar(encodeASCIIChar('c'));
      System.out.println(prueba5);
      char prueba6= encodeChar('B');
      System.out.println(prueba6);
      char prueba7= decodeChar('B');
      System.out.println(prueba7);
    }
    
}