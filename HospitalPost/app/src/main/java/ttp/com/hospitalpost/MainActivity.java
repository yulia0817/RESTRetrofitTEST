package ttp.com.hospitalpost;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ttp.com.hospitalpost.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView mResponseTv;
    private APIService mAPIService;
    ActivityMainBinding b;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mAPIService = ApiUtils.getAPIService();

        b.btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pCode = b.edtPcode.getText().toString();
                String hCode = b.edtHcode.getText().toString();

                if (!TextUtils.isEmpty(pCode) && !TextUtils.isEmpty(hCode)) {
                    sendPost(pCode, hCode);
                }
            }
        });


    }

    public void sendPost(String pCode, String hCode) {
        int id = b.radioGen.getCheckedRadioButtonId();
        RadioButton rb = findViewById(id);
        mAPIService.savePost(pCode, hCode,
                b.edtPName.getText().toString(),
                rb.getText().toString(),
                b.edtPbirth.getText().toString(),
                b.edtPBre.getText().toString(),
                b.edtPlunch.getText().toString(),
                b.edtPDinner.getText().toString(),
                b.edtPExc.getText().toString(),
                b.edtPExcTime.getText().toString(),
                b.edtPSleep.getText().toString(),
                b.edtPWakeup.getText().toString(),
                b.edtPGroup.getText().toString(),
                b.edtPMemo.getText().toString(),
                Integer.parseInt(b.edtPTestNum.getText().toString())
                 ).enqueue(new Callback<Post>() {

            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {

                if (response.isSuccessful()) {
//                    showResponse(response.body().toString());
                    Toast.makeText(MainActivity.this, "post submitted to API", Toast.LENGTH_SHORT).show();
                    Log.i(TAG, "post submitted to API." + response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                Log.e(TAG, "Unable to submit post to API.");
            }
        });
    }

//    public void showResponse(String response) {
//        if (mResponseTv.getVisibility() == View.GONE) {
//            mResponseTv.setVisibility(View.VISIBLE);
//        }
//        mResponseTv.setText(response);
//    }
}
