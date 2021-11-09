public class Except14 {
  public static void main(String[] args) {
      for(int i=0; i<=2; i++){
          try{
              System.out.println();
              System.out.println("try外=" + i);
              if(i==0) throw new Exception("例外1");
              try{
                   System.out.println("    try内=" + i);
                   if(i==1) throw new Exception("例外2");
              }
              catch (Exception inter){
                   System.out.println("    catch内=" + i);
              }
              finally{
                   System.out.println("    finally内=" + i);
              }
          }
          catch (Exception outer){
              System.out.println("catch外=" + i);
          }
          finally{
               System.out.println("finally外=" + i);
          }
      }
   }
}