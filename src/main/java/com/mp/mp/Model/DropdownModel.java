package com.mp.mp.Model;

public class DropdownModel {

    private int value;
    private String label;
    public DropdownModel(){}

    // DropdownModel(int value,String label){
    //     this.value = value;
    //     this.label = label;
    // }
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
