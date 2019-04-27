package com.xtf.springbootproj.demo;

public class Sort {

    public static void main(String[] args) {
        int [] arr={45,3,6,5,8,5,75,18,53,52,111111110};
        int [] afterArr=xuanzeSort(arr);
        System.out.println(arr.hashCode());
        System.out.println(afterArr.hashCode());
        searchRepeatIndex(arr);


        for(int num:afterArr){
            System.out.println(num);
        }
    }

    //冒泡排序(从小到大)
    private static int[] maopaoSort(int [] arr){
        int count=0;
        for(int i=1;i<arr.length;i++){
            for (int j=0;j<arr.length-i;j++){
                  int temp;
                  if(arr[j]>arr[j+1]){
                      temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                  }
                  count++;
            }
        }
        System.out.println("计算了"+count);
        return  arr;
    }

    //插入排序(从大到小)
    private static int[] charuSort(int [] arr){
        int count=0;
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]<temp){
                arr[j+1]=arr[j];
                j--;
                count++;
            }
            arr[j+1]=temp;
        }
        System.out.println("计算了"+count);
        return arr;
    }


    //选择排序(从大到小)
    private static int[] xuanzeSort(int[] arr){
        int count=0;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                int temp;
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                count++;
            }
        }
        System.out.println("计算了"+count);
        return arr;
    }

    public static void searchRepeatIndex(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println("重复元素下标:"+i);
                    break;//去掉这句可以查找重复次数
                }
            }
        }
    }



}
