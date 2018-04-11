package ttp.com.hodpitalretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    private Retrofit retrofit;
    private TextView tv;
    //check slush!!!
    private final String BASE_URL = "http://test.cafe24app.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRetrofit();
        tv = (TextView)findViewById(R.id.tv_response);

        //create api interface
        GetHospitalAPI getHospitalAPI = retrofit.create(GetHospitalAPI.class);
        // send param to Interface method 'PatientList'
        Call<List<PatientList>> call = getHospitalAPI.contributors("Central");

        call.enqueue(new Callback<List<PatientList>>() {
            //success
            @Override
            public void onResponse(Call<List<PatientList>> call, Response<List<PatientList>> response) {
                List<PatientList> patientLists = response.body();

                for(PatientList patient : patientLists){
                    tv.append(patient.getPATIENT_CODE() +
                            "\n"+patient.getHOSPITAL() +
                            "\n"+ patient.getNAME() +
                            "\n"+patient.getGENDER()+
                            "\n"+patient.getBIRTH()+
                            "\n"+patient.getBREAKFAST()+
                            "\n"+patient.getLUNCH()+
                            "\n"+patient.getDINNER()+
                            "\n"+patient.getEXERCISE_TYPE()+
                            "\n"+patient.getEXERCISE_TIME()+
                            "\n"+patient.getSLEEP()+
                            "\n"+patient.getWAKEUP()+
                            "\n"+patient.getGROUPS()+
                            "\n"+patient.getMEMO()+
                            "\n"+patient.getTEST_COUNT());
                }
            }

            //fail
            @Override
            public void onFailure(Call<List<PatientList>> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Fail!!!!!!!!!!!!!!!", Toast.LENGTH_LONG).show();

            }
        });
    }

    private void initRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}