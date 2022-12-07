package models;

import java.sql.PreparedStatement;

import DAO.DAO;

public class Jato extends Aeronave {

    private String cor;
    private int velocidade;

    public Jato() {

    }

    public Jato(int id, String marca, String modelo, String cor, int velocidade) throws Exception {
        super(id, marca, modelo);
        this.cor = cor;
        this.velocidade = velocidade;
    }

    public Jato(String marca, String modelo, String cor, int velocidade) {
        super(marca, modelo);
        this.cor = cor;
        this.velocidade = velocidade;

    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "cor=" + this.getCor() + "velocidade" + this.getVelocidade();
    }

    public void insert() {
        try {
            PreparedStatement prep = DAO.createConnection()
                    .prepareStatement("INSERT INTO jato (marca, cor, modelo, velocidade) VALUES (?, ?, ?, ?);");

            prep.setString(1, getMarca());
            prep.setString(2, getCor());
            prep.setString(3, getModelo());
            prep.setInt(4, getVelocidade());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println("Erro ao inserir jato");
        }
    }

    public void update() {
        try {
            PreparedStatement prep = DAO.createConnection()
                    .prepareStatement(
                            "UPDATE jato SET marca = ?, cor = ?, modelo = ?, velocidade = ? WHERE id_jato = ?;");
            prep.setString(1, getMarca());
            prep.setString(2, getCor());
            prep.setString(3, getModelo());
            prep.setInt(4, getVelocidade());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar jato");
        }
    }

    public void delete() {
        try {
            PreparedStatement prep = DAO.createConnection().prepareStatement("DELETE FROM jato WHERE id_jato = ?;");
            prep.setInt(1, getId());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println("Erro ao deletar jato");
        }
    }

}