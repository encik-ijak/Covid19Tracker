package nm.wd.main.Countries;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CovidMy {
    @SerializedName("State")
    @Expose
    private String states;
    @SerializedName("Known_cases")
    @Expose
    private int knownCases;
    @SerializedName("Discharged")
    @Expose
    private int discharged;

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public int getKnownCases() {
        return knownCases;
    }

    public void setKnownCases(int knownCases) {
        this.knownCases = knownCases;
    }

    public int getDischarged() {
        return discharged;
    }

    public void setDischarged(int discharged) {
        this.discharged = discharged;
    }

    @Override
    public String toString() {
        return "CovidMy{" +
                "states='" + states + '\'' +
                ", knownCases=" + knownCases +
                ", discharged=" + discharged +
                '}';
    }
}
