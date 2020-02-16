package br.com.igorlisboa.controlefinanceiro.entidades;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "MOVIMENTOCAIXA")
public class MovimentoCaixa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "tipomovimentacao", nullable = false)
    private Integer tipoMovimento;

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

    @Column(name = "categoriaDescricao")
    private Integer categoriaDescricao;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTipoMovimento() {
        return tipoMovimento;
    }

    public Integer getCategoriaDescricao() {
        return categoriaDescricao;
    }

    public void setCategoriaDescricao(Integer categoriaDescricao) {
        this.categoriaDescricao = categoriaDescricao;
    }

    public void setTipoMovimento(Integer tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Timestamp getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(Timestamp dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public Timestamp getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Timestamp dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public String getOrigemRecurso() {
        return origemRecurso;
    }

    public void setOrigemRecurso(String origemRecurso) {
        this.origemRecurso = origemRecurso;
    }

    public String getDestinoRecurso() {
        return destinoRecurso;
    }

    public void setDestinoRecurso(String destinoRecurso) {
        this.destinoRecurso = destinoRecurso;
    }

    public String getObservacaoMovimento() {
        return observacaoMovimento;
    }

    public void setObservacaoMovimento(String observacaoMovimento) {
        this.observacaoMovimento = observacaoMovimento;
    }
}
