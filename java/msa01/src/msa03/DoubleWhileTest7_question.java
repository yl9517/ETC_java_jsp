package msa03;

import java.util.Scanner;

/*

4¹ø¹®Á¦

1~20±îÁö Â¦¼öÇÕ, È¦¼öÇÕ, ÃÑÇÕ Ãâ·Â
(for,whileÀÌ¿ë)


 */
public class DoubleWhileTest7_question {

	public static void main(String[] args) {
		
		//for ÀÌ¿ë
		int sum1=0,sum2=0;
		
		for(int i=1; i<=20; i++) {
			if(i%2==1) { //È¦¼ö
				sum1+=i; 
			}
			else {		//Â¦¼ö
				sum2+=i;
			}
		}
		System.out.println("È¦¼ö ÇÕ:"+sum1);
		System.out.println("Â¦¼ö ÇÕ:"+sum2);
		System.out.println("ÃÑÇÕ : "+(sum1+sum2));
		
		System.out.println();
		System.out.println("==while¹®Á¦==");
		
		
		//while ÀÌ¿ë
		int sum3=0, sum4=0;
		int i=1;
		while(i<=20) {
			if(i%2==1) { //È¦¼ö
				sum3+=i;
			}
			else {	//Â¦¼ö
				sum4+=i;
			}
			i++;
		}
		System.out.println("È¦¼ö ÇÕ:"+sum3);
		System.out.println("Â¦¼ö ÇÕ:"+sum4);
		System.out.println("ÃÑÇÕ : "+(sum3+sum4));
		

	}

}
