package LuoGu;

import java.util.Scanner;

public class P5708 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double p = (a+b+c)/2;
        double ans = Math.sqrt(p*(p-a)*(p-c)*(p-b));
        System.out.printf("%.1f", ans);
    }
}
