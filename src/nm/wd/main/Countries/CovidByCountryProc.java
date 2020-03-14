package nm.wd.main.Countries;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CovidByCountryProc {

    public void getByCountry(String jsonUrl) {

        try {
            URL url = new URL(jsonUrl);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.addRequestProperty("User-Agent", "Mozilla/4.76");
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if(responseCode != 200)
                throw new RuntimeException("HttpResponseCode: "+responseCode);
            else {
                Gson gson = new Gson();
                CovidByCountry[] ca = null;
                InputStreamReader reader = new InputStreamReader(conn.getInputStream());
                ca = gson.fromJson(reader, CovidByCountry[].class);
                System.out.println("Country: "+ca[0].getCountry());
                System.out.println("Cases: "+ca[0].getCases());
                System.out.println("Deaths: "+ca[0].getDeaths());
                System.out.println("Recovered: "+ca[0].getRecovered());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
