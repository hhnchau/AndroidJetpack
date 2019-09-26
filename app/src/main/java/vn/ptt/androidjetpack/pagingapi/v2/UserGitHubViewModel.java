package vn.ptt.androidjetpack.pagingapi.v2;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;


public class UserGitHubViewModel extends ViewModel {
    public LiveData<PagedList<UserGitHub>> listUserGit;

    private static final int LIMIT = 10;

    public UserGitHubViewModel() {
    }


    @SuppressWarnings("unchecked")
    public void getUserGit() {
        final PagedList.Config config = new PagedList.Config.Builder().setPageSize(LIMIT).build();

        UserGitHubSourceFactory userGitHubSourceFactory = new UserGitHubSourceFactory();

        listUserGit = new LivePagedListBuilder(userGitHubSourceFactory, config)
                .build();

    }

}
