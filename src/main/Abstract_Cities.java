package jeel.weather;
import java.util.*;

public abstract class Abstract_Cities {

    public abstract String getContent();
    public abstract String getURL();

    private String citiesname;
    private int weatherofcities;

    public Abstract_Cities(String citiesname, int weatherofcities) {
        this.citiesname = citiesname;
        this.weatherofcities = weatherofcities;
    }

    public String Weathercondition(){
        if (weatherofcities == 0) {
            return "sunny";
        } else if (weatherofcities == 1) {
            return "cloudy";
        } else if (weatherofcities == 2) {
            return "rainy";
        } else {
            return "notdata";
        }
    }

    public String getCitiesname() {
        return citiesname;
    }

    public String Formatingnames() {
        String citiesname = getCitiesname()
                .replace(" ", "_")
                .replace("ä", "ae")
                .replace("ö", "oe")
                .replace("ü", "ue");
        return citiesname;

    }
}





