package sec04.exam04;

import java.util.Scanner;

public class RandomExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rannum=new Random();
//		int a =  (int)(Math.random()*10);
		
		Scanner scan=new Scanner(System.in);
		int scan1;
		while(true) {
			scan1=scan.nextInt();
		rannum.rand(scan1);
		if(rannum.now == true) break;
		}		

	}
	}


