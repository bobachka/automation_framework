package project.org.example.api;

import org.example.core.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.org.example.api.entities.StarWarsService;

public class ApiPlanetTest {
    private StarWarsService starWarsService = new StarWarsService();

    @Test
    public void getPlanetsTest(){
        Response response = starWarsService.getPlanets();
        int code = response.getCode();
        boolean containsPlanets = response.getBody().contains("Tatooine");
        Assert.assertTrue(code == 200 && containsPlanets, "Planets are not shown");
    }
}
