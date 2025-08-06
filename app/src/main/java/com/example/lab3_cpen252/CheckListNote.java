package com.example.lab3_cpen252;

import java.util.List;

public class CheckListNote extends Note {
    private List<String> items;
    //getter
    //setter
    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public String getSummary() {
        String strItems = "";
        int noOfList = items.size();
        for(int i=0 ; i< noOfList ; i++){
            strItems = strItems+items.get(i);
        }

        return title+":"+items.get(0)+"("+createdDate+")";
    }
}
