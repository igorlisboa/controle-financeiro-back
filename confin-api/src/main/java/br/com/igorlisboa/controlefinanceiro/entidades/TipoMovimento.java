package br.com.igorlisboa.controlefinanceiro.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "TIPOMOVIMENTO")
@Getter @Setter
public class TipoMovimento implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "datacriacao")
    private Timestamp dataCriacao;

}
