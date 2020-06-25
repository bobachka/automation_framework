package project.org.example.api.entities;


import org.example.core.FrameworkHTTPClient;
import org.example.core.Response;

public class StarWarsService extends AbstractService {
    private FrameworkHTTPClient client = new FrameworkHTTPClient();
    private String planetUrl = starwarsBaseUrl + "/planets/";

    public Response getPlanets() {
        System.out.println("Get all planets from a galaxy far, far away...");
        return client.doGet(planetUrl);
    }
}
