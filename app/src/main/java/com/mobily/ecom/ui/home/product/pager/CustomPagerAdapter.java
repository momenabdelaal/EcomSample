package com.mobily.ecom.ui.home.product.pager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mobily.ecom.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Momen on 5/20/2021
 */
public class CustomPagerAdapter extends SliderViewAdapter<CustomPagerAdapter.SliderAdapterVH> {

    private Context context;
    private List<String> mSliderItems = new ArrayList<>();

    public CustomPagerAdapter(Context context) {
        this.context = context;
    }

    public void addList(List<String> list) {
        mSliderItems.addAll(list);

        notifyDataSetChanged();
    }

    public void deleteItem(int position) {
        this.mSliderItems.remove(position);
        notifyDataSetChanged();
    }

    public void addItem(String sliderItem) {
        this.mSliderItems.add(sliderItem);
        notifyDataSetChanged();
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pager, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, final int position) {

//        String sliderItem = mSliderItems.get(position);
//
//        viewHolder.textViewDescription.setText(sliderItem.getType());
//        viewHolder.textViewDescription.setTextSize(16);
//        viewHolder.textViewDescription.setTextColor(Color.WHITE);
//        Glide.with(viewHolder.itemView)
//                .load(sliderItem.getImage())
//                .fitCenter()
//                .into(viewHolder.imageViewBackground);
////        viewHolder.imageViewBackground.setImageDrawable(context.getDrawable(R.drawable.image_test));
//
//        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "This is item in position " + position, Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return 4;
    }

    class SliderAdapterVH extends ViewHolder {

        View itemView;
        ImageView imageViewBackground;
        ImageView imageGifContainer;
        TextView textViewDescription;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
           // imageGifContainer = itemView.findViewById(R.id.iv_gif_container);
            textViewDescription = itemView.findViewById(R.id.tv_auto_image_slider);
            this.itemView = itemView;
        }
    }

}