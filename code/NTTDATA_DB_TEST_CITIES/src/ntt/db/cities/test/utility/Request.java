package ntt.db.cities.test.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Request {
	public static String doRequest(String urlString) {

		String result = null;
		URL url = null;

		try {
			url = new URL(urlString);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (url != null) {
			HttpURLConnection connection = null;
			InputStream stream_in = null;
			try {
				connection = (HttpURLConnection) url.openConnection();
				connection.setConnectTimeout(1000);
				connection.setReadTimeout(1000);
				connection.setRequestMethod("GET");
				int code = connection.getResponseCode();
				if (code == HttpURLConnection.HTTP_OK) {
					stream_in = connection.getInputStream();
				} else {
					stream_in = connection.getErrorStream();
				}
				BufferedReader reader = new BufferedReader(new InputStreamReader(stream_in));
				StringBuilder sb = new StringBuilder();
				String line = "";
				while ((line = reader.readLine()) != null) {

					sb.append(line);

				}
				result = sb.toString();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (stream_in != null) {
					try {
						stream_in.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (connection != null) {
						connection.disconnect();

					}
				}
			}
		}

		return result;

	}
}
