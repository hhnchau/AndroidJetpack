package vn.ptt.androidjetpack.pagingapi.v2;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.DataSource;

public class UserGitHubSourceFactory extends DataSource.Factory {

    public MutableLiveData<UserGitHubDataSource> mutableLiveData;

    public UserGitHubSourceFactory() {
        this.mutableLiveData = new MutableLiveData<>();
    }

    @Override
    public DataSource create() {
        UserGitHubDataSource userGitHubDataSource = new UserGitHubDataSource();
        mutableLiveData.postValue(userGitHubDataSource);
        return userGitHubDataSource;
    }
}
