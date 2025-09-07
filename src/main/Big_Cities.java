package jeel.weather;
import java.util.List;


//
public class Big_Cities extends Abstract_Cities{

    private List<String> districtsofbigcities;

    public Big_Cities(String citiesname,int weatherofcities,List<String> district) {
        super(citiesname,weatherofcities);
        this.districtsofbigcities = district;
    }
    public String getContent(){
        String listofdistricts = (String.join(", " , districtsofbigcities.subList(0, districtsofbigcities.size() -1))+ " and " + districtsofbigcities.get(districtsofbigcities.size() - 1))
                .replace("ä","ae")
                .replace("ü","ue")
                .replace("ö","oe");

        return "<p><h3>Weather of " + Formatingnames() +"</h3><p>"+" It is " + Weathercondition() + " in " + Formatingnames() + ".</p> <p> This also applies to " + listofdistricts + ".</p>";
    }
    public String getURL(){

        return "weather_big_city_" + Formatingnames().toLowerCase() + ".html";
    }
}
