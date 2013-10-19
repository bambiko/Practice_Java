import java.util.*;
public class J15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] num = new double[10];
		double avg = 0.0;
		try {
			while(sc.hasNextLine()){
				String str = sc.nextLine();
				String[] temp = str.split(" ");
				if(temp.length != 10) {
					break;
				}
				for(int i = 0; i < 10; i++) {
					num[i] = Integer.parseInt(temp[i]);
				}
				Arrays.sort(num);
				avg = (num[0]+num[9])/2;
				System.out.println(avg);
			}
			
		}
		catch(Exception e) {
				System.out.println("Error");
		}
	}
}