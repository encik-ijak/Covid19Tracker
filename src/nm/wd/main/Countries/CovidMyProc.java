package nm.wd.main.Countries;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class CovidMyProc {

    public CovidMy[] getMyJson(String myJson) {
        String strJson = "";
        CovidMy[] cm = null;

        try {
            URL url = new URL(myJson);
            InputStreamReader reader = new InputStreamReader(url.openStream());
            cm = new Gson().fromJson(reader, CovidMy[].class);

//            for (CovidMy covidMy:
//                 cm) {
//                System.out.println(covidMy);
//            }
//
//            System.out.println(cm[0].getDischarged());

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(cm[0].getDischarged());
        return cm;
    }
}
