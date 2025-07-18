package LuoGu;

import java.util.HashMap;

public class _169_majorityElement {
	public static void main(String[] arg) {
		int []nums = {2,2,1,1,1,2,2};
		int n = nums.length;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int t = n/2;
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for (Integer i : map.keySet()) {
			if(map.get(i) > t) {
				System.out.println(i);
				break;
			}
		}
	}
}
