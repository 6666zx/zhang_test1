package com.singeton;

public class SingleTon {
    private int id;
    private static volatile SingleTon s1;
    public SingleTon(){

    }
    public static SingleTon getTon(){
        if (null==s1){
            synchronized (SingleTon.class){
                if (null==s1){
                    return new SingleTon();
                }
            }
        }
        return s1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
