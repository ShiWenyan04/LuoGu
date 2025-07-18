package LuoGu;

import java.util.Scanner;

public class _1781_PresidentOfTheUniverse {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int name = 0;
		String max = "";
		
		for (int i = 0; i < n; i++) {
			String piao= sc.next();
			if(Method(piao, max)) {
				max = piao;
				name = i+1;
			}
		}
		System.out.println(name);
		System.out.println(max);
	}
	public static boolean Method(String piao,String max) {
		if(piao.length() > max.length() )return true;
		if(piao.length() < max.length() ) return false;
		char []piaoChar= piao.toCharArray();
		char []maxChar= max.toCharArray();
		for (int i = 0; i < maxChar.length; i++) {
			if(piaoChar[i] > maxChar[i]) return true;
            if(piaoChar[i] < maxChar[i]) return false;
		}
		return false;
	}
}
