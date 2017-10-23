package com.example.jorge.pruebaquadram.Class;

import com.google.gson.annotations.SerializedName;


import java.util.List;

/**
 * Created by jorge on 22/10/17.
 */

public class Entry {

    @SerializedName("im:name")
    private Name imName;

    @SerializedName("im:image")
    private List<ImImage> imImageItem;

    private Summary summary;

    @SerializedName("im:price")
    private ImPrice imPriceItem;

    @SerializedName("im:contentType")
    private ImContentType imContentTypeItem;

    private Rights rights;

    private String tittle;

    private Link linkItem;

    private Id id;

    @SerializedName("im:artist")
    private ImArtist imArtistItem;

    private CategoryObject categoryItem;

    @SerializedName("im:releaseDate")
    private ImReleaseDate imReleaseDateItem;

    public Entry() {
    }

    public Name getImName() {
        return imName;
    }

    public void setImName(Name imName) {
        this.imName = imName;
    }

    public List<ImImage> getImImageItem() {
        return imImageItem;
    }

    public void setImImageItem(List<ImImage> imImageItem) {
        this.imImageItem = imImageItem;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public ImPrice getImPriceItem() {
        return imPriceItem;
    }

    public void setImPriceItem(ImPrice imPriceItem) {
        this.imPriceItem = imPriceItem;
    }

    public ImContentType getImContentTypeItem() {
        return imContentTypeItem;
    }

    public void setImContentTypeItem(ImContentType imContentTypeItem) {
        this.imContentTypeItem = imContentTypeItem;
    }

    public Rights getRights() {
        return rights;
    }

    public void setRights(Rights rights) {
        this.rights = rights;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Link getLinkItem() {
        return linkItem;
    }

    public void setLinkItem(Link linkItem) {
        this.linkItem = linkItem;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public ImArtist getImArtistItem() {
        return imArtistItem;
    }

    public void setImArtistItem(ImArtist imArtistItem) {
        this.imArtistItem = imArtistItem;
    }

    public CategoryObject getCategoryItem() {
        return categoryItem;
    }

    public void setCategoryItem(CategoryObject categoryItem) {
        this.categoryItem = categoryItem;
    }

    public ImReleaseDate getImReleaseDateItem() {
        return imReleaseDateItem;
    }

    public void setImReleaseDateItem(ImReleaseDate imReleaseDateItem) {
        this.imReleaseDateItem = imReleaseDateItem;
    }
}
