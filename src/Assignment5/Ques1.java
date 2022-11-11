package Assignment5;

class Mammals{

    public void category(){
        System.out.println("I am mammal");
    }

}

class MarineAnimals{
    public void category(){
        System.out.println("I am a marine animal");
    }

}

//multiple inheritance in java is not supported!!!
//class BlueWhale extends Mammals, MarineAnimals{
//    public void category(){
//        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
//    }
//}

public class Ques1 {
    public static void main(String[] args) {
        Mammals mammal = new Mammals();
        MarineAnimals marine = new MarineAnimals();
      //  BlueWhale whale = new BlueWhale();
        mammal.category();
        marine.category();
     //   whale.category();
        // Now java compiler cannot decide, which display method it
        // should inherit. To prevent such situation, multiple
        // inheritances is not allowed in java
     //   whale.super.category();
    }

}
