package com.ctgu.spring.beans;

import java.util.Map;

public class Mother {

    private String name;
    private Map<String, Son> sons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Son> getSons() {
        return sons;
    }

    public void setSons(Map<String, Son> sons) {
        this.sons = sons;
    }

    @Override
    public String toString() {
        return "Mother{" +
                "name='" + name + '\'' +
                ", sons=" + sons +
                '}';
    }
}
