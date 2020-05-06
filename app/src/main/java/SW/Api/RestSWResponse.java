package SW.Api;

import java.util.List;

public class RestSWResponse {
    private Integer count;
    private String next;
    private List<Planet> results;

    public Integer getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public List<Planet> getResults() {
        return results;
    }
}
