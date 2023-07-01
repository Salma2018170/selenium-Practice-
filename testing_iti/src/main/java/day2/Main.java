package day2;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1-------------------------");
        System.out.println("I\'m version 13 in java so new version of switch will not work ");
        System.out.println("task 2-------------------------");
        mulit();
        System.out.println("task 3-------------------------");
        System.out.println("Fact Number Is:"+facRec(7));
        System.out.println("task 4-------------------------");
        System.out.println("Fact Number Is:"+facLoop(7));
        System.out.println("task 5&6-------------------------");
        double result[] = minMax(5,6,7,8);
        System.out.println("Max Number Is: "+result[0] +" "+ "Min Number Is: "+result[1]+" "+ "Average Number Is: "+result[2]);
        System.out.println("task 7-------------------------");
        System.out.println("Sum Two Number Is "+sum(2,3)+"\tDivide Two Numbers Is:"+div(5,5)+"\tMulit Two Number is :"+multi(3,3));
        System.out.println("task 8-------------------------");
        System.out.println("prime "+prime(1));
    }
//    public static void switchTry(){
//        int num =5;
//        switch (num){
//            case 1 -> System.out.println("first number");
//            case 2 -> System.out.println("second number");
//            case 1 -> System.out.println("third number");
//        }
//    }
    public static void mulit(){
        for(int i=0;i<=12;i++){
            for (int j=0;j<=12;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println("\n");
        }
    }
   public static int facRec(int num){
        if(num <1){
            return 1;
        }
        return num*facRec(num-1);
   }
    public static int facLoop(int num){
        int sum=1;
        for(int i=1;i<=num;i++){
            if(num==1){
                sum= 1;
            }
            else {
                sum=  sum*i;
            }
        }
      return sum;
    }
    public static  double[] minMax(int x1,int x2,int x3,int x4 ){
        double max,min,avg;
        min=max=x1;

           if(min<=x1){
               min=x1;
           }
           else if(min<x2){
               min=x2;
           }
           else if(min<x3){
               min=x3;
           }
           else {
               min=x4;
           }
          // return max;

            if(max>x1){
                max=x1;
            }
            else if(max>x2){
                max=x2;
            }
            else if(max>x3){
                max=x3;
            }
            else {
                max=x4;
            }

        avg=(double)(x1+x2+x3+x4)/4;
        return new double[] {max, min,avg};
    }

    public static double  sum(int x,int y){
        return x+y;
    }
    public static double  div(int x,int y){
        if(y==0){
            System.out.println("Error");
            return 0;
        }
        else {
            return x/y;
        }
    }
    public static double  multi(int x,int y){
        return x*y;
    }
    public static boolean  prime(int x){
        if(x==0||x==1)
        {
            return false;
        }
        else
        {
            for(int i=2;i<x;i++){
                if(x%i==0){
                    return false;
                }

            }
        }
        return true;
    }
}
