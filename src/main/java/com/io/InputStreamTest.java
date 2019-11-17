package com.io;

import java.io.*;

public class InputStreamTest {
    File file = new File("d:\\io.txt");
    public void InputStream(){
        String filePath = "d:\\io.txt";
        try {
            if (!file.exists()){
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            InputStream inputStream = new FileInputStream(filePath);
            byte[] bytes = new byte[(int) file.length()];
            int read=0;
            while ((read=inputStream.read(bytes))>0){
                System.out.println(new String(bytes));
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

        }
    }
    public void outPut(){
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            byte[] bytes = new byte[1024];
            String context = "i love";
            outputStream.write(context.getBytes());
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void fileRead(){
        try {
            Reader reader =new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            int i=0;
            String str=null;
            while ((str=br.readLine())!=null){
                i++;
                System.out.println(str);
            }
            System.out.println(i);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void fileWrite(){
        try {
            Writer writer = new FileWriter(file,true);
            String txt = "\r\n"+"write";
            writer.write(txt);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InputStreamTest inputStreamTest = new InputStreamTest();
//        inputStreamTest.outPut();
//        inputStreamTest.InputStream();
//        inputStreamTest.fileWrite();
        inputStreamTest.fileRead();
    }
}
