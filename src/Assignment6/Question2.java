package Assignment6;

public class Question2 {
    //addition
    public static void addition(int a, int b){
        try{
            if (a>0 && b>0) {
                System.out.println("Addition is : " + (a + b));
            }
            else{
                throw new ArithmeticException("Negative input cannot be taken");
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    //subtraction
    public static void subtract(double a, double b){
        try{
            if (a>0 && b>0) {
                System.out.println(a - b);
            }
            else{
                throw new ArithmeticException("Negative input cannot be taken");
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        addition(-4, 8);
        subtract(3, -1);

    }
}
