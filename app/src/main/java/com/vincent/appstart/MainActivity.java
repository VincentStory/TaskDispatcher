package com.vincent.appstart;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static android.view.animation.Animation.INFINITE;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Integer> list = new ArrayList<>();
        list.add(R.mipmap.img1);
        list.add(R.mipmap.img2);
        list.add(R.mipmap.img3);
        list.add(R.mipmap.img4);
        list.add(R.mipmap.img5);
        list.add(R.mipmap.img6);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new MyAdapter(list));


    }

    private class MyAdapter extends RecyclerView.Adapter<ViewHolder> {
        private List<Integer> list;

        private Boolean hasRecorded = false;

        public MyAdapter(List<Integer> list) {
            this.list = list;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_img_layout, parent, false);

            return new ViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            if (position == 0 && !hasRecorded) {
                hasRecorded = true;
                holder.itemView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        holder.itemView.getViewTreeObserver().removeOnPreDrawListener(this);
                        LaunchTimer.endRecord("FeedShow");
                        return true;
                    }
                });
            }


            AppCompatImageView imageView = holder.getBinding().findViewById(R.id.imageView);

            imageView.setImageResource(list.get(position));


        }

        @Override
        public int getItemCount() {
            return list.size();
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private View mBinding;

        ViewHolder(View itemView) {
            super(itemView);
            mBinding = itemView;
        }

        View getBinding() {
            return mBinding;
        }

    }

}
