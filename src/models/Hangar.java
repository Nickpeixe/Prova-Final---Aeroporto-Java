package models;

import java.sql.PreparedStatement;

import DAO.DAO;

public class Hangar {

    private int id;
    private String local;
    private int idAviao;
    private Aviao aviao;

    Hangar() {

    }

    Hangar(int id, String local, int idAviao, Aviao aviao) throws Exception {
        this.id = id;
        this.local = local;
        this.idAviao = idAviao;
        this.aviao = aviao;

    }

    Hangar(String local, int idAviao, Aviao aviao) throws Exception {
        this.local = local;
        this.idAviao = idAviao;
        this.aviao = aviao;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getIdAviao() {
        return idAviao;
    }

    public void setIdAviao(int idAviao) {
        this.idAviao = idAviao;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    @Override
    public String toString() {
        return "Local" + this.getLocal() + "Id do avião" + this.getIdAviao();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Hangar)) {
            return false;
        }
        final Hangar other = (Hangar) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public void insert() {
        try {
            PreparedStatement prep = DAO.createConnection()
                    .prepareStatement("INSERT INTO hangar (local, idAviao) VALUES (?, ?);");

            prep.setString(1, getLocal());
            prep.setInt(2, getIdAviao());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println("Erro ao inserir Hangar");
        }
    }

    public void update() {
        try {
            PreparedStatement prep = DAO.createConnection()
                    .prepareStatement(
                            "UPDATE hangar SET local = ?, idAviao = ? WHERE id_heli = ?;");
            prep.setString(1, getLocal());
            prep.setInt(2, getIdAviao());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar Hangar");
        }
    }

    public void delete() {
        try {
            PreparedStatement prep = DAO.createConnection().prepareStatement("DELETE FROM hangar WHERE id_hangar = ?;");
            prep.setInt(1, getId());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println("Erro ao deletar jato");
        }
    }

}
