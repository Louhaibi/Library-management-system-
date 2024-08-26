/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MHD
 */
public class ResultSetModel extends AbstractTableModel{

   String [] colNames = new String[0];
  Vector<String[]> rowDatas = new Vector();



   public void setResultSet(ResultSet rs)  {

        if(rs == null){
        
             colNames = new String[0];
             rowDatas.clear();
             fireTableChanged(null); 
              return;
        }
        try{
       
            int column = rs.getMetaData().getColumnCount();
        colNames = new String[column];
        for(int i=0;i<column;i++){
             colNames[i] = rs.getMetaData().getColumnName(i+1);
             if(colNames[i] != null){
                 colNames[i].trim();
             }
        }

        rowDatas.clear();
        
        while(rs.next()){
              String row[] = new String[column];
             for(int j = 0;j<column ;j++){
                 
                row[j] = rs.getString(j + 1);
                
                if(row[j] != null){
                      row[j].trim();
                 }
              }     
             //System.out.println(row[1] +" "+ row[2]+" "+row[3]);
              rowDatas.add(row);     
             
        }  
             fireTableChanged(null);
        

       }catch(SQLException e){
                   e.printStackTrace();
       }
}






@Override
   public int getRowCount(){
  
       return rowDatas.size();    
}

 public int getColumnCount(){

    return colNames.length;

}


public String getColumnName(int column){

     return colNames[column] == null ? "no name" :  colNames[column] ;
}
 
  public Object getValueAt(int row, int column){

     return rowDatas.elementAt(row)[column];
}
    
}
