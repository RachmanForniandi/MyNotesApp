package com.example.android.mynotesapp.db;

import android.provider.BaseColumns;

/**
 * Created by Lenovo on 10/23/2017.
 */

public class DatabaseContract {
    static String TABLE_NOTE = "note";

    static final class NoteColumns implements BaseColumns{
        //Note title
        static String TITLE = "title";
        //Note description
        static String DESCRIPTION = "description";
        //Note date
        static String DATE = "date";
    }
}
