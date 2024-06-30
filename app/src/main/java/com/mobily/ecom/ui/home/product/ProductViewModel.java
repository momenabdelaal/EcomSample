package com.mobily.ecom.ui.home.product;


import static com.mobily.ecom.appUtils.Constants.VIEW_SUCCESS;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;

import com.mobily.ecom.appUtils.BaseViewModel;
import com.mobily.ecom.appUtils.Constants;
import com.mobily.ecom.appUtils.MutableHelper;
import com.mobily.ecom.network.MyApplication;
import com.mobily.ecom.ui.home.product.response.LatestResponse;

import org.jetbrains.annotations.NotNull;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;


public class ProductViewModel extends BaseViewModel {


	CompositeDisposable compositeDisposable;

	public ProductViewModel(@NonNull Application application) {
		super(application);
		compositeDisposable = new CompositeDisposable();

	}

    public void getLatestProduct() {

        Disposable disposable = MyApplication.getApis()
                .                homeLatest()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new DisposableSingleObserver<LatestResponse>(){
                    @Override
                    public void onSuccess(@NotNull LatestResponse latestResponse) {
                        getMutableLiveData().setValue(new MutableHelper(VIEW_SUCCESS, latestResponse));

//
//                        switch (mainCategoryWithoutPagination.getStatus()) {
//                            case Constants.SUCCESS:
//                                getMutableLiveData().setValue(new MutableHelper(VIEW_SUCCESS, mainCategoryWithoutPagination));
//
//                                categoryAdapter.addList(mainCategoryWithoutPagination.getData());
//                                break;
//                            case Constants.Failed:
//                                getMutableLiveData().setValue(new MutableHelper(VIEW_FAILED, mainCategoryWithoutPagination.getStatus()));
//                                break;
//                            case Constants.Not_Authorization:
//                                getMutableLiveData().setValue(new MutableHelper(VIEW_NOT_Authorization, mainCategoryWithoutPagination.getStatus()));
//
//
//                                break;
//                            case Constants.Not_Found:
//                                getMutableLiveData().setValue(new MutableHelper(VIEW_NOT_FOUND, mainCategoryWithoutPagination.getStatus()));
//                                break;
//                            default:
//                                getMutableLiveData().setValue(new MutableHelper(UNKNOWN_ERROR, mainCategoryWithoutPagination.getStatus()));
//                                break;
//                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        getMutableLiveData().setValue(new MutableHelper(Constants.NETWORK_CONNECTION_ERROR,null));
                    }
                });

        compositeDisposable.add(disposable);
//        Call<>
//        compositeDisposable.add(MyApplication.getApis()
//                .homeLatest()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeWith(new DisposableObserver<LatestResponse>() {
//
//                    @Override
//                    public void onNext(@io.reactivex.annotations.NonNull LatestResponse mainResponse) {
//                        Log.e("Test", "onSubscribe: 1+++");
////                        switch (mainResponse.getStatus()) {
////                            case Constants.SUCCESS:
////                                getMutableLiveData().setValue(new MutableHelper(VIEW_SUCCESS, mainResponse));
////
////                                homeAdapter.addList(mainResponse.getData().getData());
////                                 compositeDisposable.clear();
////                                break;
////                            case Constants.Failed:
////                                getMutableLiveData().setValue(new MutableHelper(VIEW_FAILED, mainResponse.getMsg()));
////                                break;
////                            case Constants.Not_Authorization:
////                                getMutableLiveData().setValue(new MutableHelper(VIEW_NOT_Authorization, mainResponse.getMsg()));
////                                break;
////                            case Constants.Not_Found:
////                                getMutableLiveData().setValue(new MutableHelper(VIEW_NOT_FOUND, mainResponse.getMsg()));
////                                break;
////                            default:
////                                getMutableLiveData().setValue(new MutableHelper(UNKNOWN_ERROR, mainResponse.getMsg()));
////                                break;
////                        }
//
//
//                    }
//
//
//                    @Override
//                    public void onError(@io.reactivex.annotations.NonNull Throwable e) {
//                        Log.e("TAG", "onSubscribe: 2");
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.e("TAG", "onSubscribe: 3");
//                             compositeDisposable.dispose();
//                    }
//                }));


    }




    @Override
    protected void onCleared() {
        super.onCleared();
        compositeDisposable.dispose();
    }


}
