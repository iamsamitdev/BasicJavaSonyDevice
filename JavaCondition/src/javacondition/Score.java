package javacondition;

public class Score {
    
    public static void main(String[] args) {
        int score = -10;
        
        if(score >= 80 && score <= 100){
            System.out.println("Grade A");
        }else if(score >= 70 && score <= 79){
            System.out.println("Grade B");
        }else if(score >= 60 && score <= 69){
            System.out.println("Grade C");
        }else if(score >= 50 && score <= 59){
            System.out.println("Grade D");
        }else if(score < 0 || score > 100){
            System.out.println("Invalid Score");
        }else{
            System.out.println("Grade F");
        }
    }
    
}
