package com.lionelnkeoua.databiding;

import android.content.Context;
import android.widget.Toast;

public class EventHandler {
    Context mContext;

    public EventHandler(Context mContext) {
        this.mContext = mContext;
    }

    public void onClickHandler(String name){
        Toast.makeText(mContext, "You click on "+name, Toast.LENGTH_SHORT).show();
    }
}
