public class ExemploForArray {

    public static void main (String [] args) {
    
        //em arrays o indice inicia em ZERO 
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS" };

    for (in x=0; x < alunos.length; x++) {

        System.out.pritln(""O aluno no indice x=" + x + " é " + alunos [x] );

        for(String aluno : alunos){
        System.out.pritln ("Nome do aluno é: " + aluno);
        }
        
    }
}

}