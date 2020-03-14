package nm.wd.main;

import nm.wd.main.Countries.*;

public class Main {

    public static void main(String[] args) {
        String myJson;
        CovidMyProc cmp = new CovidMyProc();
        CovidMy[] cm = cmp.getMyJson("https://raw.githubusercontent.com/encik-ijak/JavaEssentialTraining/master/JSON/covidMY.json");

//        CovidAllProc cap = new CovidAllProc();
//        cap.getAllCountryJson("https://corona.lmao.ninja/all");
//
//        CovidByCountryProc cbp = new CovidByCountryProc();
//        cbp.getByCountry("https://corona.lmao.ninja/countries");

        System.out.println(cm[0].getDischarged());
    }
}
