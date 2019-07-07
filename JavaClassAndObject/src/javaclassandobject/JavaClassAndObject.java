package javaclassandobject;

public class JavaClassAndObject {

    public static void main(String[] args) {
        
        // Create Instance or Object
        VatCalculate objVat = new VatCalculate();
        
        // Assign value to properite
        //objVat.vat = 7.0;
        //objVat.price = 200;
        
        System.out.println(String.format("%.2f",objVat.calVAT(200.0,7.0)));
        
    }
    
}
