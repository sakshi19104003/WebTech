package Assignment4;

import java.util.Scanner;
import java.util.Vector;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input from the user
        System.out.println("Enter the size of vector you want to create");
        int n = sc.nextInt();
        Vector<String> userVector = new Vector<>(n);
        int i = 0;
        while(i<n)
        {
            String s = sc.next();
            if(s.equals("terminating")){
                //getting out of the loop
                break;
            }
            else{
                i++;
                // adding the string in the vector
                userVector.addElement(s);
            }
        }
        //printing the elements that the user has entered
        for(int j = 0;j< userVector.size();j++){
            System.out.print(userVector.elementAt(j)+" ");
        }
        System.out.println();
        System.out.println("Vector size is : " + userVector.size() + " and Vector capacity is : " + userVector.capacity());

    }
}
