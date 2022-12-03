package models;
import DAO.DAO;
import java.sql.PreparedStatement;

public class Helicoptero extends Aeronave {
    private String cor;
    private int capacidade;

Helicoptero() {
        
}

Helicoptero(int id, String marca, String modelo, String cor, int capacidade) throws Exception {
    super(id, marca, modelo);
    this.cor = cor;
    this.capacidade = capacidade;

    PreparedStatement prep  = DAO.createConnection().prepareStatement ("INSERT INTO helicoptero (? , ? , ? , ? , ? );");{
        prep.setInt(1,id);
        prep.setString(2,marca);
        prep.setString(3,modelo);
        prep.setString  (4,cor);
        prep.setInt(5,capacidade);
        prep.execute();
        prep.close();
        
}
}

Helicoptero(String marca, String modelo, String cor, int capacidade)throws Exception {
    super(marca, modelo);
    this.cor = cor;
    this.capacidade = capacidade;

    PreparedStatement prep  = DAO.createConnection().prepareStatement ("INSERT INTO helicoptero ( ? , ? , ? , ? );");{
        
        prep.setString(1,marca);
        prep.setString(2,modelo);
        prep.setString  (3,cor);
        prep.setInt(4,capacidade);
        prep.execute();
        prep.close();
}
}

public String getCor(){
    return cor;
}

public void setCor(String cor) {
    this.cor = cor; 
}

public int getCapacidade(){
    return capacidade;
}

public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
}

@Override
 public String  toString(){
    return super.toString() + "Cor" + cor + "Capacidade" + capacidade;
}

}
