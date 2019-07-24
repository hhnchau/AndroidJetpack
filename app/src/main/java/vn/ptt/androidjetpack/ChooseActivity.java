package vn.ptt.androidjetpack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import vn.ptt.androidjetpack.databinding.DataBinding;
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

    public void paging(View view) {
    }

    public void navigation(View view) {
    }
}
