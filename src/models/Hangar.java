package models;

public class Hangar {

    private int id;
    private String local;
    private int idAviao;
    private Aviao aviao;

Hangar(){

}

Hangar(int id, String local, int idAviao, Aviao aviao){
    this.id = id;
    this.local = local;
    this.idAviao = idAviao;
    this.aviao = aviao;
}

Hangar(String local, int idAviao, Aviao aviao){
    this.local = local;
    this.idAviao = idAviao;
    this.aviao = aviao;
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

public Aviao getAviao(Aviao aviao){
    return aviao;
}

public void setAviao(Aviao aviao) {
    this.aviao = aviao;
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




