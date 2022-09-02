package main.java;

public class City {
	// Название города
	private final String name;
	// Регион
	private final String region;
	// Федеральный округ
	private final String district;
	// Население
	private final int population;
	// Дата основания или первое упоминание
	private final String foundation;

	public City(String name, String region, String district, int population, String foundation) {
		this.name = name;
		this.region = region;
		this.district = district;
		this.population = population;
		this.foundation = foundation;
	}

	public String getName() {
		return name;
	}

	public String getRegion() {
		return region;
	}

	public String getDistrict() {
		return district;
	}

	public int getPopulation() {
		return population;
	}

	public String getFoundation() {
		return foundation;
	}

	@Override
	public String toString(){
		return "City{" +
				"name='" + name +
				"', region='" + region +
				"', district='" + district +
				"', population='" + population +
				"', foundation='" + foundation + "'}";
	}
}
