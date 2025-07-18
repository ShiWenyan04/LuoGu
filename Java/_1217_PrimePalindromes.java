package LuoGu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1217_PrimePalindromes {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = n; i <= m; i++) {
			char []str = String.valueOf(i).toCharArray();
			int len = str.length;
			if( len == 1 && Method(i)) {
				list.add(i);
			}else if(i== 11){
                list.add(i);
            }else if(len%2!=0 ){
				boolean judge = true;
				for(int j = 0;j<len;j++) {
					if(str[j] != str[len-j-1]) {
						judge = false;
						break;
					}
				}
				if(judge && Method(i)) {
					list.add(i);
				}
			}
		}
        for(int i = 0;i < list.size(); i++){
            System.out.println(list.get(i));
        }
	}
	public static boolean Method(int x) {
		for (int i = 2; i < x/2; i++) {
			if(x%i == 0) return false;
		}
		return true;
	}
}