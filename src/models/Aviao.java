package models;
import DAO.DAO;
import java.sql.PreparedStatement;

public class Aviao extends Aeronave {
    private String prefixo;
    private int capacidade;
    private int idCompanhia;
    private Companhia companhia;

Aviao(){

    }

Aviao(int id , String marca, String modelo, String prefixo, int capacidade, int idCompanhia) throws Exception{
        super(id, marca, modelo);
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        this.idCompanhia = idCompanhia; 
        
        PreparedStatement prep  = DAO.createConnection().prepareStatement ("INSERT INTO aviao (? ,? ,? ,? ,? ,?);");{
            prep.setInt(1,id);
            prep.setString(2, marca);
            prep.setString(3, modelo);
            prep.setString(4, prefixo);
            prep.setInt(5, capacidade);
            prep.setInt(6, idCompanhia);
            prep.execute();
            prep.close();


        } 
    } 

Aviao(String marca, String modelo, String prefixo, int capacidade, int idCompanhia) throws Exception{
        super(marca, modelo);
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        this.idCompanhia = idCompanhia; 

        PreparedStatement prep  = DAO.createConnection().prepareStatement ("INSERT INTO aviao (? ,? ,? ,? ,?);");{
            
            prep.setString(1, marca);
            prep.setString(2, modelo);
            prep.setString(3, prefixo);
            prep.setInt(4, capacidade);
            prep.setInt(5, idCompanhia);
            prep.execute();
            prep.close();


        } 
        
    } 

public String getPrefixo(){
        return prefixo;    
}

public void setPrefixo(String prefixo){
        this.prefixo = prefixo;
}

public int getCapacidade(){
    return capacidade;    
}

public void setCapacidade(int capacidade){
    this.capacidade = capacidade;
}

public int getIdCompanhia(){
    return idCompanhia;    
}

public void setIdCompanhia(int idCompanhia){
    this.idCompanhia = idCompanhia;
}

public Companhia getCompanhia(){
    return companhia;
}

public void setCompanhia(Companhia companhia){
    this.companhia = companhia;
}

@Override
 public String  toString(){
    return super.toString() + "IdCompanhia" + idCompanhia + "Capacidade" + capacidade + "Prefixo" + prefixo;
}
}


