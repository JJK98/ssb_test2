package com.example.sbb_test2.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
    public Article getArticle(Integer id){
        Optional<Article> arti = articleRepository.findById(id);
        if(arti.isPresent()){
            return arti.get();
        } else{
            throw new SomethingIsStrange("Hmm..");
        }
    }

}
