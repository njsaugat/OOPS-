package week3;

public class MatrixMult {
    public static void main(String args[]){  
        int matrix1[][]={{1,2,3},{4,5,6},{7,8,9}};    
        int matrix2[][]={{1,2,1},{5,2,3},{4,5,3}};                
        int matrix3[][]=new int[3][3];  //3 rows and 3 columns  
            
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
            matrix3[i][j]=0;      
                for(int k=0;k<3;k++){      
                matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];      
                }  
                    System.out.print(matrix3[i][j]+" ");    
                }  
            System.out.println();   
        }    
}
}
