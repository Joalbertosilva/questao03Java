package entities;

public class Funcionario {
    private String nome;
    private String cpf;
    private int idade;
    private double salario;
    private String cargo;

    public Funcionario(String nome, String cpf, int idade, double salario, String cargo){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
    }
    public Funcionario(){

    }

    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public String toString() {
        return "\nTabela funcionários: " + "\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nIdade: " + getIdade() + "\nSalario: " + getSalario() + "\nCargo: " + getCargo();
    }
}
