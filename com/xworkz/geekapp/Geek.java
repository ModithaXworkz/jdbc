package com.xworkz.geekapp;
import java.util.Scanner;
public class Geek{
static int[] num=new int[4];

public static void main(String a[]){
Scanner sc =new Scanner(System.in);
for(int i=0;i<num.length;i++){
 num[i]=sc.nextInt();
}
getNumbers(num);
}
public static int[] getNumbers(int[] num){
for(int i=0;i<num.length;i++){
 int number=num[i];
 System.out.println(number);
}
return num;
}
}

