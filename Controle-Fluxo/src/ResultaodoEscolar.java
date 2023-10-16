public class ResultaodoEscolar {
    public static void main(String[] args) {
       
        //Condicional Comprosta e Encadeada usando IF, ELSE IF e ELSE.

        int nota = 6;
         
        if(nota >= 7)
            System.out.println("Aprovado");

        else if(nota >= 5 && nota < 7)
            System.out.println("Prova Recuperação");

        else
            System.out.println("Reprovado");

    }
}
