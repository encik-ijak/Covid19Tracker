package nm.wd.main.Countries;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CovidAllProc {

    public void getAllCountryJson(String AllJsonURL) {

        try {
            URL url = new URL(AllJsonURL);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.addRequestProperty("User-Agent", "Mozilla/4.76");
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if(responseCode != 200)
                throw new RuntimeException("HttpResponseCode: "+responseCode);
            else {
                Gson gson = new Gson();
                CovidAll ca = null;
                InputStreamReader reader = new InputStreamReader(conn.getInputStream());
                ca = gson.fromJson(reader, CovidAll.class);
                System.out.println("Cases: "+ca.getCases());
                System.out.println("Deaths: "+ca.getDeaths());
                System.out.println("Recovered: "+ca.getRecovered());
                System.out.println();
                System.out.println(ca.toString());

                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
