package ntt.db.cities.test.model;

import org.json.JSONObject;

public class City {

	private int id;
	private String name;
	private String region;
	private double lat;
	private double lon;

	public City(String name, String region) {

		this.name = name;
		this.region = region;
	}
	public City() {
		
	}

	public static City parseCityJson(JSONObject city_json) {
		City city = new City();
		city.setName(city_json.optString("name","Nessun nome"));
		city.setRegion(city_json.optString("region"));
		city.setLat(city_json.optDouble("lat"));
		city.setLon(city_json.optDouble("lon"));
		return city;
		

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	@Override
	public String toString() {
		return "City [ name=" + name + ", region=" + region + ", lat=" + lat + ", lon=" + lon + "]";
	}

}
