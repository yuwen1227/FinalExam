package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Menu m = new Menu();
		try {
			FileReader f = new FileReader("menu.txt");
			BufferedReader in = new BufferedReader(f);
			String line = in.readLine();
			String[] tokens = line.split(",");
			int count = Integer.parseInt(tokens[0]);
			for(int i=0;i<count;i++){
				String name = tokens[1];
				int price = Integer.parseInt(tokens[2]);
				int kcal = Integer.parseInt(tokens[3]);
				m.f.add(new Food(i+1,name ,price ,kcal));
			}
			m.on();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
	}

}
}