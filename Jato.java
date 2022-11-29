public class Jato extends Aeronave{

    private String cor;
    private int velocidade;

    public Jato(){

    }
    public Jato(int id,String marca, String modelo, String cor, int velocidade) {
        super( id, marca,  modelo);
        this.cor=cor;
        this.velocidade=velocidade;
    }
    public Jato(String marca, String modelo, String cor, int velocidade){
        super(  marca,  modelo);
        this.cor=cor;
        this.velocidade=velocidade;

    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor=cor;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade=velocidade;
    }
    @Override
    public String toString() {
       return "cor=" + this.getCor() + "velocidade" + this.getVelocidade();
    }
    


}