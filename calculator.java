import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // int n= sc.nextInt();
        // int c = sumrec(n);
        // System.out.println(+c);

      //  int sum = 0;
        //int n=5;
        //for(int i=0;i<n;i++){
         //   sum = sum+(2*i);
        //}
        //System.out.println("The sum of n even numbers is: "+sum);
        //int n=5;
        //for(int i=10;i>=1;i--){
           // System.out.println(n+ " * " +i+ " = " +n*i);
        //}
    //     int n=5;
    //     int f=1;
    //     for(int i=n;i>=1;i--){
    //         f=f*i;
    //     }
    //     System.out.println(+f);
    // }
    // int n=4;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //     System.out.print("*");}
    // System.out.println();
    // }
    System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = sc.next().charAt(0);
        
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();
        
         double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
}
}
