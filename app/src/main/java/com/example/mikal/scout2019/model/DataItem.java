package com.example.mikal.scout2019.model;

import android.content.ContentValues;

import com.example.mikal.scout2019.database.ItemsTable;

import java.util.UUID;

public class DataItem {

    private String itemId;
    private String itemName;
    private String description;
    private String category;
    private int sortPosition;
    private double price;
    private String image;

    public DataItem() {
    }

    public DataItem(String itemId, String itemName, String description, String category, int sortPosition, double price, String image) {

        if (itemId == null){
            itemId = UUID.randomUUID().toString();
        }

        this.itemId = itemId;
        this.itemName = itemName;
        this.description = description;
        this.category = category;
        this.sortPosition = sortPosition;
        this.price = price;
        this.image = image;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSortPosition() {
        return sortPosition;
    }

    public void setSortPosition(int sortPosition) {
        this.sortPosition = sortPosition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ContentValues toValues(){
        ContentValues values = new ContentValues();

        values.put(ItemsTable.COLUMN_ID, itemId);
        values.put(ItemsTable.COLUMN_NAME, itemName);
        values.put(ItemsTable.COLUMN_DESCRIPTION, description);
        values.put(ItemsTable.COLUMN_CATEGORY, category);
        values.put(ItemsTable.COLUMN_POSITION, sortPosition);
        values.put(ItemsTable.COLUMN_PRICE, price);
        values.put(ItemsTable.COLUMN_IMAGE, image);
        return values;
    }


    @Override
    public String toString() {
        return "DataItem{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", sortPosition=" + sortPosition +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }


}


