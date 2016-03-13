package com.example.salis.materialdesign.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.salis.materialdesign.R;
import com.example.salis.materialdesign.models.NavDrawerItem;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by salis on 3/7/16.
 */
public class NavigationDrawerAdapter extends RecyclerView.Adapter<NavigationDrawerAdapter.MyViewHolder> {

    private List<NavDrawerItem> drawerItemList = Collections.emptyList();
    private Context context;
    private LayoutInflater inflater;

    public NavigationDrawerAdapter(Context context, List<NavDrawerItem> drawerItemList) {
        this.context = context;
        this.drawerItemList = drawerItemList;
        inflater = LayoutInflater.from(context);
    }

    public void delete(int position) {
        drawerItemList.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.nav_drawer_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        NavDrawerItem current = drawerItemList.get(position);
        holder.textHolder.setText(current.getTitle());
    }

    @Override
    public int getItemCount() {
        return drawerItemList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textHolder;

        public MyViewHolder(View itemView) {
            super(itemView);
            textHolder = (TextView) itemView.findViewById(R.id.drawer_title);
        }
    }

}
