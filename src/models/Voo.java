package models;

import java.sql.PreparedStatement;

import DAO.DAO;

public class Voo {
    private int id;
    private String numeroS;
    private Long numeroI;
    private String data;
    private String hora;
    private String origem;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;
    private int idPista;
    private int idAviao;
    private Aviao aviao;
    private int idHelicoptero;
    private Helicoptero helicoptero;
    private int idJato;
    private Jato jato;
    private String codigoAeronave;
    private String codigoHangar;
    private String codigoPista;

    Voo() {

    }

    Voo(int id, String numeroS, long numeroI, String data, String hora, String origem, String destino, String piloto,
        String copiloto, String observacao, int idPista, int idAviao, int idHelicoptero, int idJato,  
        String codigoAeronave, String codigoHangar, String codigoPista)
         {
        this.id = id;
        this.numeroS = numeroS;
        this.numeroI = numeroI;
        this.data = data;
        this.hora = hora;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;
        this.idPista = idPista;
        this.idAviao = idAviao;
        this.idHelicoptero = idHelicoptero;
        this.idJato = idJato;
        this.codigoAeronave = codigoAeronave;
        this.codigoHangar = codigoHangar;
        this.codigoPista = codigoPista;
    }

    Voo(String numeroS, long numeroI, String data, String hora, String origem, String destino, String piloto,
            String copiloto, String observacao, int idPista, int idAviao, int idHelicoptero, int idJato)
            throws Exception {

        this.numeroS = numeroS;
        this.numeroI = numeroI;
        this.data = data;
        this.hora = hora;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;
        this.idPista = idPista;
        this.idAviao = idAviao;
        this.idHelicoptero = idHelicoptero;
        this.idJato = idJato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroS() {
        return numeroS;
    }

    public void setNumeroS(String numeroS) {
        this.numeroS = numeroS;
    }

    public Long getNumeroI() {
        return numeroI;
    }

    public void setNumeroI(Long numeroI) {
        this.numeroI = numeroI;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(String copiloto) {
        this.copiloto = copiloto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getIdPista() {
        return idPista;
    }

    public void setIdPista(int idPista) {
        this.idPista = idPista;
    }

    public int getIdAviao() {
        return idAviao;
    }

    public void setIdAviao(int idAviao) {
        this.idAviao = idAviao;
    }

    public int getIdHelicoptero() {
        return idHelicoptero;
    }

    public void setIdHelicoptero(int idHelicoptero) {
        this.idHelicoptero = idHelicoptero;
    }

    public int getIdJato() {
        return idJato;
    }

    public void setIdJato(int idJato) {
        this.idJato = idJato;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public Helicoptero getHelicoptero() {
        return helicoptero;
    }

    public void setHelicoptero(Helicoptero helicoptero) {
        this.helicoptero = helicoptero;
    }

    public Jato getJato() {
        return jato;
    }

    public void setJato(Jato jato) {
        this.jato = jato;
    }

    public Jato getJato() {
        return jato;
    }

    public void setJato(Jato jato) {
        this.jato = jato;
    }

    @Override
    public String toString() {
        return super.toString() + "Número" + numeroS + numeroI + "Data" + data
                + "Hora" + hora + "Origem" + origem + "Destino" + destino + "Piloto"
                + piloto + "Copiloto" + copiloto + "Observação" + observacao
                + "IdPista" + idPista + "IdAvião" + idAviao + "IdHelicoptero" + idHelicoptero + "IdJato" + idJato;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Voo)) {
            return false;
        }
        final Voo other = (Voo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public void insert() {
        try {
            PreparedStatement prep = DAO.createConnection().prepareStatement(
                    "INSERT INTO voo ( numeroS,numeroI, data, hora, origem, destino, piloto, copiloto, observacao, id_pista, id_aviao, id_helicoptero, id_jato) VALUES (? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            prep.setString(1, getNumeroS());
            prep.setLong(2, getNumeroI());
            prep.setString(3, getData());
            prep.setString(4, getHora());
            prep.setString(5, getOrigem());
            prep.setString(6, getDestino());
            prep.setString(7, getPiloto());
            prep.setString(8, getCopiloto());
            prep.setString(9, getObservacao());
            prep.setInt(10, getIdPista());
            prep.setInt(11, getIdAviao());
            prep.setInt(12, getIdHelicoptero());
            prep.setInt(13, getIdJato());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void update() {
        try {
            PreparedStatement prep = DAO.createConnection().prepareStatement(
                    "UPDATE voo SET numeroS = ?, numeroI = ?, data = ?, hora = ?, origem = ?, destino = ?, piloto = ?, copiloto = ?, observacao = ?, id_pista = ?, id_aviao = ?, id_helicoptero = ?, id_jato = ? WHERE id = ?;");
            prep.setString(1, getNumeroS());
            prep.setLong(2, getNumeroI());
            prep.setString(3, getData());
            prep.setString(4, getHora());
            prep.setString(5, getOrigem());
            prep.setString(6, getDestino());
            prep.setString(7, getPiloto());
            prep.setString(8, getCopiloto());
            prep.setString(9, getObservacao());
            prep.setInt(10, getIdPista());
            prep.setInt(11, getIdAviao());
            prep.setInt(12, getIdHelicoptero());
            prep.setInt(13, getIdJato());
            prep.setInt(14, getId());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        try {
            PreparedStatement prep = DAO.createConnection().prepareStatement("DELETE FROM voo WHERE id = ?;");
            prep.setInt(1, getId());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
