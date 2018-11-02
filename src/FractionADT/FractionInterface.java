package FractionADT;


public interface FractionInterface {
    
    public void setNumerator(int numerator);
    public int getNumerator();
    public void setDenominator(int denominator);
    public int getDenominator();
    
    
    public FractionInterface add(FractionInterface fraction2);
    public FractionInterface minus(FractionInterface fraction2);
    public FractionInterface multiply(FractionInterface fraction2);
    public FractionInterface divide(FractionInterface fraction2);
    
    
}
