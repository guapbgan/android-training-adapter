package com.example.demo10_adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;


public class PhotoAdapter extends BaseAdapter {
    private Context context;
     public PhotoAdapter(Context context){
         this.context = context;
     }
     private static final Integer[] images = {
             R.drawable.png1, R.drawable.png2,
             R.drawable.png3,
             R.drawable.png5, R.drawable.png6
     };
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[i]);
        imageView.setLayoutParams(new Gallery.LayoutParams(500, 500));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
//        Toast.makeText(context, String.valueOf(i),Toast.LENGTH_LONG).show();
        return imageView;
    }
}
