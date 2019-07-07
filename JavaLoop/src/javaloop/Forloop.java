package javaloop;

public class Forloop {
    public static void main(String[] args) {
        for(int a=1;a<=100;a++){
            System.out.println("This is line "+a);
            if(a == 50){
                continue;
            }
            if(a ==80){
                break;
            }
        }
    }
}
