package Assignment5;
// question 4 : "YES" the following code snippet will run and the output will be 24
// as "a" is a static variable and at creation of each object its value is incremented
// in the constructor and when obj3.m1() is called its incremented one more time
public class Ques4 {
    static int a = 20;
    Ques4() {
        a++;
    }
    void m1() { // Insted of "Void" it is "void" 
        a++;
        System.out.println(a); //made a change instead of colon, semicolon is there
    }
    public static void main(String[] args)
    {
        Ques4 obj = new Ques4();
        Ques4 obj2 = new Ques4();
        Ques4 obj3 = new Ques4();
        obj3.m1();
    }
}
