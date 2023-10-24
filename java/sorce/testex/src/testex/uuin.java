package testex;

import java.util.Random;
import java.util.Scanner;

public class uuin {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		String c;
		
		c = sc.nextLine();
		
		String upper = c.toUpperCase();
		System.out.println(upper);
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		String s;
		
		do {
			s = sc.next();
			System.out.println(s);
		} while (s != "q");
		*/
		/*
		int[] i = new int[10];
		
		Random rand = new Random();
		
		for(int k = 0; k < i.length; k++) {
			i[k] = rand.nextInt(99);
		}
		for(int k = 0; k < i.length; k++) {
			if(i[k] % 2 == 0)
			System.out.println(i[k]);
		}
		*/
		
		String mem = "111111-2111111";
		
		char genderCode = mem.charAt(7);
		String gender;
		if(genderCode == '1') {
			gender = "남자입니다.";
		}else {
			gender = "여자입니다.";
		}
		System.out.println(gender);
	}

}
