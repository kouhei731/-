public class Mojihikaku {
    public static void main( String args[] ) {
        String st1 = "abc";
        String st2 = "ab";
        st2 = st2 + "c";
        boolean bn = st1 == st2;
        System.out.println(bn);
        bn = st2 == "abc";
        System.out.println(bn);
        bn = st2.equals("abc");
        System.out.println(bn);      
    }
}