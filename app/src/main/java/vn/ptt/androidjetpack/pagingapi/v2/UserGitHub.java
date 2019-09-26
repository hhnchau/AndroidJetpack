package vn.ptt.androidjetpack.pagingapi.v2;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;

public class UserGitHub {
    private int id;
    private String login;
    private String avatar_url;
    private String type;

    public UserGitHub(int id, String login, String avatar_url, String type) {
        this.id = id;
        this.login = login;
        this.avatar_url = avatar_url;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static DiffUtil.ItemCallback<UserGitHub> DIFF_CALLBACK = new DiffUtil.ItemCallback<UserGitHub>() {
        @Override
        public boolean areItemsTheSame(@NonNull UserGitHub userGitHub, @NonNull UserGitHub userGitHub1) {
            return userGitHub.id == userGitHub1.id;
        }

        @Override
        public boolean areContentsTheSame(@NonNull UserGitHub userGitHub, @NonNull UserGitHub userGitHub1) {
            return userGitHub.equals(userGitHub1);
        }
    };

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        UserGitHub user = (UserGitHub) obj;
        return user.id == this.id && user.login.equals(this.login);
    }
}
