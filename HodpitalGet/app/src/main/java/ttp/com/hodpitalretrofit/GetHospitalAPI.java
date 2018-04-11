package ttp.com.hodpitalretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by 0047TiTANplateform_ on 2018-04-06.
 */

public interface GetHospitalAPI {
    @GET("/HomeTr_UserInfo_GetPatientList")
    // List<> to return Json Array
    Call<List<PatientList>> contributors(
            @Query("HOSPITAL") String hospital)
    ;


}
