package com.driver;

public class Main {
    static class Product{
        public int product(int x, int y) {
            return (x*y);
        };
        //dummy new lines dummy

        public int product(int x, int y, int z) {
            return (x*y*z);
        };
        public double product(double x, double y) {
            return (x*y);
        };
    }

    public static void main(String[] args) {
        Product p = new Product();
        int x =3,y =5,z = 6;

        double a = 3.36,b=7.76;
//        int res1 = p.product(3,4);
//        int res2 = p.product(3,4,5);
//        double res3 = p.product(5.01,7.76);
        p.product(x,y);
        p.product(x,y,z);
        p.product(a,b);

        //System.out.println("res1 : "+res1+" res2: "+res2+" res3: "+res3);
    }
}