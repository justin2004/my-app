package com.justin.app;

import org.apache.jena.riot.*;

public class Some{
    private String name;
    private Integer count;
    public Some(){
        this.name = "name here";
        this.count=0;
    }
    public void add(){
        this.count++;
    }
    public void add(Integer i){
        this.count += i;
    }

    public String getName(){
        return this.name;
    }
    public Integer getCount(){
        return this.count;
    }




}
