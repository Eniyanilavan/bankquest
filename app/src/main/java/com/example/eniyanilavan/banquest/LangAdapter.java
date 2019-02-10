package com.example.eniyanilavan.banquest;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class LangAdapter extends RecyclerView.Adapter<LangAdapter.MyViewHolder> {

    private Context mContext;
    private List<LanguagesList> dataList;


    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView  subTitle;
        public CardView lang_card;
        public ImageView imageTitle, thumbnail,selectImage;

        public MyViewHolder(View view) {
            super(view);
            imageTitle = (ImageView) view.findViewById(R.id.lang_title_text);
            thumbnail = (ImageView) view.findViewById(R.id.lang_img);
            subTitle = (TextView) view.findViewById(R.id.lang_sub_title);
            selectImage = (ImageView) view.findViewById(R.id.select_image);
            lang_card = (CardView) view.findViewById(R.id.lang_card);

        }
    }

    public LangAdapter(Context mContext, List<LanguagesList> dataList) {
        this.mContext = mContext;
        this.dataList = dataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lang_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        LanguagesList data = dataList.get(position);
        Glide.with(mContext).load(data.getLang_image()).into(holder.thumbnail);
        Glide.with(mContext).load(data.getLang_title()).into(holder.imageTitle);
        holder.subTitle.setText(data.getLang_sub_title());
        holder.selectImage.setVisibility(View.INVISIBLE);
        holder.lang_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int state = holder.selectImage.getVisibility();
                Log.v("state ==>",state+"");
                if(state != 0){
                    holder.selectImage.setVisibility(View.VISIBLE);
                }else{
                    holder.selectImage.setVisibility(View.INVISIBLE);
                }

//                holder.selectImage.setVisibility(View.VISIBLE);
            }
        });


    }

    public void diableTick(View context,int position){

        int select_image = dataList.get(position).select_Image;
       ImageView imageView = context.findViewById(select_image);
        int state = imageView.getVisibility();
        if(state == 0){
            state =1;
        }else{
            state = 0;
        }
        imageView.setVisibility(state);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}

