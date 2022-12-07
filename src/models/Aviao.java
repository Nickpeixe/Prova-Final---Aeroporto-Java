package models;
import DAO.DAO;
import java.sql.PreparedStatement;

public class Aviao extends Aeronave {
    private String prefixoS;
    private int capacidade;
    private int idCompanhia;
    private Companhia companhia;
    private int prefixoI;

Aviao(){

    }

Aviao(int id , String marca, String modelo, String prefixoS, int prefixoI, int capacidade, int idCompanhia) throws Exception{
        super(id, marca, modelo);
        this.prefixoS = prefixoS;
        this.prefixoI = prefixoI;
        this.capacidade = capacidade;
        this.idCompanhia = idCompanhia; 
        
        PreparedStatement prep  = DAO.createConnection().prepareStatement ("INSERT INTO helicoptero (id,marca,modelo,prefixoS,prefixoI,capacidade,idCompanhia) VALUES (?,?,?,?,?,?,?);");{
            prep.setInt(1,id);
            prep.setString(2, marca);
            prep.setString(3, modelo);
            prep.setString(4, prefixoS);
            prep.setInt(5, prefixoI);
            prep.setInt(6, capacidade);
            prep.setInt(7, idCompanhia);
            prep.execute();
            prep.close();


        } 
    } 

Aviao(String marca, String modelo,String prefixoS, int prefixoI, int capacidade, int idCompanhia) throws Exception{
        super(marca, modelo);
        this.prefixoS = prefixoS;
        this.prefixoI = prefixoI;
        this.capacidade = capacidade;
        this.idCompanhia = idCompanhia; 

        PreparedStatement prep  = DAO.createConnection().prepareStatement ("INSERT INTO helicoptero (marca,modelo,prefixoS,prefixoI,capacidade,idCompanhia) VALUES (?,?,?,?,?,?);");{
            
            prep.setString(2, marca);
            prep.setString(3, modelo);
            prep.setString(4, prefixoS);
            prep.setInt(5, prefixoI);
            prep.setInt(6, capacidade);
            prep.setInt(7, idCompanhia);
            prep.execute();
            prep.close();


        } 
        
    } 

public String getPrefixoS(){
        return prefixoS;    
}

public void setPrefixoS(String prefixoS){
        this.prefixoS = prefixoS;
}

public int getPrefixoI(){
    return prefixoI;    
}

public void setPrefixoI(int prefixoI){
    this.prefixoI = prefixoI;
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
    return super.toString() + "IdCompanhia" + idCompanhia + "Capacidade" + capacidade + "Prefixo" + prefixoS + prefixoI;
}
}


