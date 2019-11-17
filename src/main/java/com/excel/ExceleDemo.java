package com.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;
import java.util.Collections;

public class ExceleDemo {
//    public void writeIntoExcele() throws IOException {
//        File file = new File("D://excel/xls");
//        InputStream is = new FileInputStream(file);
//        Workbook workbook = new HSSFWorkbook(is);
//
//    }
public static void main(String[] args) {
    String s1 = "Programming";
    String s2 = s1;
    s1="sad";
    System.out.println(s2);
    int a[]={1,2,3};
    change(a);
    System.out.println("saf");
}
public static void change(int a[]){
    a=null;
}
}
