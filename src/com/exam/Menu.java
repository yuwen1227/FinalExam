package com.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	List<Food> foods = new ArrayList<>();

	public void on() {
		for (int a = 0; a < foods.size(); a++) {
			Food food = foods.get(a);
			System.out
					.println(food.getId() + "." + food.getName() + "  " + " " + food.getPrice() + " " + food.getKcal());
			System.out.println("請輸入餐點:");
			System.out.println("請輸入數量:");
		}

		Scanner scanner = new Scanner(System.in);
		String food = scanner.nextLine();
		int data = -1;
		while (data != 0) {
			data = scanner.nextInt();
			System.out.println("請輸入餐點:");
			String name = scanner.nextLine();
			switch (data) {
			case 1:
				if(name != null){
				System.out.println("請輸入數量:");
					}else{
						
					}
				break;
			case 2:
				System.out.println("請輸入數量:");
				
			case 3:
				System.out.println("請輸入數量:");
				
			case 4:
				System.out.println("請輸入數量:");
				
			case 5:
				System.out.println("請輸入數量:");
				
			case 6:
				System.out.println("請輸入數量:");
				
			case 7:
				System.out.println("請輸入數量:");

			}
		}
	}
}
