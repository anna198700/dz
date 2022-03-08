package dz.HW1;

public class MySqrt {
    int getRoot(int value) {
        return (int) Math.sqrt(value);
    }
    public static void main(String[] args) {
        MySqrt ms = new MySqrt();
        int result = ms.getRoot(8);
        System.out.println(result);
    }
}

