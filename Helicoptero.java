
public class Helicoptero extends Aeronave {
    private String cor;
    private int capacidade;

Helicoptero() {
        
}

Helicoptero(int id, String marca, String modelo, String cor, int capacidade) {
    this.id = id;
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.capacidade = capacidade;
}

Helicoptero(String marca, String modelo, String cor, int capacidade) {
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.capacidade = capacidade;
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
