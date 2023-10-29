package Aplication;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("******METHOD 2**********");
		method2();

	}

	public static void method2() {
		try {
			Scanner sc = new Scanner(System.in);
			String[] vetor = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.printf("O nome digitado foi:%s%n", vetor[position]);

		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("******Sempre executa**********");
		}
		

		
	}

}
