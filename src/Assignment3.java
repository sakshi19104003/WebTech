import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {
    public static int lexicographicallyCompare(String str1,String str2)
    {
        for (int i = 0; i < str1.length() &&
                i < str2.length(); i++) {
            if ((int)str1.charAt(i) ==
                    (int)str2.charAt(i)) {
                continue;
            }
            else {
                return (int)str1.charAt(i) -
                        (int)str2.charAt(i);
            }
        }
        // if the length of both the strings is unequal
        if (str1.length() < str2.length()) {
            return (str1.length()-str2.length());
        }
        else if (str1.length() > str2.length()) {
            return (str1.length()-str2.length());
        }

        //if none of the above condition is true, it means both the strings are equal
        else {
            return 0;
        }
    }

    static void countingSort(char arr[])
    {
        int n = arr.length;
        char output[] = new char[n];

        //creating count array to sort the count of individual char
        int count[] = new int[256];
        for (int i = 0; i < 256; ++i) count[i] = 0;
        for (int i = 0; i < n; ++i) ++count[arr[i]];

        // changing the count of the array, so as to store the position of the element
        for (int i = 1; i <= 255; ++i) count[i] += count[i - 1];

        //storing the sorted result in output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }

    static int dp[][];
    static ArrayList<ArrayList<String> > arrs = new ArrayList<ArrayList<String> >();

    static void printAllChanges(String s1, String s2, ArrayList<String> changes)
    {

        int i = s1.length();
        int j = s2.length();


        while (true) {

            if (i == 0 || j == 0) {


                arrs.add(changes);// add to answer
                break;
            }

            // If same
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                i--;
                j--;
            }

            else {
                boolean if1 = false, if2 = false;

                // Replace
                if (dp[i][j] == dp[i - 1][j - 1] + 1) {

                    // Add this step
                    changes.add("Change " + s1.charAt(i - 1) + " to " + s2.charAt(j - 1));
                    i--;
                    j--;

                    // note whether this 'if' was true.
                    if1 = true;
                }

                // Delete
                if (dp[i][j] == dp[i - 1][j] + 1) {
                    if (if1 == false) {
                        changes.add("Delete " + s1.charAt(i - 1));
                        i--;
                    }
                    else {

                        ArrayList<String> changes2 = new ArrayList<String>();
                        changes2.addAll(changes);

                        // Remove last operation
                        changes2.remove(changes.size() - 1);

                        // Add this new operation
                        changes2.add("Delete " + s1.charAt(i));

                        // initiate new  instance of function with remaining substrings
                        printAllChanges(s1.substring(0, i), s2.substring(0, j + 1), changes2);
                    }

                    if2 = true;
                }

                // Add character step
                if (dp[i][j] == dp[i][j - 1] + 1) {
                    if (if1 == false && if2 == false) {
                        changes.add("Add " + s2.charAt(j - 1));
                        j--;
                    }
                    else {

                        // Add steps
                        ArrayList<String> changes2 = new ArrayList<String>();
                        changes2.addAll(changes);
                        changes2.remove(changes.size() - 1);
                        changes2.add("Add " + s2.charAt(j));

                        // Recursively call for the next steps
                        printAllChanges(s1.substring(0, i + 1),
                                s2.substring(0, j), changes2);
                    }
                }
            }
        }
    }

    //  DP matrix
    static void convertString(String s1, String s2)
    {
        int l1 = s1.length();
        int l2 = s2.length();
        int[][] DP = new int[l1 + 1][l2 + 1];

        // initialize by the maximum edits possible
        for (int i = 0; i <= l1; i++)
            DP[i][0] = i;
        for (int j = 0; j <= l2; j++)
            DP[0][j] = j;

        // Compute the DP matrix
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {

                // if the characters are same no changes required
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    DP[i][j] = DP[i - 1][j - 1];
                else {

                    // minimum of three operations possible
                    DP[i][j] = min(DP[i - 1][j - 1],
                            DP[i - 1][j], DP[i][j - 1])
                            + 1;
                }
            }
        }

        // initialize to global array
        dp = DP;
    }

    // Function to find the minimum of three
    static int min(int a, int b, int c)
    {
        int z = Math.min(a, b);
        return Math.min(z, c);
    }
    static void printWays(String s1, String s2,
                          ArrayList<String> changes)
    {

        // Function to print all the ways
        printAllChanges(s1, s2, new ArrayList<String>());

        int i = 1;

        // print all the possible ways
        for (ArrayList<String> ar : arrs) {
            System.out.println("\nMethod " + i++ + " : \n");
            for (String s : ar) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        // q1 compare two string lexicographically (without using library function)
        System.out.println("-----Question 1-----");
        String s1 = "WebDevelopment";
        String s2 = "WebDev";
        System.out.println("Comparing two string lexicographically : "+s1+" and "+s2);
        System.out.println(lexicographicallyCompare(s1,s2));

        //q2 program to implement counting sort
        System.out.println("-----Question 2-----");
        char arr[] = {'a','a','h','r','a','t','b','b','r','s','b','t','u'};
        System.out.println("Original array content is : " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("After counting sort array content is : "+ Arrays.toString(arr));

        //q3 program to sort strings(using library function)
        System.out.println("-----Question 3-----");
        String str = "sakshi singhal 19104003 pec";
        System.out.println(str);
        char temp[] = str.toCharArray();// string is changed to Char Array
        Arrays.sort(temp); // Sorting the char array
        System.out.println(new String(temp));

        //q4 display Hailstone sequence for a number n
        System.out.println("-----Question 4-----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for which you want to display hailstone sequence");
        int n = sc.nextInt();
        System.out.print("Hailstone sequence for "+n+" is : ");
        while(n!=1){
            System.out.print(n + " ");
            if(n%2==0){
                n = n/2;
            }
            else{
                n =( n*3 )+ 1;
            }
        }
        System.out.println();

        //q5 print all possible ways to convert one string into another
        System.out.println("-----Question 5-----");
        String str1 = "abcdef";
        String str2 = "axcdfdh";
        System.out.println("Steps to convert "+str1+" to "+str2+" are : ");
        convertString(str1,str2);
        printWays(str1,str2,new ArrayList<String>());

    }
}
