package com.hl.androlib;

import java.util.ArrayList;

/**
 * Created by santosh on 1/9/17.
 */
public class MyDataList<String> extends ArrayList {
    ArrayList<String> data = new ArrayList<>();

    @Override
    public boolean add(Object o) {
        data.add((String) o);
        return super.add(o);
    }

    void execute(int i) {
        if (i == 1) {
            System.out.print("nishant called");
            if (i == 2) {
                System.out.print("santosh called");
            }
            if (i == 3) {
                System.out.print("akhilesh called");
            }
        }
    }
}