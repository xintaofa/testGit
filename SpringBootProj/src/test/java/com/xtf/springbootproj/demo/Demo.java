package com.xtf.springbootproj.demo;


import java.util.ArrayList;
import java.util.List;

public class Demo{

    public static void main(String[] args) {
        System.out.println(isHelloWorld("helolllllworld"));
    }

    public static boolean isHelloWorld(String text) {
        boolean flag=false;
        char [] chs1="helloworld".toCharArray();
        char [] chs2=text.toCharArray();
        int j=0;
        int count=0;
        for (int i=0;i<chs1.length;i++){
            for (;j<chs2.length;){
                j++;
                if(chs1[i]==chs2[j]){
                    count++;
                    break;
                }
            }
        }
        if(count==chs1.length){
            flag=true;
        }
        return flag;
    }

    public List<Integer> sortId(int n) {
        List<String> nums=new ArrayList<>();
        for(Integer i=1;i<=n;i++){
            nums.add(i.toString());
        }
        

        return null;
    }
}
