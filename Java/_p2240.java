package LuoGu;

import java.util.Arrays;
import java.util.Scanner;

public class _p2240 {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		double [][]coins = new double[n][2];
		for (int i = 0; i < coins.length; i++) {
			coins[i][0] = scanner.nextDouble();
			coins[i][1] = scanner.nextDouble();
		}
		Arrays.sort(coins,(a,b)->Double.compare(b[1]/b[0] ,a[1]/a[0]));
		double ans = 0;
		for (int j = 0; j < coins.length; j++) {
			double weight  = coins[j][0];
			double value = coins[j][1];
			if(t <= 0) {
				break;
			}
			if(t >= weight) {//排序过后，优先装大的
				ans+=value;
				t-=weight;
			}else {
				ans+=(value/weight)*t;//袋子不够大，按比例装
				t = 0;
			}
		}
		System.out.printf("%.2f",ans);
	}
}
