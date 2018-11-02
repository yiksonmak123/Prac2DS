package MatrixADT;


public interface MatrixInterface {
    public void makeEmpty(int n);
    public boolean storeValue(int i , int j, int value);
    
    
    public MatrixInterface add(MatrixInterface matrix2);
    public MatrixInterface copy(MatrixInterface matrix2);
}
