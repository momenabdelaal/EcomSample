package com.mobily.ecom.ui.home;



import android.app.Application;

import androidx.annotation.NonNull;


import com.mobily.ecom.appUtils.BaseViewModel;

import io.reactivex.disposables.CompositeDisposable;


public class HomeViewModel extends BaseViewModel {


	CompositeDisposable compositeDisposable;

	public HomeViewModel(@NonNull Application application) {
		super(application);
		compositeDisposable = new CompositeDisposable();

	}

//    public void getMainCategories(int page , HomeAdapter homeAdapter, MainSearch mainSearch) {
//        compositeDisposable.add(MyApplication.getApis()
//                .getMainCategories(UserPreferenceHelper.getCurrentLanguage(getApplication()), mainSearch)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeWith(new DisposableObserver<MainResponse>() {
//
//                    @Override
//                    public void onNext(@io.reactivex.annotations.NonNull MainResponse mainResponse) {
//                        Log.e(TAG, "onSubscribe: 1+++");
//                        switch (mainResponse.getStatus()) {
//                            case Constants.SUCCESS:
//                                getMutableLiveData().setValue(new MutableHelper(VIEW_SUCCESS, mainResponse));
//                                if (page == 1)
//                                homeAdapter.reset();
//                                homeAdapter.addList(mainResponse.getData().getData());
//                                 compositeDisposable.clear();
//                                break;
//                            case Constants.Failed:
//                                getMutableLiveData().setValue(new MutableHelper(VIEW_FAILED, mainResponse.getMsg()));
//                                break;
//                            case Constants.Not_Authorization:
//                                getMutableLiveData().setValue(new MutableHelper(VIEW_NOT_Authorization, mainResponse.getMsg()));
//                                break;
//                            case Constants.Not_Found:
//                                getMutableLiveData().setValue(new MutableHelper(VIEW_NOT_FOUND, mainResponse.getMsg()));
//                                break;
//                            default:
//                                getMutableLiveData().setValue(new MutableHelper(UNKNOWN_ERROR, mainResponse.getMsg()));
//                                break;
//                        }
//
//
//                    }
//
//
//                    @Override
//                    public void onError(@io.reactivex.annotations.NonNull Throwable e) {
//                        Log.e(TAG, "onSubscribe: 2");
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.e(TAG, "onSubscribe: 3");
//                             compositeDisposable.dispose();
//                    }
//                }));
//
//
//    }




    @Override
    protected void onCleared() {
        super.onCleared();
        compositeDisposable.dispose();
    }


}
