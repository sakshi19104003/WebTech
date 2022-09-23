public class Assignment1 {
public static void main(String args[]){

        // Q1 - Write a Java program to print addition and subtraction of two integer numbers.
        int no1 = 50;
        int no2 = 10;
        int sum = no1 + no2;
        int diff = no1-no2;
        System.out.println("Difference of two numbers " + no1 + " and " + no2+ " is "+ diff);
        System.out.println("Sum of two numbers " + no1 + " and " + no2+ " is "+  sum);

        //Q2 - Write a Java program to print multiplication of two floating point numbers.
        float n1 = 9.3f;
        float n2 = 5.5f;
        float multi = (n1*n2);
        System.out.println("Multiplication of two floating point numbers " + n1 + " and  " + n2+ " is "+ multi);

        // Q3 - Write a Java program to compute quotient and remainder and print it.
        double q = (double)no1/no2;
        double rem = (double) no1%no2;
        System.out.println("Quotient of two floating point numbers " + no1 + " and " + no2+ " is "+ q);
        System.out.println("Remainder of two floating point numbers " + no1 + " and " + no2+ " is "+ rem);

        //Q4 - Write a Java program to swap the values of integer number with using temporary variable and without using temporary variable
        // part 1 - with using variable
        System.out.println("Initially- " + "number 1 = " + no1 +  " and " + "number 2 = " +  no2);
        int var;
        var = no1;
        no1 = no2;
        no2 = var;
        System.out.println("After Swapping " + "number 1 = " + no1 +  " and " + "number 2 = " +  no2);

        // without using variable
        System.out.println("Initially- " + "number 1 = " + n1 +  " and " + "number 2 = " +  n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("After Swapping " + "number 1 = " + n1 +  " and " + "number 2 = " +  n2);

    }
}
