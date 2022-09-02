package main.java;

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
}
