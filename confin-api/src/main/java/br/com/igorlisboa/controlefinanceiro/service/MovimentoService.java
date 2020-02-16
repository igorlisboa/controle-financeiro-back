package br.com.igorlisboa.controlefinanceiro.service;

import br.com.igorlisboa.controlefinanceiro.dao.MovimentoCaixaDao;
import br.com.igorlisboa.controlefinanceiro.entidades.MovimentoCaixa;

import java.util.List;
import java.util.Optional;

public class MovimentoService {

    private MovimentoCaixaDao dao = new MovimentoCaixaDao();


    public void gravaMovimento(MovimentoCaixa movimentoCaixa){
        System.out.println("===========================================");
        System.out.println("PASSO 3");
        System.out.println("===========================================");
        dao.save(movimentoCaixa);
    }
    public List<MovimentoCaixa> buscaMovimentos(){
        return dao.getAll();
    }

    public Optional<MovimentoCaixa> buscaMovimentoPorId(Integer id){
        return dao.get(id);
    }

    public MovimentoCaixa atualizaMovimento(MovimentoCaixa movimentoCaixa){
        return dao.update(movimentoCaixa);
    }
    public void excluirMovimento(MovimentoCaixa movimentoCaixa){
        dao.delete(movimentoCaixa);
    }
}
