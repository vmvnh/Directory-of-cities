package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityService {
	/**
	 * Загрузка данных о городах в массив.
	 *
	 * @return Массив с данными о городах.
	 */
	public static List<City> openFile(String path) {
		List<City> cities = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(new File(path));
			while (scanner.hasNextLine()) {
				cities.add(parse(scanner.nextLine()));
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return cities;
	}

	/**
	 * Разбор строки с данными о городе.
	 *
	 * @param line Строка с данными.
	 * @return {@link City}.
	 */
	public static City parse(String line) {
		Scanner scanner = new Scanner(line);
		scanner.useDelimiter(";");
		scanner.skip("\\d*");
		String name = scanner.next();
		String region = scanner.next();
		String district = scanner.next();
		int population = scanner.nextInt();
		String foundation = null;
		if (scanner.hasNext()) {
			foundation = scanner.next();
		}
		scanner.close();

		return new City(name, region, district, population, foundation);
	}

	/**
	 * Вывод в консоль списка городов.
	 *
	 * @param cities Список городов.
	 */
	public static void print(List<City> cities) {
		cities.forEach(System.out::println);
	}
}
