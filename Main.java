import java.util.*;
class Mobile{
    static class Battery{
        int cap = 56;
        void show(){
            int size = 16;
            System.out.println(size);
            System.out.println(cap);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Mobile.Battery b = new Mobile.Battery();
        b.show();

    }
}