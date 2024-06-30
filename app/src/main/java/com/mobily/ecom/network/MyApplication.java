package com.mobily.ecom.network;


import android.app.Application;
import android.util.Log;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.reactivex.plugins.RxJavaPlugins;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyApplication extends Application {

    private static MyApplication INSTANCE;
    private static Retrofit retrofit = null;

    public static final String BASE_URL = "http://192.168.1.11/dashboard/e-commerce-backend-main/api/";
    public static final String Photo_URL = "http://192.168.1.11/dashboard/e-commerce-backend-main/public/assets/admin/img/160x160/img2.jpg";


    public static MyApplication getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MyApplication();
        }
        return INSTANCE;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        RxJavaPlugins.setErrorHandler(throwable -> {
        }); // nothing or some logging
    }

//    public void setMessageReceiverListener(RealTimeReceiver.MessageReceiverListener listener) {
//        RealTimeReceiver.messageReceiverListene = listener;
//    }

    private static Retrofit getClient() {
        if (retrofit == null) {
            HttpLoggingInterceptor logging =
                    new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                        @Override
                        public void log(@NotNull String message) {
                            Log.e("response", message);
                        }
                    });
//            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
//            File httpCacheDirectory = new File(getInstance().getCacheDir(), "offlineCache");
//            //10 MB
//            Cache cache = new Cache(httpCacheDirectory, 10 * 1024 * 1024);
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .writeTimeout(20, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .addInterceptor(interceptor)
                    .build();
//            OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
//                @NotNull
//                @Override
//                public Response intercept(@NotNull Chain chain) throws IOException {
//                    Request newRequest = chain.request().newBuilder()
//                            .addHeader("Authorization", "Bearer " + token)
//                            .build();
//                    return chain.proceed(newRequest);
//                }
//            })
//                    .addInterceptor(logging)
//
//                    .connectTimeout(60, TimeUnit.SECONDS)
//                    .writeTimeout(60, TimeUnit.SECONDS)
//                    .readTimeout(60, TimeUnit.SECONDS)
//                    .build();
//
// .cache(cache)
//                    .addNetworkInterceptor(logging)
//                    .addInterceptor(provideOfflineCacheInterceptor())
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    //Accept Any SSL Certificate
                    //  .client(okHttpClient)

                    .build();
        }
        return retrofit;
    }


    private static Interceptor provideOfflineCacheInterceptor() {

        return new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                try {
                    return chain.proceed(chain.request());
                } catch (Exception e) {


                    CacheControl cacheControl = new CacheControl.Builder()
                            .onlyIfCached()
                            .maxStale(1, TimeUnit.DAYS)
                            .build();


                    Request offlineRequest = chain.request().newBuilder()
                            .cacheControl(cacheControl)
                            .build();
                    return chain.proceed(offlineRequest);
                }
            }
        };
    }


    public static Api getApis() {
        return getClient().create(Api.class);
    }

}
