package org.gestao.pessoal.api.tag.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TagResponse {

    private Long id;
    private String descricao;
    private String cor;

}
