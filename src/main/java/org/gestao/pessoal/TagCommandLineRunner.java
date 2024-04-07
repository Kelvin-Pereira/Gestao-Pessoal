package org.gestao.pessoal;

import lombok.RequiredArgsConstructor;
import org.gestao.pessoal.api.tag.domain.entity.Tag;
import org.gestao.pessoal.api.tag.repository.TagRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TagCommandLineRunner implements CommandLineRunner {

    private final TagRepository tagRepository;

    @Override
    public void run(String... args) throws Exception {

        Tag tag = new Tag();
        tag.setDescricao("Alimentação");
        tag.setCor("#FF0000");

        Tag tag2 = new Tag();
        tag2.setDescricao("Transporte");
        tag2.setCor("#00FF00");

        Tag tag3 = new Tag();
        tag3.setDescricao("Moradia");
        tag3.setCor("#0000FF");

        tagRepository.save(tag);
        tagRepository.save(tag2);
        tagRepository.save(tag3);

    }
}
