package vn.ptt.androidjetpack.pagingapi.v2;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.paging.PagedList;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import vn.ptt.androidjetpack.R;

public class UserGitHubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paging);


        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        final UserGitHubAdapter adapter = new UserGitHubAdapter();
        recyclerView.setAdapter(adapter);

        UserGitHubViewModel userGitHubViewModel = ViewModelProviders.of(this).get(UserGitHubViewModel.class);
        userGitHubViewModel.getUserGit();
        userGitHubViewModel.listUserGit.observe(this, new Observer<PagedList<UserGitHub>>() {
            @Override
            public void onChanged(@Nullable PagedList<UserGitHub> userGitHubs) {
                adapter.submitList(userGitHubs);
            }
        });

    }
}
