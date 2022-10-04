package engtelecom.poo;

public class Pessoa {

    private static int totalPessoas = 0;

    private int id;
    private String nome;

    public Pessoa(String nome) {
        this.id = ++totalPessoas;
        this.nome = nome;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + "]";
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    

}
