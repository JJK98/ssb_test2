package com.example.sbb_test2.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getList(){
        return this.articleRepository.findAll();
    }
    public void create(String title, String content){
        Article art = new Article();
        art.setTitle(title);
        art.setContent(content);
        art.setCreateDate(LocalDateTime.now());
        this.articleRepository.save(art);
    }


}
