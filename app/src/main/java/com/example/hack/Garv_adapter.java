package com.example.hack;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class Garv_adapter extends RecyclerView.Adapter<Garv_adapter.ViewHolder> {

    String[] localDataSet;
    Context mcontext;
    //    ArrayList<product_detail> product_list;
    List<product_detail> product_list;
    static final String Tag = "RecyclerView";

    public Garv_adapter(Context applicationContext, List<product_detail> product_list) {
        mcontext = applicationContext;
        this.product_list = product_list;
    }

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name_adap, price_adap;
        private ImageView product_img;


        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            name_adap = (TextView) view.findViewById(R.id.textView);
            price_adap = (TextView) view.findViewById(R.id.price_adap);
            product_img = (ImageView) view.findViewById(R.id.product_img);
        }


    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public Garv_adapter(String[] dataSet) {
        localDataSet = dataSet;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.garv_custom_adapter, viewGroup, false);

        return new ViewHolder(view);
    }


    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.name_adap.setText(product_list.get(position).getName());
        viewHolder.price_adap.setText(product_list.get(position).getPrice());

        Glide.with(mcontext).load(product_list.get(position).getUrl())
                .into(viewHolder.product_img);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return product_list.size();
    }
}
