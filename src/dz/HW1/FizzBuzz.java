package dz.HW1;

public class FizzBuzz {
    public static void main(String[] args) {
        boolean b = true;
        int a = 1;

        while (b) {
            if (a % 3 == 0) {
                System.out.println("fizz: " + a); // здесь если а делится на 3 без остатка
            }
            if (a % 5 == 0) {
                System.out.println("buzz: " + a);  // здесь если а делится на 5 без остатка
            }
            if (a % 3 == 0 && a % 5 == 0) {       //  здесь если а делится на 3 и на 5 без остатка
                System.out.println("fizzbuzz: " + a);
                b = false;                           // b стала false и вышло из цикла
            }
            a++;
        }
    }
}


