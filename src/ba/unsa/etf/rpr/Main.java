package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Unesi broj: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for(int i = 1; i <= n; i++) {
            if(i % sumaCifara(i) == 0) System.out.println(i);
        }
    }
    private static int sumaCifara(int x) {
        int sum = 0;
        while(x > 0) {
            sum += (x % 10);
            x /= 10;
        }
        return sum;
    }
}