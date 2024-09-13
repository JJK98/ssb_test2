package com.example.sbb_test2;

import com.example.sbb_test2.article.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbbTest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SbbTest2Application.class, args);
	}

	@Autowired
	private ArticleRepository articleRepository;


}
