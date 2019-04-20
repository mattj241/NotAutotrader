package com.android.london.notautotrader;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;


public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private List<String>  imageUrls;
    private boolean hasPics;

    public ViewPagerAdapter(Context context, List<String> imageUrls) {
        this.context = context;
        this.imageUrls = imageUrls;
        if (this.imageUrls.size() < 1){
            hasPics = false;
        }
        else{
            hasPics = true;
        }
    }

    @Override
    public int getCount() {
        return imageUrls.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        if (!hasPics) {
            Picasso.get()
                    .load(R.mipmap.noimage)
                    .fit()
                    .into(imageView);
            container.addView(imageView);
        }
        else {
            Picasso.get()
                    .load(imageUrls.get(position))
                    .fit()
                    .into(imageView);
            container.addView(imageView);
        }

        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
