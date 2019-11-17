package com.singeton;

public class SingleTonUtils {
    private static SingleTon singleTon;
    public  static  SingleTon getSingleTon(){
        if (null==singleTon){
            return new SingleTon();
        }
        return singleTon;
    }

    public static void main(String[] args) {
        singleTon= getSingleTon();
        singleTon.setId(2);
        SingleTon s2 = getSingleTon();
        System.out.println(singleTon==s2);
    }
}
