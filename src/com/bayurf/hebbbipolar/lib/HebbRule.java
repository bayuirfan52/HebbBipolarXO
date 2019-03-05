package com.bayurf.hebbbipolar.lib;

public class HebbRule {
    private static double[] bobot = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    private static double bias;

    public static void learn(double[][] input, double[] target){
        bias = 0;
        for (int i = 0; i < input.length; i++){
            for (int j = 0; j < input[0].length; j++){
                bobot[j] = bobot[j] + input[i][j] * target[i];
                System.out.println("Bobot["+ (j+1) +"] : "+ bobot[j]);
            }
            bias += 1 * target[i];
            System.out.println("Bias : " + bias);
            System.out.println("///--------------------------///");
        }
    }

    public static void test(double[] input){
        double output = 0;
        for (int i = 0; i < input.length; i++){
            output = bias + input[i] * bobot[i];
        }

        if (output >= 0) {
            output = 1;
            System.out.println("Input adalah X, hasil input = " + output + ", sesuai target");
        }
        else {
            output = -1;
            System.out.println("Input adalah O, hasil input = " + output + ", sesuai target");
        }
    }
}