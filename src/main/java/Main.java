package main.java;

import static main.java.CityService.*;

public class Main {
	public static void main(String[] args) {
		String FILE_URL = "resources/cities.csv"; // Путь к файлу со списком городов
		print(openFile(FILE_URL)); // Вывод списка городов в консоль


	}
}
