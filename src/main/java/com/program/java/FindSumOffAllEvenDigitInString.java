package com.program.java;

public class FindSumOffAllEvenDigitInString {

	public static void main(String[] args) {
		String s = "java grey243";
		
		char ch[]=s.toCharArray();
		int sum=0;
		for(int i=0; i<ch.length;i++){
			try{
				int x = Integer.parseInt(String.valueOf(ch[i]));
				if(x%2 == 0){
					sum +=x;
				}
			}catch(Exception e){
				
			}
		}
		System.out.println(sum);
	}
}
