package vn.ptt.androidjetpack.pagingapi.v2;

import android.arch.paging.PagedListAdapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;

import vn.ptt.androidjetpack.R;

public class UserGitHubAdapter extends PagedListAdapter<UserGitHub, UserGitHubAdapter.MyViewHolder> {
    private Context context;

    protected UserGitHubAdapter() {
        super(UserGitHub.DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_paging, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        UserGitHub item = getItem(i);

        if (item != null) {
            myViewHolder.textView.setText(item.getLogin() + " - " + item.getId());
            Glide.with(context)
                    .load(item.getAvatar_url())
                    .into(myViewHolder.imageView);
        }
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textViewName);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
