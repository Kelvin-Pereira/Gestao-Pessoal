package org.gestao.pessoal.api.tag.domain.mapper;

import org.gestao.pessoal.api.tag.domain.dto.TagRequest;
import org.gestao.pessoal.api.tag.domain.dto.TagResponse;
import org.gestao.pessoal.api.tag.domain.entity.Tag;
import org.mapstruct.factory.Mappers;

public interface TagMapper {

    TagMapper INSTANCE = Mappers.getMapper(TagMapper.class);

    Tag tagResponseToTag(TagRequest tagRequest);

    TagResponse tagToTagResponse(Tag tag);


}
