import java.util.*;
public class J11 {
	public static void main(String[] args) {
		int[] input = new int[8];
		Scanner sc = new Scanner(System.in);
		try {
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				String[] inputNum = str.split(" ");
				if(inputNum.length != 8)
					break;
				for (int i = 0; i < 8; i++) {
					input[i] = Integer.parseInt(inputNum[i]);
				}
				Arrays.sort(input);
				System.out.println(input[1]*input[6]);
			}
		}
		catch(Exception e) {

		}
	}
}