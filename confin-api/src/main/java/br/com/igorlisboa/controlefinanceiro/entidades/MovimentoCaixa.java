package br.com.igorlisboa.controlefinanceiro.entidades;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "MOVIMENTOCAIXA")
public class MovimentoCaixa implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "tipomovimentacao", nullable = false)
    private TipoMovimento tipoMovimento;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "datahoracadastro", nullable = false)
    private Timestamp dataHoraCadastro;

    @Column(name = "datamovimento", nullable = false)
    private Timestamp dataMovimento;

    @Column(name = "origemrecurso")
    private String origemRecurso;

    @Column(name = "destinorecurso")
    private String destinoRecurso;

    @Column(name = "observacaomovimento")
    private String observacaoMovimento;



}
