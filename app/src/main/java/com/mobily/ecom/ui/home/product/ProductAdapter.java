package com.mobily.ecom.ui.home.product;

import static com.mobily.ecom.network.MyApplication.Photo_URL;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mobily.ecom.R;
import com.mobily.ecom.appUtils.Constants;
import com.mobily.ecom.appUtils.OnItemClickListenerView;
import com.mobily.ecom.databinding.ItemHomeRowBinding;
import com.mobily.ecom.ui.home.model.ModelData;
import com.mobily.ecom.ui.home.product.response.ProductModel;

import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.List;


public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.HomeHolder>  {

   // public List<HomeModel> itemList;
    Context context;
    List<ProductModel> categoryDataList;
    public OnItemClickListenerView onItemClickListener;
    public ProductAdapter() {
       // this.itemList = itemList;
        categoryDataList =new ArrayList<>();

    }

    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        ItemHomeRowBinding binding =
                DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),
                        R.layout.item_home_row, viewGroup, false);

        context = viewGroup.getContext();

        return new HomeHolder(binding);

    }

    @SuppressLint("CheckResult")
    @Override
    public void onBindViewHolder(@NonNull final HomeHolder viewHolder, final int i) {

        ProductModel modelData = categoryDataList.get(i);


        viewHolder.binding.tvName.setText(Html.fromHtml(modelData.getName()));
        viewHolder.binding.tvJob.setText(Html.fromHtml(modelData.getDescription()));

                Glide.with(context)
                .load(R.drawable.monitors)
                        // Uri of the picture
                .into(viewHolder.binding.ivProduct);

//        CategoryModel model = categoryDataList.get(i);
//        viewHolder.binding.tvCategoryName.setText(model.getName());
//
//        RequestOptions requestOptions = new RequestOptions();
//    //    requestOptions.placeholder(R.color.base_color);
//        requestOptions.error(UtilsColor.getRandomDrawbleColor());
//       // requestOptions.override(500,200);
//        requestOptions.diskCacheStrategy(DiskCacheStrategy.ALL);
//
//       /* viewHolder.binding.itemView.setCardBackgroundColor(Color.TRANSPARENT);
//        viewHolder.binding.itemView.setCardElevation(0);*/
//         //ParntImage
//
//        Glide.with(context)
//                .load(model.getImage())
//                .apply(requestOptions)
//               //  .transition(DrawableTransitionOptions.withCrossFade())
//                .listener(new RequestListener<Drawable>() {
//                    @Override
//                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
//                         viewHolder.binding.prograssLoadPhoto.setVisibility(View.GONE);
//                        requestOptions.autoClone();
//                        requestOptions.clone();
//
//
//                        return false;
//                    }
//
//                    @Override
//                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
//                        viewHolder.binding.prograssLoadPhoto.setVisibility(View.GONE);
//                        requestOptions.autoClone();
//                        requestOptions.clone();
//
//                        return false;
//                    }
//                })
//                .into(viewHolder.binding.ivCategory);
//
//
//
//        //childImge
//        Glide.with(context)
//                .load(model.getIcon()) // Uri of the picture
//                .into(viewHolder.binding.iconCategory);

        if (onItemClickListener != null) {
            viewHolder.itemView.setOnClickListener(v ->
                    onItemClickListener.onItemClick(v, i));
        }


    }

    @Override
    public int getItemCount() {
        return  categoryDataList.size();


    }

    public void addList(List<ProductModel> list) {
        categoryDataList.addAll(list);
        notifyDataSetChanged();
    }

    public void reset() {
        categoryDataList.clear();
        notifyDataSetChanged();
    }

    public List<ProductModel> getList() {
        return categoryDataList;
    }
    public static class HomeHolder extends RecyclerView.ViewHolder {

        ItemHomeRowBinding binding;


        public HomeHolder(@NonNull ItemHomeRowBinding bindingView) {
            super(bindingView.getRoot());
            this.binding = bindingView;
        }

    }
}

