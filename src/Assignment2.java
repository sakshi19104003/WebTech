public class Assignment2 {
    public static void smallestOfThree(double x, double y, double z)
    {
        if(x<y){
            if(x<z) System.out.println("The smallest number is " + x);
            else System.out.println("The smallest number is " + z);
        }
        else{
            if(y<z) System.out.println("The smallest number is " + y);
            else System.out.println("The smallest number is " + z);
        }
    }
    public static void main(String args[]){
        // question 1
        System.out.println("----------------- Question 1 --------------------");
        double score = 82;
        System.out.println("The initial score is " + score);
        if(score>=80 && score<=90){
            score+=5;
        }
        System.out.println("The score after processing is " + score);

        //question 2
        System.out.println("----------------- Question 2 --------------------");
        double num1 = 34.54,num2 = 23.23,num3=12.4;
        smallestOfThree(num1,num2,num3);

        //question 3
        System.out.println("----------------- Question 3 --------------------");
        int month = 6;
        switch (month) {
            case 1:
                System.out.println("Month: January");
                break;
            case 2:
                System.out.println("Month: February");
                break;
            case 3:
                System.out.println("Month: March");
                break;
            case 4:
                System.out.println("Month: April");
                break;
            case 5:
                System.out.println("Month: May");
                break;
            case 6:
                System.out.println("Month: June");
                break;
            case 7:
                System.out.println("Month: July");
                break;
            case 8:
                System.out.println("Month: August");
                break;
            case 9:
                System.out.println("Month: September");
                break;
            case 10:
                System.out.println("Month: October");
                break;
            case 11:
                System.out.println("Month: November");
                break;
            case 12:
                System.out.println("Month: December");
                break;
            default:
                System.out.println("Invalid input - Wrong month number.");
                break;
        }

        //question 4
        System.out.println("----------------- Question 4 --------------------");
        int population = 80000;
        int years = 0;
        while(population<150000){
            population += 0.05*population;
            years++;
        }
        System.out.println("The population will first exceed to 150000 in " + years + " years");

        //question 5
        System.out.println("----------------- Question 5 --------------------");
        int n = 5;
        System.out.println("n          n^2           n^3         n^4");
        for(int i = 1;i<=n;i++){
            int pow1 = (int) Math.pow(i,2);
            int pow2 = (int) Math.pow(i,3);
            int pow3 = (int) Math.pow(i,4);
            System.out.println(i+"          "+pow1+"            "+pow2+"            "+pow3);
        }

        //question 6
        System.out.println("----------------- Question 6 --------------------");
        System.out.print("Multiples of 3 are : ");
        int multiple3 = 3;
        do {
            System.out.print(multiple3 + "     " );
            multiple3 += 3;
        } while(multiple3 <= 36);
        System.out.println();


    }
}
