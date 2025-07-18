package LuoGu;

import java.util.PriorityQueue;
import java.util.Scanner;

public class _p1090 {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int []nums = new int[n];
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for (int i = 0; i < nums.length; i++) {
			queue.add(scanner.nextInt());
		}
		int ans = 0;
		while(queue.size() != 1) {
			int a = queue.poll();
			int b = queue.poll();
			int temp = a+b;
			ans+=temp;
			queue.offer(temp);
		}
		System.out.println(ans);
	}
}
