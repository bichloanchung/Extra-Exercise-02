import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class small_game {

	public static void main(String[] args) {
		ArrayList<Integer> arrOfInt = new ArrayList<Integer>();
		Random rd = new Random();
		for (int i = 0; i < 50; i++) {
			int x = rd.nextInt(3);
			//System.out.println(x);
			arrOfInt.add(x);
		}
		System.out.println(arrOfInt);
		int num0 = 0;
		int num1 = 0;
		int num2 = 0;
		for (int y = 0; y < arrOfInt.size(); y++) {
			if (arrOfInt.get(y) == 0) {
				num0 = num0 + 1;
			}else if (arrOfInt.get(y) == 1) {
				num1 = num1 + 1;
			}else if (arrOfInt.get(y) == 2) {
				num2 = num2 + 1;
			}	
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you think which number is most frequency between 0 - 2?");
		System.out.print("It 's : ");
		int mostN = sc.nextInt();
		int maxN = 0;
		if (num0 > num1 && num0 > num2) {
			maxN = num0;
			System.out.println("The numer 0 is most frequency");
		}else if (num1 > num0 && num1 > num2) {
			maxN = num1;
			System.out.println("The numer 1 is most frequency");
		}else if (num2 > num0 && num2 > num1) {
			maxN = num2;
			System.out.println("The numer 2 is most frequency");
		}else {
			System.out.println("No number is most frequency!");
		}
		/*if (mostN == maxN) {
			System.out.println("You win the prize!");
		}else {
			System.out.println("You dont get a prize ");
		}*/
		System.out.println("The frequencies of number 0: "+num0);
		System.out.println("The frequencies of number 1: "+num1);
		System.out.println("The frequencies of number 2: "+num2);
		
	}

}
