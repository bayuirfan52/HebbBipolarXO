package com.bayurf.hebbbipolar;

import com.bayurf.hebbbipolar.lib.HebbRule;

public class Main {
    private static double[][] data = {
            {1,-1,-1,-1,1,-1,1,-1,1,-1,-1,-1,1,-1,-1,-1,1,-1,1,-1,1,-1,-1,-1,1},
            {-1,1,1,1,-1,1,-1,-1,-1,1,1,-1,-1,-1,1,1,-1,-1,-1,1,-1,1,1,1,-1}
    };

    private static double[] target = {1,-1};

    public static void main(String[] args) {
        double[] x = {1,-1,-1,-1,1,-1,1,-1,1,-1,-1,-1,1,-1,-1,-1,1,-1,1,-1,1,-1,-1,-1,1};
        double[] o = {-1,1,1,1,-1,1,-1,-1,-1,1,1,-1,-1,-1,1,1,-1,-1,-1,1,-1,1,1,1,-1};
        HebbRule.learn(data,target);
        HebbRule.test(x);
        HebbRule.test(o);
    }
}
