package com.example.jorge.pruebaquadram.Class;

import java.util.List;

/**
 * Created by jorge on 23/10/17.
 */

public class DetailObject {

    private int resoultCount;
    private List<Results> results;

    public DetailObject() {
    }

    public int getResoultCount() {
        return resoultCount;
    }

    public void setResoultCount(int resoultCount) {
        this.resoultCount = resoultCount;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }
}
