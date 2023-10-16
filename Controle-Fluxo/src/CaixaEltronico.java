public class CaixaEltronico {
    public static void main(String[] args) {

        //Condicional Simples só usando IF.

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo)
            saldo -= valorSolicitado;

        System.out.println(saldo);
    }
}
