package th.rosenheim.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Small_CitiesTest {
    @Test
    public void testgetContent() {
        Small_Cities a = new Small_Cities("Rosenheim",1) ;
        String expectedgetContent = "<p><h3>Weather of Rosenheim</h3></p><p>It is cloudy in Rosenheim.</p>";
        String actualgetContent = a.getContent();
        assertEquals(expectedgetContent, actualgetContent);
    }
    @Test
    public void testgetURL(){
        Small_Cities a = new Small_Cities("Rosenheim",1) ;
        String expectedgetContent = "weather_small_city_"+ a.Formatingnames().toLowerCase() +".html";
        String actualgetContent = a.getURL();
        assertEquals(expectedgetContent, actualgetContent);
    }

}