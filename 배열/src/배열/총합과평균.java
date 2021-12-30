package ¹è¿­;

public class ÃÑÇÕ°úÆò±Õ {
	public static void main(String[] args) {
		int sum=0;
		float avg=0f;
		
		int[] score= {100,88,100,100,90};
		
		for(int i=0; i<score.length; i++)
		{
			sum += score[i];
		}
		
		avg = sum/(float)(score.length);
		System.out.println("ÃÑÁ¡ : " + sum);
		System.out.println("Æò±Õ : " + avg);
	}
}
