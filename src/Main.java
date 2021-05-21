import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double total = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Sayı: ");
        double sayi = in.nextDouble();

        for (double i =1; i<=sayi; i++){
            total+=1/i;
        }
        System.out.println(total);
    }
}
