package com.example.farwa.customcomponents.Models;

/**
 * Created by Farwa on 4/16/2017.
 */

public class ItemButton {

    public String title;
    public String description;

    public ItemButton(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public ItemButton(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
