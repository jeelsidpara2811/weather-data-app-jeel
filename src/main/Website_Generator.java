package jeel.weather;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Website_Generator {
    char a = '"';
    private  List<Abstract_Cities> citylist;

    public Website_Generator() {
        this.citylist = new ArrayList<>();
    }


    public void addcity(Abstract_Cities city) {
        citylist.add(city);
    }

    public StringBuilder getNavigation(){
        StringBuilder navigation = new StringBuilder("<h1> The Weather App</h1> \n");
        for (Abstract_Cities city : citylist) {
            navigation.append("<a href=" + a + city.getURL() + a + ">" + city.Formatingnames() + "</a>");

            navigation.append(" | ");
        }
        if( navigation.length() > 0 ){
            navigation.setLength(navigation.length() - 2);
        }

        return navigation;


    }
    public void generateWebsite() throws IOException {
        String indexcontent = "<html>\n" + "<body>\n" + getNavigation() + "\n" + "</body>\n" + "</html>";

        try (FileWriter indexWriter = new FileWriter("index.html")) {
            indexWriter.write(indexcontent);
        }catch (IOException e) {
            e.printStackTrace();
        }

        for (Abstract_Cities citiesname : citylist){
            try (FileWriter cityWriter = new FileWriter(citiesname.getURL())) {
                cityWriter.write(pageGenerator(citiesname));
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    

    public String pageGenerator(Abstract_Cities citiesname) throws IOException {
        return "<html>\n<body>\n" + getNavigation() + "\n" + citiesname.getContent() + "\n" +"</body>\n </html>";
    }
}
