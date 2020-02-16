package br.com.igorlisboa.controlefinanceiro.service;

import br.com.igorlisboa.controlefinanceiro.entidades.CategoriaDescricao;
import br.com.igorlisboa.controlefinanceiro.entidades.MovimentoCaixa;
import br.com.igorlisboa.controlefinanceiro.entidades.TipoMovimento;

import java.sql.Timestamp;

public class Inicio {

    public static void main(String[] args){

        System.out.println("===========================================");
        System.out.println("PASSO 1");
        System.out.println("===========================================");
        MovimentoCaixa mov = new MovimentoCaixa();
        TipoMovimento tipoMov = new TipoMovimento();
        CategoriaDescricao catDesc = new CategoriaDescricao();

        tipoMov.setDataCriacao(new Timestamp(System.currentTimeMillis()));
        tipoMov.setDescricao("Primeiro registro");
//        tipoMov.setId(1);

        catDesc.setDescricao("Primeira descricao");
        catDesc.setTipoMovimento(tipoMov);
//        catDesc.setId(1);

        mov.setDataHoraCadastro(new Timestamp(System.currentTimeMillis()));
        mov.setDataMovimento(new Timestamp(System.currentTimeMillis()));
        mov.setDescricao("Primeiro registro");
        mov.setDestinoRecurso("gasto");
        mov.setObservacaoMovimento("Observacao");
        mov.setOrigemRecurso("carteira");
        mov.setTipoMovimento(1);
        mov.setCategoriaDescricao(1);
//        mov.setId(1);
        System.out.println("===========================================");
        System.out.println("PASSO 2");
        System.out.println("===========================================");
        MovimentoService service = new MovimentoService();
        service.gravaMovimento(mov);
        System.out.println("===========================================");
        System.out.println("PASSO 111");
        System.out.println("===========================================");


//
//        Debito debitador = new Debito();
//
//        Double resultado = debitador.inserirDebito(50d);
//
//        System.out.println("Após o debito, o saldo total é: "+ resultado);

    }

}
