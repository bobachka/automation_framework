package project.org.example.api.entities;

import org.example.core.FrameworkHTTPClient;
import org.example.core.Response;

public class ReqresService extends AbstractService {
    private FrameworkHTTPClient client = new FrameworkHTTPClient();
    private String createUserUrl = reqresbaseUrl + "/api/users/";
    private String updateUserUrl = reqresbaseUrl + "/api/users/55/";

    public Response doPost(String body) {
        System.out.println("Post started");
        return client.doPost(createUserUrl, body);
    }

    public Response doPut(String body) {
        System.out.println("Put started");
        return client.doPut(updateUserUrl, body);
    }

    public Response doDelete() {
        System.out.println("Delete started");
        return client.doDelete(updateUserUrl);
    }
}
