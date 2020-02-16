package br.com.igorlisboa.controlefinanceiro.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CATEGORIADESCRICAO")
public class CategoriaDescricao implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "tipomovimento")
    private TipoMovimento tipoMovimento;

}
