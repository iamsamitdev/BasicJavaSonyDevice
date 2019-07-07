package javaclassandobject;

public class VatCalculate {
    
    // Properties
    double vat;
    double price;
    
    // Method
    public double calVAT(double price, double  vat){
        
        this.price = price;
        this.vat = vat;
        
        double totalPrice = this.price+ (this.price * (this.vat / 100));
        return totalPrice;
    }
    
}
