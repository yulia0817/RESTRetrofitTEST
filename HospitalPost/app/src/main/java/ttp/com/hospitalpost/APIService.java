package ttp.com.hospitalpost;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by 0047TiTANplateform_ on 2018-04-06.
 */


public interface APIService {

    //put real api
    @POST("/HomeTr_UserInfo_AddUpdate")
    @FormUrlEncoded
    Call<Post> savePost(
                        @Field("PATIENT_CODE") String PATIENT_CODE,
                        @Field("HOSPITAL") String HOSPITAL,
                        @Field("NAME") String NAME,
                        @Field("GENDER") String GENDER,
                        @Field("BIRTH") String BIRTH,
                        @Field("BREAKFAST") String BREAKFAST,
                        @Field("LUNCH") String LUNCH,
                        @Field("DINNER") String DINNER,
                        @Field("EXERCISE_TYPE") String EXERCISE_TYPE,
                        @Field("EXERCISE_TIME") String EXERCISE_TIME,
                        @Field("SLEEP") String SLEEP,
                        @Field("WAKEUP") String WAKEUP,
                        @Field("GROUPS") String GROUPS,
                        @Field("MEMO") String MEMO,
                        @Field("TEST_COUNT") int TEST_COUNT
    );
}


