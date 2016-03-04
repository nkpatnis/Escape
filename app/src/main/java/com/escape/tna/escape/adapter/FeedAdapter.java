package com.escape.tna.escape.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.escape.tna.escape.R;
import com.escape.tna.escape.model.Feed;

import java.util.ArrayList;

/**
 * Created by nikhil on 3/4/2016.
 */
public class FeedAdapter extends RecyclerView.Adapter<mViewHolder> {

    ArrayList<Feed> feeds;
    Context context;

    public FeedAdapter(Context context, ArrayList<Feed> feeds) {
        this.feeds = feeds;
        this.context = context;
    }

    @Override
    public mViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.news_feed_item, parent, false);
        return new mViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(mViewHolder holder, int position) {


        holder.image.setImageResource(feeds.get(position).getId());
        holder.name.setText(feeds.get(position).getTitle());
        holder.desc.setText(feeds.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return feeds.size();
    }
}

class mViewHolder extends RecyclerView.ViewHolder {
    TextView name,desc;
    ImageView image;
    public mViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
        desc = (TextView) itemView.findViewById(R.id.desc);
        image = (ImageView) itemView.findViewById(R.id.feed_image);
    }
}
