package entities;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private long numero;
    private String email;

    public Cliente(String nome, String cpf, int idade, long numero, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.numero = numero;
        this.email = email;
    }
    public Cliente(){}

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public double getNumero() {
        return numero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nTabela Cliente: " + "\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nIdade: " + getIdade() + "\nNumero: " + getNumero() + "\nEmail: " + getEmail();
    }
}
