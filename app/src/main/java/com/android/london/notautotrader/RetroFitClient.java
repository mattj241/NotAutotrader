/**
 * TODO:
 */

package com.android.london.notautotrader;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitClient {
    private static Retrofit NoAuthClient = null;
    private static Retrofit AuthClient = null;
    private static String apiUrl = "https://accomplistwebapi.azurewebsites.net/api/";
    private static Context context = null;

    /**
     *  Get an instance without authenticating user credentials
     * @return unauthenticated instance
     */
    public static Retrofit getInstanceNoAuthClient() {
        if(NoAuthClient == null)
        {
            OkHttpClient httpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request request = chain.request();
                    Response firstResponse = null;
                    try {
                        firstResponse = chain.proceed(request.newBuilder().build());
                    }
                    catch(Exception e)
                    {
                        backgroundThreadLongToast(context,"Something went wrong: Could not connect to server");
                        throw new IOException();
                    }
                    if(firstResponse.code()==200)
                    {
                        return firstResponse;
                    }
                    else
                    {
                        String errorMessage = firstResponse.message();
                        String error = firstResponse.body().string();
                        error = error.replace("\"","");
                        if(!error.trim().isEmpty())
                        {
                            errorMessage+="-"+error;
                        }
                        backgroundThreadLongToast(context,"Error "+ errorMessage);
                        throw new IOException(error);
                    }
                }
            }).build();
            NoAuthClient = new Retrofit.Builder().baseUrl(apiUrl).addConverterFactory(GsonConverterFactory.create()).client(httpClient).build();
        }
        return NoAuthClient;
    }


    /**
     * TODO
     * @param context
     * @param msg
     */
    public static void backgroundThreadLongToast(final Context context, final String msg)
    {
        if(context != null && msg != null)
        {
            new Handler(Looper.getMainLooper()).post(new Runnable()
            {

                @Override
                public void run()
                {
                    Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
                }
            });
        }
    }

    /**
     * Sets the context for the instance to given context object
     * @param con: Given context object
     */
    public static void setContext(Context con)
    {
        context = con;
    }
}
