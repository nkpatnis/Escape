package com.escape.tna.escape;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.escape.tna.escape.adapter.FeedAdapter;
import com.escape.tna.escape.model.Feed;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FeedFragment extends Fragment {

    RecyclerView recyclerView;

    public FeedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.news_feed_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<Feed> feeds = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            feeds.add(new Feed("Wayanad", R.drawable.img1));
        }

//        feeds.add(new Feed("Munnar", R.drawable.img2));
//        feeds.add(new Feed("Allepy", R.drawable.img3));
//        feeds.add(new Feed("Coorg", R.drawable.img4));
//        feeds.add(new Feed("Gokarna", R.drawable.img5));
//
//        feeds.add(new Feed("Bangalore", R.drawable.img1));
//        feeds.add(new Feed("Goa", R.drawable.img2));
//        feeds.add(new Feed("Pune", R.drawable.img3));
//        feeds.add(new Feed("Indore", R.drawable.img4));
//        feeds.add(new Feed("Zuluk", R.drawable.img5));

        recyclerView = (RecyclerView) view.findViewById(R.id.feed_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new FeedAdapter(getContext(), feeds));
    }
}
