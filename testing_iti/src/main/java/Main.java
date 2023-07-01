import java.util.Scanner;
 class Shape{
    int length;
    int breadth;
    Shape(){}
    Shape(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void area(){
        System.out.println(length+" "+breadth);
        //System.out.println(length*breadth);
    }
}
public class Main {
    static {
        System.out.println("hi");
    }
    public static void main(String[] args) {
        //Unary Operator
        Scanner scanner=new Scanner(System.in);
        int i=1;
        while (scanner.hasNext()){
            System.out.println((i++)+" "+scanner.nextLine());
        }

    }
}
