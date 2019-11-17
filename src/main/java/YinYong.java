public class YinYong {
    public void StringTest(){
        StringBuffer s1= new StringBuffer("QWE");
        StringBuffer s2 = new StringBuffer("zasd");
        change(s1,s2);
        System.out.println(s1+"-----"+s2);

    }
    public void change(StringBuffer s1,StringBuffer s2){
        s1=s2;
        s2.append(s1);
    }

    public static void main(String[] args) {
        YinYong yinYong = new YinYong();
        yinYong.StringTest();
    }
}
