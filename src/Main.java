public class Main {
    public static void main(String[] args) {
        Cliente alexandre = new Cliente();
        alexandre.setNome("Alexandre");

        Conta cc = new ContaCorrente(alexandre);
        cc.depositar(200);

        Conta poupanca = new ContaPoupanca(alexandre);
        poupanca.depositar(200);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
