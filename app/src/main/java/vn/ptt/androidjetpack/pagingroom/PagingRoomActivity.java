package vn.ptt.androidjetpack.pagingroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import vn.ptt.androidjetpack.R;
import vn.ptt.androidjetpack.pagingroom.db.AppDatabase;
import vn.ptt.androidjetpack.pagingroom.db.CreatorDatabase;
import vn.ptt.androidjetpack.pagingroom.db.User;

public class PagingRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paging_room);


        User user = new User();
        user.setFirstName("A");
        user.setLastName("B");

        CreatorDatabase.addUser(AppDatabase.getAppDatabase(this), user);


    }

    @Override
    protected void onDestroy() {
        AppDatabase.destroyInstance();
        super.onDestroy();
    }
}
