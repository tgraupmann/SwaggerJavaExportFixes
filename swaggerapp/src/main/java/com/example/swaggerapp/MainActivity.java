package com.example.swaggerapp;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import io.swagger.client.api.LookupsControlEndpointApi;
import io.swagger.client.model.ResponseOutputModelListGamingServerRegionModel;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread() {
            @Override
            public void run() {
                LookupsControlEndpointApi apiInstance = new LookupsControlEndpointApi();
                try {
                    Log.d(TAG, "*** Invoke: lookupsGamingServerRegions");
                    ResponseOutputModelListGamingServerRegionModel result = apiInstance.lookupsGamingServerRegions();
                    Log.d(TAG, "*** Got Result: lookupsGamingServerRegions");
                    System.out.println(result);
                } catch (Exception e) {
                    Log.d(TAG, "*** Exception: lookupsGamingServerRegions");
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(MainActivity.this, "Exception when calling LookupsControlEndpointApi#lookupsGamingServerRegions", Toast.LENGTH_LONG).show();
                        }
                    });
                    e.printStackTrace();
                }
            }
        };
        thread.start();

    }
}
