package main.java;

import java.text.MessageFormat;
import java.util.Comparator;
import java.util.List;

public class CityUtilities {
	/**
	 * Сортировка по названию в алфавитном порядке по убыванию
	 * без учета регистра, используя lambda-выражения.
	 *
	 * @param cities Массив городов.
	 */
	public static void sortingByNameWithLambda(List<City> cities) {
		cities.sort((one, other) -> one.getName().compareToIgnoreCase(other.getName()));
	}

	/**
	 * Сортировка по названию в алфавитном порядке по убыванию
	 * без учета регистра, используя {@link java.util.Comparator}.
	 *
	 * @param cities Массив городов.
	 */
	public static void sortingByNameWithComparator(List<City> cities) {
		cities.sort(new Comparator<City>() {
			@Override
			public int compare(City one, City other) {
				return one.getName().compareToIgnoreCase(other.getName());
			}
		});
	}

	/**
	 * Сортировка по федеральному округу и названию города
	 * внутри каждого федерального округа в алфавитном порядке
	 * по убыванию с учетом регистра.
	 *
	 * @param cities Массив городов.
	 */
	public static void sortingByDistrictAndName(List<City> cities) {
		cities.sort(Comparator.comparing(City::getDistrict).thenComparing(City::getName));
	}

	/**
	 * Поиск города с наибольшим количеством жителей с помощью простого перебора.
	 *
	 * @param cities Массив городов.
	 */
	public static void findByBrutForce(List<City> cities) {
		City[] citiesArray = cities.toArray(City[]::new);
		City city = citiesArray[0];
		int index = 0;

		for (int i = 1; i < citiesArray.length; i++) {
			if (citiesArray[i].getPopulation() > city.getPopulation()) {
				city = citiesArray[i]; // Город содержащий наибольшее количество населения
				index = i; // Индекс города в массиве
			}
		}
		System.out.println(MessageFormat.format("[{0}] = {1}", index, citiesArray[index].getPopulation()));
	}

	/**
	 * Поиск города с наибольшим количеством жителей с использованием lambda-выражений.
	 *
	 * @param cities Массив городов.
	 */
	public static void findMaxPopulation(List<City> cities) {
		System.out.println(cities.stream().max(Comparator.comparing(City::getPopulation)));
	}
}
