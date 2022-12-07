package models;

import java.sql.PreparedStatement;
import DAO.DAO;

public class Pista {
    private int id;
    private String numeroS;
    private int numeroI;

    public Pista() {

    }

    public Pista(int id, String numeroS, int numeroI) {
        this.id = id;
        this.numeroS = numeroS;
        this.numeroI = numeroI;

    }

    public Pista(String numeroS, int numeroI) {
        this.numeroS = numeroS;
        this.numeroI = numeroI;
        
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

    public int getNumeroI() {
        return numeroI;
    }

    public void setNumeroI(int numeroI) {
        this.numeroI = numeroI;
    }

    @Override
    public String toString() {

        return "Numero da pista: " + numeroS + numeroI;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Voo)) {
            return false;
        }
        final Pista other = (Pista) obj;
        if (this.id != other.id) {
            return false;

        }
        return true;
    }

    public void insert() {
        try {
            PreparedStatement prep = DAO.createConnection()
                    .prepareStatement("INSERT INTO pista (numeroS, numeroI) VALUES (?, ?);");

            prep.setString(1, getNumeroS());
            prep.setInt(2, getNumeroI());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println("Erro ao Inserir Pista");
        }
    }

    public void update() {
        try {
            PreparedStatement prep = DAO.createConnection()
                    .prepareStatement("UPDATE pista SET numeroS = ?, numeroI = ? WHERE id_pista = ?;");
            prep.setString(1, getNumeroS());
            prep.setInt(2, getNumeroI());
            prep.setInt(3, getId());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar Pista");
        }
    }

    public void delete() {
        try {
            PreparedStatement prep = DAO.createConnection().prepareStatement("DELETE FROM pista WHERE id_pista = ?;");
            prep.setInt(1, getId());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println("Erro ao deletar pista");
        }
    }
}