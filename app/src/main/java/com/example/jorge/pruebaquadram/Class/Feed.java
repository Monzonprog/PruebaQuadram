package com.example.jorge.pruebaquadram.Class;


import java.util.List;

/**
 * Created by jorge on 22/10/17.
 */

public class Feed {

    private Author author;
    private List<Entry> entry;
    private Updated updated;
    private Rights rights;
    private Title title;
    private Icon icon;
    private Link[] link;
    private Id id;

    public Feed() {
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Entry> getEntry() {
        return entry;
    }

    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }

    public Updated getUpdated() {
        return updated;
    }

    public void setUpdated(Updated updated) {
        this.updated = updated;
    }

    public Rights getRights() {
        return rights;
    }

    public void setRights(Rights rights) {
        this.rights = rights;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Link[] getLink() {
        return link;
    }

    public void setLink(Link[] link) {
        this.link = link;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }
}
