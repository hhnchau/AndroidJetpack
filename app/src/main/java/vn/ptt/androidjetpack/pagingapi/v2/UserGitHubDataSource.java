package vn.ptt.androidjetpack.pagingapi.v2;

import android.arch.paging.PageKeyedDataSource;
import android.support.annotation.NonNull;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import vn.ptt.androidjetpack.pagingapi.api.RetrofitClient;

public class UserGitHubDataSource extends PageKeyedDataSource<Long, UserGitHub> {
    private int offset = 0;
    private int limit = 10;

    @Override
    public void loadInitial(@NonNull LoadInitialParams<Long> params, @NonNull final LoadInitialCallback<Long, UserGitHub> callback) {
        RetrofitClient.getInstance().getApi().getUserGitHub(offset, limit).enqueue(new Callback<List<UserGitHub>>() {
            @Override
            public void onResponse(Call<List<UserGitHub>> call, Response<List<UserGitHub>> response) {
                if (response.body() != null) {
                    List<UserGitHub> lst = response.body();
                    callback.onResult(response.body(), null, (long) (offset + limit));
                }
            }

            @Override
            public void onFailure(Call<List<UserGitHub>> call, Throwable t) {

            }
        });
    }

    @Override
    public void loadBefore(@NonNull LoadParams<Long> params, @NonNull LoadCallback<Long, UserGitHub> callback) {

    }

    @Override
    public void loadAfter(@NonNull LoadParams<Long> params, @NonNull final LoadCallback<Long, UserGitHub> callback) {
        RetrofitClient.getInstance().getApi().getUserGitHub(offset, limit).enqueue(new Callback<List<UserGitHub>>() {
            @Override
            public void onResponse(Call<List<UserGitHub>> call, Response<List<UserGitHub>> response) {
                if (response.body() != null) {
                    List<UserGitHub> lst = response.body();
                    callback.onResult(response.body(), (long) (offset + limit));
                }
            }

            @Override
            public void onFailure(Call<List<UserGitHub>> call, Throwable t) {

            }
        });
    }
}
