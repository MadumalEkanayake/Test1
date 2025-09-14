package Prc;

public class Child extends Parent {

String eat = "eating 2";

public void function(){
    System.out.println("jump2");//

}

public void overload(int a, int b, String c){

    System.out.println(a+ b+c);

}

    public static void main(String[] args) {
        Parent max = new Child();
        System.out.println(max.eat);

        max.function();
        max.overload(3,5);

    }

}