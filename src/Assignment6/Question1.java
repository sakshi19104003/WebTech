package Assignment6;

public class Question1 {
    //division
    public static void divide(int a, int b){
        try{
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println("Division by 0 is not possible");
        }
    }

    //multiplication
    public static void multiply(double a, double b){
        try{
            if (a*b != 0){
                System.out.println(a*b);
            }
            else{
                throw new ArithmeticException("0 cannot be the input");
            }}
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        multiply(0, 23);
        divide(8, 0);
    }
}
