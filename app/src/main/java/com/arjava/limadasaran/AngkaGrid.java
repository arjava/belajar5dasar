package com.arjava.limadasaran;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AngkaGrid extends BaseAdapter{
    private Context mContext;
    private final String[] angka;
    private final int[] ImageAngka;

    public AngkaGrid(Context c, String[] angka, int[] ImageAngka ) {
        mContext = c;
        this.ImageAngka = ImageAngka;
        this.angka = angka;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return angka.length;
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
        View grid_angka;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid_angka = new View(mContext);
            grid_angka = inflater.inflate(R.layout.content_angka, null);
            TextView textView = (TextView) grid_angka.findViewById(R.id.grid_text_angka);
            ImageView imageView = (ImageView)grid_angka.findViewById(R.id.grid_image_angka);
            textView.setText(angka[position]);
            imageView.setImageResource(ImageAngka[position]);
        } else {
            grid_angka = (View) convertView;
        }

        return grid_angka;
    }


}