import entities.Cliente;
import entities.Funcionario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente novoCliente = new Cliente("João Alberto", "123.123.123-12", 22, 8274001530L, "joao@gmail");
        Funcionario novoFuncionario = new Funcionario("Rafael Souza", "555.555.444.33", 22, 5000.00, "Dev-Junior");
        System.out.println(novoCliente);
        System.out.println(novoFuncionario);

    }
}