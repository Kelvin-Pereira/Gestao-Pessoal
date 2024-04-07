package org.gestao.pessoal.api.tag.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TAG", schema = "GESTAO")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TAG")
    @SequenceGenerator(name = "SEQ_TAG", sequenceName = "SEQ_TAG", schema = "GESTAO", allocationSize = 1)
    @Column(name = "ID_TAG", nullable = false)
    private Long id;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @Column(name = "COR", nullable = false)
    private String cor;


}
