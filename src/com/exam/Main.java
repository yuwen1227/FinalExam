package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Menu m = new Menu();
		
		try {
			FileReader f = new FileReader("menu.txt");
			BufferedReader in = new BufferedReader(f);
			String line = in.readLine();
			String[] tokens = line.split(",");
			int count = Integer.parseInt(tokens[0]);
			for(int i=0;i<count;i++){
				int id =Integer.parseInt(tokens[0]);
				String name = tokens[1];
				int price = Integer.parseInt(tokens[2]);
				int kcal = Integer.parseInt(tokens[3]);
				line = in.readLine();
				m.foods.add(new Food(i+1,name ,price ,kcal, kcal));
			
				}
			
			
		/*	line = in.readLine();
			String[] tokens2 = line.split(",");
			List<String> list2 = new ArrayList<>();
			for(int i=0;i<tokens2.length;i++){
				list2.add(tokens[i]);
			}
			line = in.readLine();
			String[] tokens3 = line.split(",");
			List<String> list3 = new ArrayList<>();
			for(int i=0;i<tokens3.length;i++){
				list3.add(tokens[i]);
			}
		*/
			m.on();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
	}

}
}