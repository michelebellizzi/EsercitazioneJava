package ntt.db.cities.test.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

import ntt.db.cities.test.model.City;

public class Repository {
	private String dbHost = "localhost";
	private String dbPort = "3306";
	private String dbUser = "root";
	private String dbPassword = "barniani23";
	private String dbName = "db_citta";

	private Connection connection;

	private volatile static Repository istance = null;

	public synchronized static Repository getIstance() {
		if (istance == null) {
			istance = new Repository();
		}
		return istance;
	}

	public Repository() {
		this.connect();
	}

	private void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName, dbUser,
					dbPassword);
			System.out.println("connection is valid " + connection.isValid(5));

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<City> getAllCites() {
		ArrayList<City> cities = new ArrayList<>();
		String sql = "SELECT * from City order by region ASC";
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				City city = new City();
				city.setId(result.getInt("id"));
				city.setName(result.getString("name"));
				city.setRegion(result.getString("region"));
				city.setLat(result.getDouble("lat"));
				city.setLon(result.getDouble("lon"));
				cities.add(city);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cities;
	}

	public boolean updateCity(City c) {
		String sql= String.format("UPDATE City SET name='%s' WHERE id=%d", c.getName(), c.getId());
		Statement statemant;
		try {
			statemant = connection.createStatement();
			statemant.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean delateCity(City c) {
		String sql = String.format("DELETE FROM City WHERE id=%d", c.getId());
		try {
			Statement statment = connection.createStatement();
			statment.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteAll() {

		String sql = "DELETE FROM City";
		try {
			Statement statement = connection.createStatement();
			return statement.executeUpdate(sql) == 1;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

	public boolean insertCity(City c) {
		try {
			Statement statement = connection.createStatement();
			String name = c.getName().replace("'", "''");
			String region = c.getRegion().replace("'", "''");
			String sql = "INSERT INTO City(name,region,lat,lon) values('" + name + "','" + region + "', " + c.getLat()
					+ ", " + c.getLon() + ")";
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
