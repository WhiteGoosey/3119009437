package com.deserts.test;
import Util.Compare;
import org.junit.Test;


public class Test1 {
    String[] s = new String[3];
    public String path1 = "C:\\Users\\Deserts\\Desktop\\test\\1.0.txt";
    public String path2 = "C:\\Users\\Deserts\\Desktop\\test\\1.0.txt";
    public String path3 = "C:\\Users\\Deserts\\Desktop\\test\\1.0.txt";
    @Test
    public void testans() throws Exception {
        System.out.println(Compare.ans(path1,path2));
    }
    @Test
    public void testmain() throws Exception {
        s[0]=path1;
        s[1]=path2;
        s[2]=path3;
        System.out.println(Compare.main(s));
    }
    @Test
    public void testException() throws Exception {
        s[0]=path1;
        s[1]=path2;
        s[2]=path3;
        System.out.println(Compare.main(s));
    }
}