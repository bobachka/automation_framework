package project.org.example.api;

import org.example.core.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.org.example.api.entities.ReqresService;

public class ReqresTests {
    private ReqresService reqresService = new ReqresService();

    @Test
    public void postTest() {
        Response response = reqresService.doPost("{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}");
        int code = response.getCode();
        boolean containsJob = response.getBody().contains("leader");
        Assert.assertTrue(code == 201 && containsJob, "User not added");

    }

    @Test
    public void putTest() {
        Response response = reqresService.doPut("{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}");
        int code = response.getCode();
        boolean containsJob = response.getBody().contains("zion");
        Assert.assertTrue(code == 200 && containsJob, "User not updated");
    }

    @Test
    public void deleteTest() {
        Response response = reqresService.doDelete();
        int code = response.getCode();
        Assert.assertTrue(code == 204, "User not deleted");
    }
}
