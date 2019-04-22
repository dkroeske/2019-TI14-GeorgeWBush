package com.appsfromholland.georgebush;

import java.io.Serializable;
import java.util.Set;

public class GeorgeBush implements Serializable {

    private String name, imageUrl;

    public GeorgeBush(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "GeorgeBush{" +
                "name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
