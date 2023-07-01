package day3;

import java.util.Scanner;

public class Main {
   static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        //switch yield
        System.out.println("Task1");
        System.out.println("__________________________________");
        //Function accept array of number to find its max
        System.out.println("Task2");
        System.out.println("__________________________________");
        System.out.println("Please enter Size Of Array");
        int size=scanner.nextInt();
        int[]arr =new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.print("Please "+i+" Element"+"=");
            arr[i]=scanner.nextInt();
        }
        Max(arr);
        //Function accept array of number to print its summation , multiplication
        System.out.println("Task3");
        System.out.println("__________________________________");
        int [] result=multSum(arr);
        System.out.println("Summation Number Is: "+result[0]+"\t"+"multiplication Number Is: "+result[1]);
        //Function return array with any numbers
        System.out.println("Task4");
        System.out.println("__________________________________");
        int arrReturn[]=returnArray(5);
        for (int i=0 ;i<arrReturn.length;i++){
            System.out.println("Element Number "+(i+1)+"= "+arrReturn[i]);
        }

    }
    //I use java version 13 so yield will not work
//    public static void switchYield(){
//        String greeting="hi";
//        int value = switch (greeting) {
//            case "hi" -> {
//                System.out.println("I am not just yielding!");
//                yield 1;
//            }
//            case "hello" -> {
//                System.out.println("Me too.");
//                yield 2;
//            }
//            default -> {
//                System.out.println("OK");
//                yield -1;
//            }
//        };
//    }

public static void Max(int arr[]){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
    System.out.println("Max Number Is: "+max);
}
    public static int[] multSum(int arr[]){
        int sum=0,mult=1;
        for (int i=0;i<arr.length;i++){
           sum+=arr[i];
           mult*=arr[i];
        }
       return new int[]{sum,mult};
    }
    public static int[] returnArray(int size){
        int []arr=new int [size];
        for (int i=0;i<arr.length;i++){
            System.out.print("Please "+i+" Element"+"=");
            arr[i]=scanner.nextInt();
        }
        return  arr;
    }
}
