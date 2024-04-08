package org.gestao.pessoal.api.tag.service;

import lombok.RequiredArgsConstructor;
import org.gestao.pessoal.api.tag.domain.dto.TagRequest;
import org.gestao.pessoal.api.tag.domain.dto.TagResponse;
import org.gestao.pessoal.api.tag.domain.entity.Tag;
import org.gestao.pessoal.api.tag.domain.mapper.TagMapper;
import org.gestao.pessoal.api.tag.repository.TagRepository;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class SalvarTagService implements Function<TagRequest, TagResponse> {


    private final TagRepository repository;

    @Override
    public TagResponse apply(TagRequest tagRequest) {

        Tag tag = TagMapper.INSTANCE.tagResponseToTag(tagRequest);

        Tag saved = repository.save(tag);

        return TagMapper.INSTANCE.tagToTagResponse(saved);
    }

}
