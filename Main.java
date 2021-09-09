import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // for loops
    // while loops
    // do-while loop

    // for ( initial value; condition to satisfy; iteration)
/*
    int count = 0;
    for(count=0; count<=5; count++) {
      System.out.println(count);
    } */
/*
    for(int num=5; num>=1; num--) {
      System.out.println(num);
    } */
/*
    int count = 10; // cant set value to variables in while loop
    while (count <= 50) {
      System.out.println(count);
      count++;
    } */

    // do-while loop
    // do {
      //statement
      //} while (condition)
/*    
    int num = 5;
    do {
      System.out.println(num);
      num--;
    } while(num > 5); // only loop that needs a ; @ the end */

    // to sum whole numbers between 1 and 10
    int sum1 = 0;
    for(int i = 1; i<=10; i++){
      sum1 += i;
    }
    System.out.println(sum1);

    // to sum odd whole numbers between 1 and 10
    int sum2 = 0;
    for(int i = 1; i<=10; i += 2){
      sum2 += i;
    }
    System.out.println(sum2);

    // to sum even whole numbers between 1 and 10
    int sum3 = 0;
    for(int i = 2; i<=10; i += 2){
      sum3 += i;
    }
    System.out.println(sum3);
  
    //same sum 1 using a while loop
    int sum4 = 0;
    int i = 1;
    while(i <= 10){
      sum4 += i;
      i++;
    }
    System.out.println(sum4);

    //from scanner say whether # is pos, neg, or 0 and go to 0
    System.out.println("Please enter your number.");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    if (num > 0) {
      System.out.println("This number is positive");
      while(num >= 0){
        System.out.println(num);
        num --;
      }
    }
    else if(num < 0) {
      System.out.println("This number is negative");
      while (num <= 0){
        System.out.println(num);
        num ++;
      }
    }
    else {
      System.out.println("This number is zero");
    }
  }
}