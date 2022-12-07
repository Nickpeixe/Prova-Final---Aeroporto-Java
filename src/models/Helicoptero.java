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

    }

    Helicoptero(String marca, String modelo, String cor, int capacidade) throws Exception {
        super(marca, modelo);
        this.cor = cor;
        this.capacidade = capacidade;

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return super.toString() + "Cor" + cor + "Capacidade" + capacidade;
    }

    public void insert() {
        try {
            PreparedStatement prep = DAO.createConnection()
                    .prepareStatement("INSERT INTO helicoptero (marca, modelo, cor, capacidade) VALUES (?, ?, ?, ?);");

            prep.setString(1, getMarca());
            prep.setString(2, getModelo());
            prep.setString(3, getCor());
            prep.setInt(4, getCapacidade());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println("Erro ao inserir Helicoptero");
        }
    }

    public void update() {
        try {
            PreparedStatement prep = DAO.createConnection()
                    .prepareStatement(
                            "UPDATE jato SET marca = ?, modelo = ?, cor = ?, capacidade = ? WHERE id_heli = ?;");
            prep.setString(1, getMarca());
            prep.setString(2, getModelo());
            prep.setString(3, getCor());
            prep.setInt(4, getCapacidade());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar Helicoptero");
        }
    }

    public void delete() {
        try {
            PreparedStatement prep = DAO.createConnection().prepareStatement("DELETE FROM helicoptero WHERE id_heli = ?;");
            prep.setInt(1, getId());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println("Erro ao deletar jato");
        }
    }

}
