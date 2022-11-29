public class Aviao extends Aeronave {
    private String prefixo;
    private int capacidade;
    private int idCompanhia;
    private Companhia companhia;

Aviao(){

    }

Aviao(int id , String marca, String modelo, String prefixo, int capacidade, int idCompanhia){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        this.idCompanhia = idCompanhia; 
        
    } 

Aviao(String marca, String modelo, String prefixo, int capacidade, int idCompanhia){
        this.marca = marca;
        this.modelo = modelo;
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        this.idCompanhia = idCompanhia; 
        
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

@Override
 public String  toString(){
    return super.toString() + "IdCompanhia" + idCompanhia + "Capacidade" + capacidade + "Prefixo" + prefixo;
}
}


