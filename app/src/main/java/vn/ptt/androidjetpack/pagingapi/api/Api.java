package vn.ptt.androidjetpack.pagingapi.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import vn.ptt.androidjetpack.pagingapi.StackApiResponse;
import vn.ptt.androidjetpack.pagingapi.v2.UserGitHub;

public interface Api {

    @GET("answers")
    Call<StackApiResponse> getAnswers(@Query("page") int page, @Query("pagesize") int pagesize, @Query("site") String site);


    @GET("/users")
    Call<List<UserGitHub>> getUserGitHub(@Query("since") int offset, @Query("per_page") int limit);
}
