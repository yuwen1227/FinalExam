package com.exam;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	List<Food> f = new ArrayList<>();
	
		public void on(){
			for(int a=0;a<f.size();a++){
			Food food = f.get(a);
			System.out.println(food.getId()+"."+"\t"+food.getName()+food.getPrice()+food.getKcal());
			System.out.println("請輸入餐點:");
			System.out.println("請輸入數量:");
			
			}
		}
}
