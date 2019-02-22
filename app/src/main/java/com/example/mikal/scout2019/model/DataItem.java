package com.example.mikal.scout2019.model;

public class DataItem {

    private String TABLE_ITEMS;
    private String COLUMN_ID;
    private int INT_1;
    private int INT_2;

    public DataItem() {
    }

    public DataItem(String TABLE_ITEMS, String COLUMN_ID, int INT_1, int INT_2) {
        this.TABLE_ITEMS = TABLE_ITEMS;
        this.COLUMN_ID = COLUMN_ID;
        this.INT_1 = INT_1;
        this.INT_2 = INT_2;
    }

    public String getTABLE_ITEMS() {
        return TABLE_ITEMS;
    }

    public void setTABLE_ITEMS(String TABLE_ITEMS) {
        this.TABLE_ITEMS = TABLE_ITEMS;
    }

    public String getCOLUMN_ID() {
        return COLUMN_ID;
    }

    public void setCOLUMN_ID(String COLUMN_ID) {
        this.COLUMN_ID = COLUMN_ID;
    }

    public int getINT_1() {
        return INT_1;
    }

    public void setINT_1(int INT_1) {
        this.INT_1 = INT_1;
    }

    public int getINT_2() {
        return INT_2;
    }

    public void setINT_2(int INT_2) {
        this.INT_2 = INT_2;
    }

    @Override
    public String toString() {
        return "DataItem{" +
                "TABLE_ITEMS='" + TABLE_ITEMS + '\'' +
                ", COLUMN_ID='" + COLUMN_ID + '\'' +
                ", INT_1=" + INT_1 +
                ", INT_2=" + INT_2 +
                '}';
    }
}
