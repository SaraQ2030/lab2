import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//Q1------------------------------------------------------------------------------------------------------------------
//        String[] arr = { "Dog", "Cat","red", "We", "id"};
//        String longest = "";
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].length() >= longest.length()) {
//                longest = arr[i];
//                System.out.println(longest);
//            }
//        }


        //Q2------------------------------------------------------------------------------------------------------------
//        ArrayList<Integer> num=new ArrayList<Integer>();
//        num.add(1);    num.add(1);    num.add(1);     num.add(3);     num.add(3);     num.add(5);
//        Scanner input =new Scanner(System.in);
//       System.out.println("Enter number to compare array with :");
//        int com=input.nextInt();
//        System.out.println("Original array: "+num);
//        int count=0;
//        for (int n=0;n< num.size();n++){
//
//            if (num.get(n)==com){
//                count++;
//            }
//        }
//        System.out.println( com+" occur "+count+" times");

        //Q3------------------------------------------------------------------------------------------------------------
//        Scanner input=new Scanner(System.in);
//        Integer num[] ={1,4,17,7,25,3,100};
//            System.out.println("The original Array");
//        System.out.println(Arrays.toString(num));
//        System.out.println("Enter number k");                    //k entered by the user to get k  the greatest number
//        int k=input.nextInt();
//        System.out.println(k+ "  largest element in the array is : ");
//        Arrays.sort(num, Collections.reverseOrder());
//                 for(int i=0;i<k;i++){
//                                 System.out.print(num[i]+" ");
//                                    }


        //Q4------------------------------------------------------------------------------------------------------------
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number to reverse :");
//        int num = input.nextInt();
//        System.out.println("The reverse number is  : ");
//        reverse(num);

        //Q5----------------------------------NOT FINISHED--------------------------------------------------------------------------
       Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size_arr=input.nextInt();
        int [] arr=new int[size_arr];

       System.out.println("choose number for the following :1/add     " +
               "2/display the array      3/search   4/sort   5/quit:");

            int chose=input.nextInt();
            switch (chose) {
                case 1:add(arr[size_arr]);
                    break;
                case 2:  display(arr[size_arr]);
                    break;
                case 3://search
                    break;
                case 4://sort
                    break;
                case 5://stop
                    break;
                default:System.out.println("Enter number between 1-5");
            }






        //Q6------------------------------------------------------------------------------------------------------------
//        Scanner input=new Scanner(System.in);
//        Random r = new Random();
//       System.out.println("Enter the minimum value of the range : ");
//       int min_num=input.nextInt();
//        System.out.println("Enter the maximum value of the range : ");
//        int max_num=input.nextInt();
//        System.out.println("Enter the number of random number to generate : ");
//        int n=input.nextInt();
//        for (int i=0;i<n;i++){
//            System.out.print("  "+randomNumberGenerator(min_num,max_num));


        //Q7----------------------NOT FINISSHED--------------------------------------------------------------------------------------
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the Password :");
//        String pass=input.nextLine();
//        check_length(pass);


        //Q8------------------------------------------------------------------------------------------------------------

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int num = input.nextInt();
//        fibo(num);


    }



public static boolean check_length(String x){
    boolean check;
    if (x.length()>8)
        { check= true;
        }else {
            System.out.println("The password should  be more than 8 character ");
        check=false; }
       return  check;
    }
//public static void check_upperCase(String x){
//        x.toUpperCase(x);
//}
public static void fibo(int x) {
        int fnum = 0;
        int snum = 1;
        for (int i = 1; i <= x; i++) {
            System.out.print(fnum + "  ");
            int next = fnum + snum;
            fnum = snum;
            snum = next;
        }
    }
public static int randomNumberGenerator(int min, int max)
{
    Random r = new Random();
    int randomNum = r.nextInt(max - min);
    int result = randomNum + min;
    return result;
}

public static void reverse(int x){
              int rem;
              int rev = 0;
              while (x>0){
                  rem = x % 10;
                  rev = (rev * 10) + rem;
                  x = x / 10;
              }
              System.out.println(rev);
          }


public static void display(int [] x){
        int arr[x];
        for (int i=0;i<x.length;i++){
            System.out.println("The array :"+Arrays.toString(arr[i]));
        }
}
public static void add(int x){
       int [] arr=new int[x];
        for (int i=0;i<x;i++){

            System.out.println(Arrays.toString(arr[i]));
        }
}





      }