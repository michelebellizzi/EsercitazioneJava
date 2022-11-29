package ntt.db.cities.test;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import org.eclipse.swt.widgets.Shell;
import org.json.JSONArray;
import org.json.JSONObject;

import ntt.db.cities.test.model.City;
import ntt.db.cities.test.utility.Repository;
import ntt.db.cities.test.utility.Request;

public class MyApp {
	protected Shell shell;
	private static List<City> mCities;
	private static Repository repository;
	

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		mCities= new ArrayList<City>();
		String url="http://www.bitesrl.it/test/course/requests/script.php?type=cities";
		String response= Request.doRequest(url);
		JSONArray array=new JSONArray(response);
		repository=Repository.getIstance();
		repository.deleteAll();
	
		for(int i = 0; i<array.length();i++) {
			
			JSONObject city_json=array.optJSONObject(i);
		
			City city = City.parseCityJson(city_json);
		
			System.out.println(city);
			mCities.add(city);
			repository.insertCity(city);
		}
		System.out.println("citta internet");
		System.out.println(mCities);
		
		mCities= repository.getAllCites();
		System.out.println("citta db");
		System.out.println(mCities);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyApp window = new MyApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
