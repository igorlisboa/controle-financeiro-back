package service;

public class Inicio {

    public static void main(String[] args){

        Debito debitador = new Debito();

        Double resultado = debitador.debito(50d);

        System.out.println("Após o debito, o saldo total é: "+ resultado);

    }

}
