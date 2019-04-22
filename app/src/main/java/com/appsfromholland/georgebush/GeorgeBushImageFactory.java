package com.appsfromholland.georgebush;

import java.util.ArrayList;

public class GeorgeBushImageFactory {

    private ArrayList<GeorgeBush> dataset = new ArrayList<>();
    private static GeorgeBushImageFactory instance = null;

    public static GeorgeBushImageFactory getInstance() {
        if( instance == null ) {
            instance = new GeorgeBushImageFactory();
        }
        return instance;
    }

    private GeorgeBushImageFactory() {
        constructDataSet();
    }

    public ArrayList<GeorgeBush> getDataset() {
        return dataset;
    }

    private void constructDataSet() {
        for( int idx = 1; idx <= 200; idx++ ) {
            String imageName = String.format("george_w_bush_%04d", idx);
            GeorgeBush gb = new GeorgeBush("George W. Bush", imageName);
            dataset.add(gb);
        }
    }
}
