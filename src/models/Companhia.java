package models;
import DAO.DAO;
import java.sql.PreparedStatement;
public class Companhia {

    private int id;
    private String nome;
    private String cnpj;

    Companhia() {

    }

    Companhia(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    Companhia(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Companhia)) {
            return false;
        }
        final Companhia other = (Companhia) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public void insert() {
        try {
            PreparedStatement prep = DAO.createConnection()
                    .prepareStatement("INSERT INTO companhia (nome, cnpj) VALUES (?, ?);");

            prep.setString(1, getNome());
            prep.setString(2, getCnpj());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println("Erro ao inserir Companhia");
        }
    }

    public void update() {
        try {
            PreparedStatement prep = DAO.createConnection()
                    .prepareStatement(
                            "UPDATE Companhia SET nome = ?, cnpj = ? WHERE id_heli = ?;");
            prep.setString(1, getNome());
            prep.setString(2, getCnpj());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar Companhia");
        }
    }

    public void delete() {
        try {
            PreparedStatement prep = DAO.createConnection().prepareStatement("DELETE FROM companhia WHERE id_companhia = ?;");
            prep.setInt(1, getId());
            prep.execute();
            prep.close();
        } catch (Exception e) {
            System.out.println("Erro ao deletar Companhia");
        }
    }

}
