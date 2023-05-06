package com.ebrain.demo;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {

		int flag = 0,unique1=0, unique = 0;
		// for reverse word
		String revers = " ";
		char rev;

		Scanner Bigword = new Scanner(System.in);
		System.out.println("BigWord");
		String name = Bigword.nextLine();
		int n=name.length();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j<i; j++) {
				if (i == j) {
					flag=1;
				}
			}
			if(flag==0) {
				unique++;
			}
			else 
			{
				unique1++;
			}
			
			rev = name.charAt(i);
			revers = rev + revers;
		}
					
		System.out.println("unique characters: " + unique);	
		System.out.println("Occurance characters: " + unique1);
		System.out.println("reverse word: " + revers);
		String[] half=name.split("@");
		for(String h:half) 
		{
		System.out.println("half word:"+h);
	}
	}
	}

/*String str=name;
String[] arrOfStr=str.split(".");
for(String a:arrOfStr)
	System.out.println(a);*/
