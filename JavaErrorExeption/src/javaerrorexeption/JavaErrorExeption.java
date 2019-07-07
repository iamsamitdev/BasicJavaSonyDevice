package javaerrorexeption;

public class JavaErrorExeption {

    public static void main(String[] args) {
        try {
             int myNumber[] = {3,4,5};
            System.out.println(myNumber['8']);
        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e); 
        } finally{
            System.out.println("This is a try..cash test class"); // Alway call
        }
       
    }
    
}
