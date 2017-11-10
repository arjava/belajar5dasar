package com.arjava.limadasaran;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by arjava on 11/24/16.
 */

public class AlphabetList extends ArrayAdapter{
    private final Activity activ;
    private final String[] abjad;
    private final int[] ImageAbjad;

    public AlphabetList(Activity activity, int[] imageAbjad, String[] abjad) {
        super(activity, R.layout.content_alphabet, abjad);
        this.activ = activity;
        this.abjad = abjad;
        this.ImageAbjad = imageAbjad;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = activ.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.content_alphabet, null);
        TextView textView = (TextView) view.findViewById(R.id.grid_text_abjad);
        ImageView imageView = (ImageView) view.findViewById(R.id.grid_image_abjad);

        textView.setText(abjad[position]);
        imageView.setImageResource(ImageAbjad[position]);
        return view;
    }


}
