public class Aiueo {
  public static void main(String[] args) {
    
    
    char ch_A = 'あ';
    char ch_I = 'い';
    char ch_U = 'う';
    char ch_E = 'え';
    char ch_O = 'お';
  
    int code_A = (int)ch_A;
    int code_I = (int)ch_I;
    int code_U = (int)ch_U;
    int code_E = (int)ch_E;
    int code_O = (int)ch_O;
  
    System.out.println(Integer.toHexString(code_A)); /* 3042 */
    System.out.println(Integer.toHexString(code_I)); /* 3044 */
    System.out.println(Integer.toHexString(code_U)); /* 3046 */
    System.out.println(Integer.toHexString(code_E)); /* 3048 */
    System.out.println(Integer.toHexString(code_O)); /* 304a */

  }
}