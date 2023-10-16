public class ResultadoEscola {
    public static void main(String[] args) {

        //Condição Ternária
        
        int nota = 7;
        int nota1 = 6;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        String resultado1 = nota1 >= 7 ? "Aprovado" : nota1 >=5 && nota1 < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado1);


    }
}
