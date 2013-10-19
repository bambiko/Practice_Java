import java.util.*;
public class J13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] triangle = new int[3];
		try {
			while(sc.hasNextLine()){
				String str = sc.nextLine();
				String[] num = str.split(" ");
				if(num.length != 3) {
					break;
				}
				for(int i = 0; i < 3; i++) {
					triangle[i] = Integer.parseInt(num[i]);
				}
				Arrays.sort(triangle);
				if(triangle[0] + triangle[1] <= triangle[2])
					System.out.println("No");
				else
					System.out.println("Yes");
			}
			
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		
		
	}
}