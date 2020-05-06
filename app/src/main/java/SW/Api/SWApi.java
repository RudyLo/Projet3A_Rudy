package SW.Api;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SWApi {

    @GET("/api/planets/")
    Call <RestSWResponse> getSWResponse();

}
