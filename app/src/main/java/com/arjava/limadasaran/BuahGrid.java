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

public class BuahGrid extends BaseAdapter{

    private Context mContext;
    private final String[] buah;
    private final int[] ImageBuah;

    public BuahGrid(Context b, String[] buah, int[] ImageBuah ) {
        mContext = b;
        this.ImageBuah = ImageBuah;
        this.buah = buah;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return buah.length;
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
        View grid_buah;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid_buah = new View(mContext);
            grid_buah = inflater.inflate(R.layout.content_buah, null);
            TextView textView = (TextView) grid_buah.findViewById(R.id.grid_text_buah);
            ImageView imageView = (ImageView)grid_buah.findViewById(R.id.grid_image_buah);
            textView.setText(buah[position]);
            imageView.setImageResource(ImageBuah[position]);
        } else {
            grid_buah = (View) convertView;
        }

        return grid_buah;
    }
}
