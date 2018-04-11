package ttp.com.hospitalpost;

/**
 * Created by 0047TiTANplateform_ on 2018-04-06.
 */

public class ApiUtils {

    public static final String BASE_URL = "http://test.cafe24app.com"; // change url to use

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
