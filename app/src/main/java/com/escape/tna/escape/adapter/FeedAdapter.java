package com.escape.tna.escape.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by nikhil on 3/4/2016.
 *
 */
public class FeedAdapter extends RecyclerView.Adapter<mViewHolder> {
    @Override
    public mViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(mViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

class mViewHolder extends RecyclerView.ViewHolder{
    public mViewHolder(View itemView) {
        super(itemView);
    }
}
