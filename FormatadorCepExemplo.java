public class FormatadorCepExemplo {
    public static void main(String[] args) {
        String cepFormatado = FormatarCep("23765064");   
        System.out.println(cepFormatado);
    }
    private static String FormatarCep(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'FormatarCep'");
    }
    static String formatarcep(String cep) throws CepInvalidoException{
        if (cep.lenght() !=8)
        throw new CepInvalidoException ();

        //simulando um cep formatado 
        return "23.765-064";

    }
}
