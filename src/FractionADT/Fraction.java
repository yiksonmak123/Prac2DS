package FractionADT;

public class Fraction implements FractionInterface {
    private int numerator;
    private int denominator;
    
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public int getNumerator(){
        return numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
    public int getDenominator(){
        return denominator;
    }
    
    
    public FractionInterface add(FractionInterface fraction2){
        FractionInterface res = new Fraction();
        FractionInterface f1 = new Fraction();
        res.setNumerator(this.numerator * fraction2.getDenominator()+
                                this.denominator*fraction2.getNumerator()); 
        res.setDenominator(this.denominator * fraction2.getDenominator());
        //res = f1.add(fraction2);
        return res;
    }
    public FractionInterface minus(FractionInterface fraction2){
        FractionInterface res = new Fraction();
        FractionInterface f1 = new Fraction();
        res.setNumerator(this.numerator * fraction2.getDenominator()-
                                this.denominator*fraction2.getNumerator()); 
        res.setDenominator(this.denominator * fraction2.getDenominator());
        
        //res = f1.minus(fraction2);
        return res;
    }
    public FractionInterface multiply(FractionInterface fraction2){
        FractionInterface res = new Fraction();
        FractionInterface f1 = new Fraction();
        res.setNumerator(this.numerator * fraction2.getNumerator()); 
        res.setDenominator(this.denominator * fraction2.getDenominator());
        
        //res = f1.multiply(fraction2);
        return res;
    }
    public FractionInterface divide(FractionInterface fraction2){
        FractionInterface res = new Fraction();
        FractionInterface f1 = new Fraction();
        res.setNumerator(this.numerator * fraction2.getDenominator()); 
        res.setDenominator(this.denominator * fraction2.getNumerator());
        
        //res = f1.divide(fraction2);
        return res;
    }
    
    public String toString(){
        return numerator + "/" + denominator;
    }
    
}
