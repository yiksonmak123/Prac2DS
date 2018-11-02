package MatrixADT;

public class Matrix implements MatrixInterface{
    private int[][] matrixArray ;
    
    public Matrix(int n){
        matrixArray = new int[3][3];
    }
    
    @Override
    public void makeEmpty(int m){
        if(m > matrixArray.length)
            m = matrixArray.length ;
        
        for(int i = 0 ; i < m ; ++i)
            for(int j = 0 ; j < m ; j++)
                matrixArray[i][j] = 0;
    }
    
    @Override
    public boolean storeValue(int i, int j , int value){
        boolean successful = false;
        
        
        return successful ;
    }
}
