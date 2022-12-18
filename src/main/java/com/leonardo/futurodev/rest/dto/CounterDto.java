package com.leonardo.futurodev.rest.dto;

public class CounterDto {
    private int counter=0;

     public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void increment(){
            counter++;
    }
    
}
