package vn.ptt.androidjetpack.pagingroom.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase instance;

    public static AppDatabase getAppDatabase(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context, AppDatabase.class, "USER.DB").build();
        }
        return instance;
    }

    public static void destroyInstance() {
        instance = null;
    }

    public abstract UserDao userDao();
}
