package vn.ptt.androidjetpack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import vn.ptt.androidjetpack.databinding.DataBinding;
import vn.ptt.androidjetpack.navigation.NavigationActivity;
import vn.ptt.androidjetpack.pagingapi.PagingApiActivity;
import vn.ptt.androidjetpack.pagingroom.PagingRoomActivity;
import vn.ptt.androidjetpack.workmanager.WorkManagerActivity;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    public void workManager(View view) {
        startActivity(new Intent(this, WorkManagerActivity.class));
    }

    public void dataBinding(View view) {
        startActivity(new Intent(this, DataBinding.class));
    }

    public void pagingApi(View view) {
        startActivity(new Intent(this, PagingApiActivity.class));
    }

    public void navigation(View view) {
        startActivity(new Intent(this, NavigationActivity.class));
    }

    public void pagingRoom(View view) {
        startActivity(new Intent(this, PagingRoomActivity.class));
    }
}
