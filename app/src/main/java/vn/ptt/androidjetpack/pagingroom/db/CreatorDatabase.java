package vn.ptt.androidjetpack.pagingroom.db;

import android.os.AsyncTask;
import android.util.Log;

import java.util.List;

public class CreatorDatabase {

    public static void addUser(AppDatabase db, User user){
        db.userDao().insertAll(user);
        List<User> userList = db.userDao().getAll();
        Log.d("AAA", "Rows Count: " + userList.size());
    }

    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final AppDatabase mDb;

        PopulateDbAsync(AppDatabase db) {
            mDb = db;
        }

        @Override
        protected Void doInBackground(final Void... params) {
            //populateWithTestData(mDb);
            return null;
        }
    }
}
