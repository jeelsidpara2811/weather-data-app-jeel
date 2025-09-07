package jeel.weather;

public class Small_Cities extends Abstract_Cities{

    public Small_Cities(String citiesname, int weatherofcities) {
        super(citiesname, weatherofcities);
    }
    public String getContent(){
        return "<p><h3>Weather of " + Formatingnames() +"</h3></p>"+"<p>It is " + Weathercondition() + " in " + Formatingnames() + ".</p>";
    }
    public String getURL(){
        return "weather_small_city_" + Formatingnames().toLowerCase() + ".html";
    }
}
