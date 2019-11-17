package com.cal;

public class FindByTwo {
    /**
     * 二分查找
     * @param arr
     * @param start
     * @param end
     * @param value
     * @return
     */
    public int serchNumber(int[] arr,int start,int end,int value){
        if (null==arr){
            return -1;
        }
        while (start<=end){
            int mid = (start+end)/2;
            int midValue = arr[mid];
            if (value==midValue){
                return mid;
            }else if (value<midValue){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }
    public void bubbleSort(int a[]){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j]<a[j+1]){
                    int value = a[j];
                    a[j]=a[j+1];
                    a[j+1]=value;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int a[]={1,4,6,8,9,13,16};
        FindByTwo findByTwo = new FindByTwo();
        int result = findByTwo.serchNumber(a,0,a.length-1,16);
        System.out.println(a[result]);
        int arr[]={100,23,4,56,11};
        findByTwo.bubbleSort(arr);
    }
}
