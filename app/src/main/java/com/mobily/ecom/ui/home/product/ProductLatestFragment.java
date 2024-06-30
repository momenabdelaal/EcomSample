package com.mobily.ecom.ui.home.product;


import static com.mobily.ecom.appUtils.Constants.VIEW_SUCCESS;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.chootdev.csnackbar.Type;
import com.mobily.ecom.R;
import com.mobily.ecom.appUtils.MessagesManager;
import com.mobily.ecom.appUtils.MutableHelper;
import com.mobily.ecom.databinding.FragmentCategoryBinding;
import com.mobily.ecom.databinding.FragmentHomeBinding;
import com.mobily.ecom.main.MainActivity;
import com.mobily.ecom.ui.home.HomeAdapter;
import com.mobily.ecom.ui.home.product.pager.CustomPagerAdapter;
import com.mobily.ecom.ui.home.product.response.LatestResponse;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

public class ProductLatestFragment extends Fragment {

    public Context context;
    public Activity activity;
    FragmentCategoryBinding binding;

    View rootView;
    ProductAdapter adapter;


    StaggeredGridLayoutManager layoutManager;


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("FragmentStarted", "FragmentStarted");

        handleBackButtonCallback();


    }

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_category, container, false);

        init();
        return rootView;
    }


    public void init() {

        rootView = binding.getRoot();
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        activity = getActivity();

        layoutManager = new StaggeredGridLayoutManager(2,
                StaggeredGridLayoutManager.VERTICAL);
        setRecyclerViewCategory();
        getLatestProduct();


    }

    private void setRecyclerViewCategory() {

        LayoutAnimationController animation = AnimationUtils
                .loadLayoutAnimation(context, R.anim.layout_animation);
        binding.rvProduct.setLayoutManager(layoutManager);
        binding.rvProduct.setLayoutAnimation(animation);
        adapter = new ProductAdapter(/* new ArrayList<>() */);
        binding.rvProduct.setAdapter(adapter);

//		adapter.onItemClickListener = new OnItemClickListenerView() {
//			@Override
//			public void onItemClick(View view, int position) {
////                if (type.equals("owner"))
//				Bundle bundle = new Bundle();
//				bundle.putInt(Constants.CATEGORY_ID, adapter.getList().get(position).getId());
//				bundle.putString(Constants.CATEGORY_NAME, adapter.getList().get(position).getName());
//				bundle.putInt(Constants.CATEGORY_Position, position);
//				Navigation.findNavController(view).navigate(R.id.productFragment, bundle);
//			}
//		};
//
//		binding.swipe.setColorSchemeResources(R.color.textColor);
//
//		binding.swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//			@Override
//			public void onRefresh() {
//				doRefresh();
//			}
//		});




		/*StaggeredGridLayoutManager layoutManager1 = new StaggeredGridLayoutManager(1,
				StaggeredGridLayoutManager.HORIZONTAL);
		LayoutAnimationController animation1 = AnimationUtils
				.loadLayoutAnimation(context, R.anim.layout_animation);
		binding.rvMainCategory.setLayoutManager(layoutManager1);
		binding.rvMainCategory.setLayoutAnimation(animation1);
		cadapter = new CategoryAdapter(*//* new ArrayList<>() *//*);
		binding.rvMainCategory.setAdapter(cadapter);
		scrollListener1 = new EndlessRecyclerViewScrollListener(layoutManager1) {
			@Override
			public void onLoadMore(int page, int totalItemsCount) {
				getMainCategory(page, "");
			}
		};
		binding.rvMainCategory.addOnScrollListener(scrollListener1);*/

    }

    private void getLatestProduct() {
        ProductViewModel viewModel = new ViewModelProvider(this).get(ProductViewModel.class);

        ((MainActivity) activity).activityMainBinding.progressbar.setVisibility(View.VISIBLE);
//		binding.progressbar.setVisibility(View.VISIBLE);
        viewModel.getLatestProduct();
        viewModel.getMutableLiveData().observe(getViewLifecycleOwner(), new Observer<MutableHelper>() {
            @Override
            public void onChanged(MutableHelper mutableHelper) {
                ((MainActivity) Objects.requireNonNull(activity)).activityMainBinding.progressbar.setVisibility(View.GONE);
                binding.progressbar.setVisibility(View.GONE);
                adapter.addList(((LatestResponse) mutableHelper.value).getProducts());
            initSlideAdapter(binding.imageSlider,((LatestResponse) mutableHelper.value).getProducts().get(0).getImage());

//
//				switch (mutableHelper.key) {
//					case VIEW_SUCCESS:
//						((MainActivity) Objects.requireNonNull(activity)).activityMainBinding.progressbar.setVisibility(View.GONE);
////                        MessagesManager.sToast(context, mutableHelper.value.toString());
//						if (((MainResponse) mutableHelper.value).getData().getTotal() == 0)
//							MessagesManager.showConnectionSnackBar(context, Type.WARNING, "لا يوجد بيانات حاليا");
//						binding.progressbar.setVisibility(View.GONE);
//						binding.error.errorLayout.setVisibility(View.GONE);
//						binding.progressbar.setVisibility(View.GONE);
//						getActivity().getViewModelStore();
//						Log.e("TAG", "onChanged:??? ");
//						break;
//					case VIEW_FAILED:
//						binding.progressbar.setVisibility(View.GONE);
//						MessagesManager.showConnectionSnackBar(context, Type.ERROR, mutableHelper.value.toString());
//						((MainActivity) Objects.requireNonNull(activity)).activityMainBinding.progressbar.setVisibility(View.GONE);
//
//						binding.error.errorLayout.setVisibility(View.VISIBLE);
//						binding.progressbar.setVisibility(View.GONE);
//						binding.swipe.setVisibility(View.GONE);
//						showErrorMessage(binding.error.errorLayout, binding.error.errorImage, binding.error.errorMessage,
//								R.drawable.ic_no_ruslt, mutableHelper.value.toString());
//
//						break;
//
//					case Constants.NETWORK_CONNECTION_ERROR:
//						binding.progressbar.setVisibility(View.GONE);
//						MessagesManager.sToastNoServes(context, R.string.noServices);
//						((MainActivity) requireActivity()).activityMainBinding.progressbar.setVisibility(View.GONE);
//						((MainActivity) Objects.requireNonNull(activity)).activityMainBinding.progressbar.setVisibility(View.GONE);
//						MessagesManager.sToastNoServes(context, R.string.noServices);
//						((MainActivity) requireActivity()).activityMainBinding.progressbar.setVisibility(View.GONE);
//
//						break;
//				}


            }
        });

    }


    private void handleBackButtonCallback() {
        final OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                getActivity().finish();

            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);
    }
    private void initSlideAdapter(SliderView sliderView, List<String> imageModelList) {
        imageModelList.add("test");
        imageModelList.add("test");
        imageModelList.add("test");
        imageModelList.add("test");

        CustomPagerAdapter  customPagerAdapter = new CustomPagerAdapter(context);
        sliderView.setSliderAdapter(customPagerAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();
        customPagerAdapter.addList(imageModelList);


        sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                Log.i("GGG", "onIndicatorClicked: " + sliderView.getCurrentPagePosition());
            }
        });
    }

}