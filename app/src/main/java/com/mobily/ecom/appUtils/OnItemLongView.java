package com.mobily.ecom.appUtils;

import android.view.View;

public interface OnItemLongView {

    void onItemClick(View view, int position);

    boolean onItemLongClick(View view, int position);

}
