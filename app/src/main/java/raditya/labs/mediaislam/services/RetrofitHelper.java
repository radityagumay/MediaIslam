/*
package raditya.labs.mediaislam.services;

import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

*/
/**
 * Created by raditya on 4/1/2015.
 *//*

public class RetrofitHelper {

    private OkHttpClient httpClient;
    private RequestInterceptor interceptor;
    private RestService service;
    private RestAdapter adapter;

    public RetrofitHelper(){
        httpClient = new OkHttpClient();
        httpClient.setConnectTimeout(60000, TimeUnit.MILLISECONDS);
        httpClient.setConnectTimeout(60000, TimeUnit.MILLISECONDS);

        interceptor = new RequestInterceptor() {
            @Override
            public void intercept(RequestFacade request) {

            }
        };

        adapter = new RestAdapter.Builder().setClient(new OkClient(httpClient)).setEndpoint()

    }

    public RestService getService(){
        return service;
    }
}
*/
