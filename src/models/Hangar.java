package models;

import java.sql.PreparedStatement;

import DAO.DAO;

public class Hangar {

    private int id;
    private String local;
    private int idAviao;
    private Aviao aviao;

Hangar(){

}

Hangar(int id, String local, int idAviao, Aviao aviao) throws Exception {
    this.id = id;
    this.local = local;
    this.idAviao = idAviao;
    this.aviao = aviao;

    PreparedStatement prep  = DAO.createConnection().prepareStatement ("INSERT INTO hangar (? , ? , ? , ? );");{

        prep.setInt(1,id);
        prep.setString(2,local);
        prep.setInt(3,idAviao);
        prep.execute();
        prep.close();
    }
}

Hangar(String local, int idAviao, Aviao aviao) throws Exception{
    this.local = local;
    this.idAviao = idAviao;
    this.aviao = aviao;

    PreparedStatement prep  = DAO.createConnection().prepareStatement ("INSERT INTO hangar ( ? , ? , ? );");{

    
        prep.setString(1,local);
        prep.setInt(2,idAviao);
        prep.execute();
        prep.close();
    }
}

public int getId(){
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getLocal(){
    return local;
}

public void setLocal(String local) {
    this.local = local;
}

public int getIdAviao(){
    return idAviao;
}

public void setIdAviao(int idAviao){
    this.idAviao = idAviao;
}

public Aviao getAviao(){
    return aviao;
}

public void setAviao(Aviao aviao) {
    this.aviao = aviao;
}

@Override
public String toString() {
    return "Local"+ this.getLocal()+ "Id do avião"+ this.getIdAviao();
}

@Override
public boolean equals(Object obj){
    if(obj==null || !(obj instanceof Hangar))
    {
       return false;
    }
    final Hangar other = (Hangar) obj;
     if(this.id != other.id)
      {
        return false;
      }
        return true;  
}

}




