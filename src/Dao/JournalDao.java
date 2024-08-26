/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;


import Models.JournalModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MHD
 */
public class JournalDao implements Dao<JournalModel> {
         DButil dbutil = new DButil();

  public boolean insert (JournalModel obj) throws SQLException{

    String sql = "insert into doc (titre,nom_autheur,nbCopie,datePublication,champ1 ,idCat,type) values ('" + obj.getTitre() + "' ,'"
                  + obj.getNomAuteur() +"', "+ obj.getNbCopie() +", '"+obj.getDatePublication()+"', '"+obj.getIssn()+"' ,"+obj.getIdCat()+" , 'disqueCompact' ) ";
    if(dbutil.DML(sql)){
          return true;
    }
    return false;
}


  public boolean update (JournalModel obj) throws SQLException{
      
    String sql = "update Doc set titre = '"+ obj.getTitre() +"', nom_autheur = '"+ obj.getNomAuteur() +"' , nbCopie = "+ obj.getNbCopie() +" ,datePublication = '"+obj.getDatePublication()+"' , champ1 = '"+obj.getIssn()+"' , idCat = "+obj.getIdCat()+" where idDoc = "+obj.getIdJournal()+" "; 
    if(dbutil.DML(sql)){
          return true;
    }
    return false; 
}

  public boolean delete (JournalModel obj) throws SQLException{

   String sql = "delete from doc where idDoc = "+obj.getIdJournal()+" "; 
    if(dbutil.DML(sql)){
          return true;
    }
    return false; 


}

  public JournalModel select(JournalModel obj) throws SQLException{

   String sql = "select * from Doc where idDoc = "+obj.getIdJournal()+"  "; 
   ResultSet rs = dbutil.select(sql);
   if(rs.next()){
       return new JournalModel(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getString(6),rs.getInt(7))  ;  
}
   return null;
}

    public ArrayList<JournalModel> getAll() throws SQLException{
       ArrayList<JournalModel> list = new ArrayList();
       String sql = "select * from doc where type ='journal'";
       ResultSet rs = dbutil.select(sql);
       while(rs.next()){
          list.add(new JournalModel(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getString(6),rs.getInt(7)));
        }
       return list;
}



    public ResultSet getRsAll() throws SQLException{

       String sql = "select idDoc,titre,nom_autheur,nbCopie,datePublication,champ1 ,nomCat  from doc , categorie  where doc.idCat = categorie.idCat and  type = 'journal'";
       ResultSet rs = dbutil.select(sql);
       return rs;
}




    public ResultSet search(String colName , String key ) throws SQLException{

       String sql = "select idDoc,titre,nom_autheur,nbCopie,datePublication,champ1 ,nomCat from doc , categorie where  doc.idCat = categorie.idCat and type = 'journal'  and "+colName+" like '"+key+"%'  "; 
       ResultSet rs = dbutil.select(sql);
       return rs;

}
}
