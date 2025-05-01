package com.demo;

public class StringDemo {

    public static void main(String[] args) {

        String str = "Nayan Raut";
        str=  str.toLowerCase();
        //find the count of vowels in the given string

        int count =0;

        for (int i =0 ; i <str.length() ; i++){

             char ch=str.charAt(i);
             if (ch=='a' || ch=='e'|| ch=='i' || ch=='o'||ch=='u'){
                 count++;
             }
        }
        System.out.println("Total vowels are>> " +count);


    }
}
