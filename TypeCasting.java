import java.util.*;

class TypeCasting {
    public static void main(String args[]) {
        byte b = 127;
        int a = b; // type conversion
        byte k = (byte) a;// type casting

        float f = 5.6f;
        int t = (int) f;
        System.out.println(k);


        // type promotion
        byte x = 5;
        byte y = 7;
        int ans = x * y;
        System.out.println(ans);

    }
}