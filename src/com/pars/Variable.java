package com.pars;

public class Variable {
    private String type;
    private String name;
    public Variable(String name,String type){
        this.name=name;
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
