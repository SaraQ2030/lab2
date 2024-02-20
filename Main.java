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
       // System.out.println("Enter the size of array ");
        ArrayList arr=new ArrayList<>();
       int x;
        int valu;
        int chose;

 do{
    System.out.println("choose number for the following :" +"\n"+ "1/add     " +
            "\t"+ "2/display the array  "+"\n"+"3/search  "+"\t"+" 4/sort"+"\t"+" 5/quit:");
     chose=input.nextInt();

    if (chose == 1) {
        System.out.println("Enter the value to add to the array");
        valu = input.nextInt();
        add_array(arr, valu);

    } else if (chose == 2) {
        System.out.println("The array : ");
        display(arr);
    } else if (chose == 3) {
        System.out.println("Enter the number to check ");
        x = input.nextInt();
        check_contain(arr, x);


    } else if (chose == 4) {

        sort_arr(arr);

    }
}while (chose !=5 && chose>0);


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


public static ArrayList display(ArrayList x){
   ArrayList<Integer> arr = new <Integer>ArrayList();
       for(int a:arr){
           System.out.println(arr.get(a));
       }
       return arr;
       }

public static void add_array(ArrayList a ,int x) {

    ArrayList<Integer> arr = new <Integer>ArrayList();
    arr.add(x);
    //System.out.println(arr);
}

public static boolean check_contain(ArrayList a ,int x){
boolean check=a.contains(x);
System.out.println(check);
return check;
}

public static void sort_arr(ArrayList a){
        ArrayList arr=new ArrayList();

        Collections.sort(arr);
        System.out.println(arr);


}






}