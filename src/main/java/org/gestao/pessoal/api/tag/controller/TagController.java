package org.gestao.pessoal.api.tag.controller;

import lombok.RequiredArgsConstructor;
import org.gestao.pessoal.api.tag.domain.dto.TagRequest;
import org.gestao.pessoal.api.tag.domain.dto.TagResponse;
import org.gestao.pessoal.api.tag.service.SalvarTagService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tag")
@RequiredArgsConstructor
public class TagController {

    private final SalvarTagService salvarTagService;


    @PostMapping
    public ResponseEntity<TagResponse> salvarTag(@RequestBody TagRequest tagRequest) {
        TagResponse saved = salvarTagService.apply(tagRequest);
        return ResponseEntity.ok(saved);
    }

}
