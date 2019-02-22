package com.example.mikal.scout2019.database;

public class ItemsTable {
    public static final String TABLE_ITEMS = "items";
    public static final String COLUMN_ID = "ID";
    public static final String INT_1 = "tele_hp_rocket_score_low";
    public static final String INT_2 = "tele_hp_pickup";

    public static final String SQL_CREATE =
            "CREATE TABLE " + TABLE_ITEMS + "(" +
                    COLUMN_ID + " TEXT PRIMARY KEY," +
                    INT_1 + " INTEGER," +
                    INT_2 + " INTEGER," + ");";

    public static final String SQL_DELETE =
            "DROP TABLE " + TABLE_ITEMS;
}