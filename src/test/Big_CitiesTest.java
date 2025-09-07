package th.rosenheim.oop;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Big_CitiesTest {
    @Test
    public void testgetContent() {
        Big_Cities b = new Big_Cities("München",0, List.of("Schwabing","Sendling","Lehel", "Nymphenburg"));
        String expectedgetContent = "<p><h3>Weather of Muenchen</h3><p> It is sunny in Muenchen.</p> <p> This also applies to Schwabing, Sendling, Lehel and Nymphenburg.</p>";
        String actualgetContent = b.getContent();
        assertEquals(expectedgetContent, actualgetContent);
    }
    @Test
    public void testgetURL(){
        Big_Cities b = new Big_Cities("München",0, List.of("Schwabing","Sendling","Lehel and Nymphenburg"));
        String expectedgetURL = "weather_big_city_" + b.Formatingnames().toLowerCase() + ".html";
        String actualgetURL = b.getURL();
        assertEquals(expectedgetURL, actualgetURL);
    }

}