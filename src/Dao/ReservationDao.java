/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Models.JournalModel;
import Models.ReservationModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MHD
 */
public class ReservationDao  {
            DButil dbutil = new DButil();

  public boolean insert(ReservationModel obj) throws SQLException{

    String sql = "insert into reservation (dateDebutRes,dateFinRes,prixApaye,idUser,idExemplaire,typeRes) values ('" + obj.getDateDebutRes() + "' ,'"
                  + obj.getDateFinRes() +"', "+ obj.getPrixApaye() +", "+obj.getIdUser()+", "+obj.getIdExemplaire()+" ,'"+obj.getTypeRes()+" ' ) ";
    if(dbutil.DML(sql)){
          return true;
    }
    return false;
}


 

  public boolean delete (ReservationModel obj) throws SQLException{

   String sql = "delete from reservation where idRes = "+obj.getIdRes()+" "; 
    if(dbutil.DML(sql)){
          return true;
    }
    return false; 


}

  public ReservationModel select(ReservationModel obj) throws SQLException{

   String sql = "select * from reservation where idRes = "+obj.getIdRes()+"  "; 
   ResultSet rs = dbutil.select(sql);
   if(rs.next()){
       return new ReservationModel(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getInt(3), rs.getFloat(4),rs.getInt(5),rs.getInt(6),rs.getString(7))  ;  
}
   return null;
}

    public ArrayList<ReservationModel> getAll() throws SQLException{
       ArrayList<ReservationModel> list = new ArrayList();
       String sql = "select * from reservation ";
       ResultSet rs = dbutil.select(sql);
       while(rs.next()){
          list.add(new ReservationModel(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getInt(3), rs.getFloat(4),rs.getInt(5),rs.getInt(6),rs.getString(7)));
        }
       return list;
}



    public ResultSet getRsAll() throws SQLException{

       String sql = "select idRes,codeBar,dateDebutRes,dateFinRes,nom,prenom ,cin,typeRes ,prixApaye,isReturned from reservation"
        + " , users, exemplaire  where  exemplaire.idExemplaire = reservation.idExemplaire and reservation.idUser = users.idUser";
       ResultSet rs = dbutil.select(sql);
       return rs;
}




    public ResultSet search(String colName , String key ) throws SQLException{

       String sql = "select idRes,codeBar,dateDebutRes,dateFinRes,nom,prenom ,cin,typeRes ,prixApaye,isReturned from reservation"
 + "    , users, exemplaire  where  exemplaire.idExemplaire = reservation.idExemplaire and reservation.idUser = users.idUser  and "+colName+" like '"+key+"%'  "; 
       ResultSet rs = dbutil.select(sql);
       return rs;
    }

    public int getUserIdFromCin(String cin) throws SQLException{
       String sql = "select idUser from users where cin = '"+cin+"' " ;
       ResultSet rs = dbutil.select(sql);
      if(rs.next())
          return rs.getInt(1);
      return 0;
    } 

    public int getIdExemplaireFromCodeBar(String codeBar) throws SQLException{
       String sql = "select idExemplaire from exemplaire where codeBar = '"+codeBar+"' " ;
       ResultSet rs = dbutil.select(sql);
      if(rs.next())
          return rs.getInt(1);
      return 0;
    } 
    public String getTypeExemplaire(String codeBar) throws SQLException{
       String sql = "select type from exemplaire , doc  where  doc.idDoc = exemplaire.idDoc and codeBar = '"+codeBar+"' " ;
       ResultSet rs = dbutil.select(sql);
      if(rs.next())
          return rs.getString(1);
      return "";
    } 

    public int getNbreReservationEncours (String cin) throws SQLException{
        String sql = "select count(idRes) from reservation , users where reservation.idUser = users.idUser and dateFinRes > now() "
        + "and isReturned = 0 and cin = '"+cin+"' ";
        ResultSet rs = dbutil.select(sql);
       if(rs.next())
          return rs.getInt(1);
       return 0;
   }

   public int checkUserPenalite (String cin) throws SQLException{
        String sql = "select count(idPenalite) from penalite , reservation , users where reservation.idRes = penalite.idRes  and users.idUser =reservation.idUser  "
        + " and users.idUser =penalite.idUser and cin = '"+cin+"' and isRegler = 0  ";
        ResultSet rs = dbutil.select(sql);
       if(rs.next())
          return rs.getInt(1);
       return 0;
   }

   public boolean updateReturnedValue (int idRes) throws SQLException{
        String sql = "update reservation set isReturned = 1 where idRes = "+idRes+" ";
        return dbutil.DML(sql);
       
   }
   public int daysNoTPayed(int idRes) throws SQLException{
        String sql = "SELECT DATEDIFF(now(), dateFinRes) from reservation where idRes = "+idRes+" ";
        ResultSet rs = dbutil.select(sql);
       if(rs.next())
          return rs.getInt(1);
       return 0;  
   }
   public boolean insertPenalite (int amende, int idUser,int idRes) throws SQLException{
        String sql = "insert into penalite (amende,idUser,idRes) values ( "+amende+" , "+idUser+", "+idRes+") ";
        return dbutil.DML(sql);    
   }

  public String getType (int idRes) throws SQLException{
        String sql = " select typeRes from reservation where idRes = "+idRes+" ";
        ResultSet rs = dbutil.select(sql);
       if(rs.next())
          return rs.getString(1);
       return "";   
   }

   public int getUserIdFromIdRes (int idRes) throws SQLException{
        String sql = " select idUser from reservation where idRes = "+idRes+" ";
        ResultSet rs = dbutil.select(sql);
       if(rs.next())
          return rs.getInt(1);
       return 0;   
   }

  
}
