package service;

public class Debito {

    /**
     * Recebe o valor a ser debitado e retorna o valor restante após realizar o debito;
     * @param valorDebito
     * @return
     */
    public Double debito(Double valorDebito){
        Double valorEmConta = 1000.0d;

        return valorEmConta - valorDebito;
    }

}
