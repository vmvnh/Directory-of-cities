package main.java;

import java.util.List;

import static main.java.CityService.*;
import static main.java.CityUtilities.*;

public class Main {
	public static void main(String[] args) {
		String FILE_URL = "resources/cities.csv"; // Путь к файлу со списком городов
		List<City> cities = openFile(FILE_URL);

		print(cities); // Вывод списка городов в консоль

		sortingByNameWithLambda(cities); // Сортировка массива по названию городов, используя lambda-выражения
		print(cities); // Вывод списка городов в консоль

		sortingByNameWithComparator(cities); // Сортировка массива по названию городов, используя java.util.Comparator
		print(cities); // Вывод списка городов в консоль

		sortingByDistrictAndName(cities); // Сортировка массива по федеральным округам и названиям городов в них
		print(cities); // Вывод списка городов в консоль

		findByBrutForce(cities); // Поиск города с наибольшим количеством жителей с помощью простого перебора.

		findMaxPopulation(cities); // Поиск города с наибольшим количеством жителей с использованием lambda-выражений.
	}
}
