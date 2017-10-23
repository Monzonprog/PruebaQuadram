package com.example.jorge.pruebaquadram.Class;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jorge on 23/10/17.
 */

public class Attributes {

    @SerializedName("im:id")
    private String imId;

    @SerializedName("im:bundleld")
    private String imbundleld;

    public Attributes() {
    }

    public String getImId() {
        return imId;
    }

    public void setImId(String imId) {
        this.imId = imId;
    }

    public String getImbundleld() {
        return imbundleld;
    }

    public void setImbundleld(String imbundleld) {
        this.imbundleld = imbundleld;
    }
}
