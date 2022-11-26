package Assignment6.Question3;


public class Main extends Calculator {
    public Main(Object a, Object b) {
        super(a, b);
    }

    public static void addition(Calculator a){
        try{
            if (!(a.first).getClass().getSimpleName().equals("Integer") || !(a.second).getClass().getSimpleName().equals("Integer")){
                throw new NumberFormatException("Integer is expected in the input");
            }else{
                System.out.println((int)(a.first)+ (int)(a.second));
            }}
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    public static void subtraction(Calculator a){
        try{
            if (!(a.first).getClass().getSimpleName().equals("Integer") || !(a.second).getClass().getSimpleName().equals("Integer")){
                throw new NumberFormatException("Integer is expected in the input");
            }else{
                System.out.println((int)(a.first)- (int)(a.second));
            }}
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
    public static void multiplication(Calculator a){
        try{
            if (!(a.first).getClass().getSimpleName().equals("Integer") || !(a.second).getClass().getSimpleName().equals("Integer")){
                throw new NumberFormatException("Integer is expected in the input");
            }else{
                System.out.println((int)(a.first)*(int)(a.second));
            }}
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
    public static void division(Calculator a){
        try{
            if (!(a.first).getClass().getSimpleName().equals("Integer") || !(a.second).getClass().getSimpleName().equals("Integer")){
                throw new NumberFormatException("Integer is expected in the input");
            }else
                try{
                    System.out.println(((int)a.first)/((int)a.second));
                }catch (Exception e){
                    System.out.println("Division by 0 is not possible");
                }
            }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        Calculator obj1 = new Calculator(5, 44);
        Calculator obj2 = new Calculator(13, new double[]{45.4, 45});
        Calculator obj3 = new Calculator(true, 46);
        Calculator obj4 = new Calculator(15, 0);
        addition(obj1);
        subtraction(obj2);
        multiplication(obj3);
        division(obj4);
    }

}
