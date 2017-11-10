package com.arjava.limadasaran;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by arjava on 11/25/16.
 */

public class HijaiyahList extends ArrayAdapter {

    private final Activity act;
    private final String[] hijaiyah;
    private final int[] ImageHijaiyah;

    public HijaiyahList(Activity activity, int[] ImageHijaiyah, String[] hijaiyah) {
        super(activity, R.layout.content_hijaiyah, hijaiyah);
        this.act = activity;
        this.ImageHijaiyah = ImageHijaiyah;
        this.hijaiyah = hijaiyah;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = act.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.content_hijaiyah, null);
        TextView textView = (TextView) view.findViewById(R.id.grid_text_hijaiyah);
        ImageView imageView = (ImageView) view.findViewById(R.id.grid_image_hijaiyah);

        textView.setText(hijaiyah[position]);
        Glide
                .with(act)
                .load(ImageHijaiyah[position])
                .into(imageView);
//        imageView.setImageResource(ImageHijaiyah[position]);
        return view;

    }
}
