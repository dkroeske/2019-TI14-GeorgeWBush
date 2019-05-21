package com.appsfromholland.georgebush;

import android.content.Context;
import java.util.ArrayList;

public class GeorgeBushImageFactory {

    private ArrayList<GeorgeBush> dataset = new ArrayList<>();
    private static GeorgeBushImageFactory instance = null;
    private Context context;

    public static GeorgeBushImageFactory getInstance(Context context) {
        if( instance == null ) {
            instance = new GeorgeBushImageFactory(context);
        }
        return instance;
    }

    private GeorgeBushImageFactory(Context context) {
        this.context = context;
        constructDataSet();
    }

    public ArrayList<GeorgeBush> getDataset() {
        return dataset;
    }

    private void constructDataSet() {
        for( int idx = 1; idx <= 200; idx++ ) {
            String imageName = String.format("george_w_bush_%04d", idx);

            String name = this.context.getResources().getString(R.string.mr_nobody);
            //GeorgeBush gb = new GeorgeBush("George W. Bush", imageName);
            GeorgeBush gb = new GeorgeBush(name, imageName);

            dataset.add(gb);
        }
    }
}
