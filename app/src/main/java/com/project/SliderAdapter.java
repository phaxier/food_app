package com.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }
    public int[] slide_images = {
            R.drawable.baked_chery_cake1,
            R.drawable.burning_chilli1,
            R.drawable.beef_bun1

    };
        public String[] slide_heading = {

                "CAKE",
                "CHILLI",
                "BURGER"

        };

        public String [] slide_desc = {

                "Lorem ipsum bla bla bla",
                "Lorem ipsum Ikwon ak ",
                " lorem ipsum ikul kwesit"
    };


    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject( View view, Object o) {
        return view == (RelativeLayout) o;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView)view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_heading[position]);
        slideDescription.setText(slide_desc[position]);

        container.addView(view);

        return view;
    };


    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);

    }
}
