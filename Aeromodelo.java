

public class Aeromodelo {
    private int id;
    private String marca;
    private String modelo;

Aeromodelo(){


}       
Aeromodelo(int id, String marca, String modelo){
    this.id=id;
    this.marca=marca;
    this.modelo=modelo;
}

Aeromodelo(String marca, String modelo){
    this.marca=marca;
    this.modelo=modelo;
}

public int getId(){
    return id;
}
public void setId(int id){
    this.id=id;
}
public String getMarca(){
    return marca;
}
public void setMarca(String marca){
    this.marca=marca;
}
public String getModelo(){
    return marca;
}
public void setModelo(String modelo){
    this.modelo=modelo;
}
@Override
public String toString() {
    return ()
}

}