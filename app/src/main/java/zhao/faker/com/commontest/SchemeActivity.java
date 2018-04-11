package zhao.faker.com.commontest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * @author Faker.zhao@dingtone.me
 * @description
 * @date 2018\4\11 0011
 */
public class SchemeActivity extends AppCompatActivity {

    private static final String TAG = "SchemeActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheme);


        Intent intent = getIntent();
        if (intent != null){
            Uri uri = intent.getData();

            if (uri != null){
                String dataString = intent.getDataString();
                String scheme = uri.getScheme();
                String host = uri.getHost();
                String path = uri.getPath();
                String query = uri.getQuery();
                Log.i(TAG,"dataString = " + dataString + " | scheme = " + scheme + " | host = " + host+ " | path = " + path + " | query = " + query);
            }
        }
    }


}
