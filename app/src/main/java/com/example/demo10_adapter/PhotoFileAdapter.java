package com.example.demo10_adapter;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PhotoFileAdapter extends BaseAdapter {
    private Context context;
    public PhotoFileAdapter(Context context){
        this.context = context;
    }
    private static final Integer[] IMAGES = {
            R.drawable.png1, R.drawable.png2,
            R.drawable.png3,
            R.drawable.png5, R.drawable.png6
    };

    @Override
    public int getCount() {
        return IMAGES.length;
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
        LayoutInflater inflater = LayoutInflater.from(context);
        View currentView = inflater.inflate(R.layout.list_item,null,false);
        BitmapDrawable bd = (BitmapDrawable) context.getResources().getDrawable(IMAGES[i], context.getTheme());//.getDrawable(IMAGES[i]);
        int height = bd.getBitmap().getHeight();
        int width = bd.getBitmap().getWidth();
        String result = String.format("dim=[%d*%d]", width, height);
        TextView textView = currentView.findViewById(R.id.textView1);
        textView.setText(result);
        ImageView imageView = currentView.findViewById(R.id.imageView1);
        imageView.setImageResource(IMAGES[i]);
        return currentView;
    }
}
