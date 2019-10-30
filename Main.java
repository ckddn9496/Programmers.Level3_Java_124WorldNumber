
public class Main {

	public static void main(String[] args) {
//		int n = 40;
//		int n = 1; // 1
//		int n = 2; // 2
//		int n = 3; // 4
//		int n = 4; // 11
		int n = 13; // 124
		for (int i = 1; i <= 50; i++) {
			System.out.println("INPUT " + i + " " + new Solution().solution(i));
		}
	}

}

class Solution {
	public String solution(int n) {
		int exp = 1;
		int tot = 0;
		while (3 * (Math.pow(3, exp) - 1) / 2 < n) {
			tot = (int) (3 * (Math.pow(3, exp++) - 1) / 2);
		}
		n -= (tot + 1);
		StringBuilder answer = new StringBuilder();
		for (int i = 1; i <= exp; i++) {
			if (n <= 0) {
				answer.append(1);
				continue;
			}
			int mod = n % 3;
			
			switch (mod) {
			case 0:
				answer.append(1);
				break;
			case 1:
				answer.append(2);				
				break;
			case 2:
				answer.append(4);
				break;
			}
			n /= 3;
		}
		
		return answer.reverse().toString();
	}
}