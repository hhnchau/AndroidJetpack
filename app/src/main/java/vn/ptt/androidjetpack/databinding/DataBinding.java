package vn.ptt.androidjetpack.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import vn.ptt.androidjetpack.R;
import vn.ptt.androidjetpack.databinding.ActivityMainBinding;

public class DataBinding extends AppCompatActivity {
    private User user;
    private int count = 0;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        user = new User();
        user.setName("Ravi Tamada");
        user.setEmail("ravi@androidhive.info");

        binding.setUser(user);


    }

    public void click(View view) {
        count++;
        user.setName(user.getName() + count);
        binding.setUser(user);
    }
}
