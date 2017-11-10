package com.arjava.limadasaran;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by arjava on 11/23/16.
 */

public class WarnaGrid extends BaseAdapter{

    private final Context mContext;
    private final String[] warna;
    private final int[] ImageWarna;

    public WarnaGrid(Context d, String[] warna, int[] ImageWarna ) {
        mContext = d;
        this.ImageWarna = ImageWarna;
        this.warna = warna;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return warna.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid_warna;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid_warna = new View(mContext);
            grid_warna = inflater.inflate(R.layout.content_warna, null);
            TextView textView = (TextView) grid_warna.findViewById(R.id.grid_text_warna);
            ImageView imageView = (ImageView)grid_warna.findViewById(R.id.grid_image_warna);
            textView.setText(warna[position]);
            imageView.setImageResource(ImageWarna[position]);
        } else {
            grid_warna = (View) convertView;
        }

        return grid_warna;
    }
}
