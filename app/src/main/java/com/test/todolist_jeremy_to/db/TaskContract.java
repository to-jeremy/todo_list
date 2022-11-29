package com.test.todolist_jeremy_to.db;

import android.provider.BaseColumns;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TaskContract {
    public static final String DB_NAME = "com.test.todolist_jeremy_to.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "Taches";

        public static final String COL_TASK_TITLE = "Title";
    }
}
