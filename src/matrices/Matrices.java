package matrices;
import javax.swing.*;
public class Matrices {

  
    public static void main(String[] args) {
       int i,j,f,c;
       f = Integer.parseInt(JOptionPane.showInputDialog(null,
       "Digite la cantidad de filas "));
       c = Integer.parseInt(JOptionPane.showInputDialog(null,
       "Digite la cantidad de columnas "));
       
       int mat[][] = new int[f][c];
       
       //Llenar la matriz
       
       for(i=0;i<f;i++){
           for(j=0;j<c;j++){
               mat[i][j]= Integer.parseInt(JOptionPane.showInputDialog(null,
               "Digite el valor para la posición " + "["+ i + "]" + "["+ j+ "]"));
           }
       }
       
       //imprimir la matriz
       String m = "";
       for(i=0;i<f;i++){
           for(j=0;j<c;j++){
               m += mat[i][j];
               m+=" | ";
           }
           m+="\n";
       }
       JOptionPane.showMessageDialog(null, m);
    }
    
}
