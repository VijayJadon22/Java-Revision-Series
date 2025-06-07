public class TypeConversion {
    public static void main(String[] args) {
        
        // byte b = 125;
        // int a = 23;
        // b = a; cannot convert from int to byte
        // a = b;

        // b = (byte) a;
        // System.out.println(b);

        // float f = 20.49f;
        // double d = 1;
        // d = f;
        // System.out.println(d);

        // int a = 257;
        // byte b = 23;
        // b = (byte) a;
        // System.out.println(b);

        
        // float f = 2.56f;
        // int n = 23;
        // n = (int) f; //when float will be implictily casted point values will be lost
        // System.out.println(n);

        byte a = 10;
        byte b = 30;

        int result = a * b; // this is type promotion as byte mulitplicationw as resulting in big value
        System.out.println(result);


    }
}
