package com.joonwook.todolist;

import com.joonwook.todolist.repository.JdbcTemplatePostRepository;
import com.joonwook.todolist.repository.PostRepository;
import com.joonwook.todolist.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource=dataSource;
    }

    @Bean
    public PostService postService(){
        return new PostService(postRepository());
    }

    @Bean
    public PostRepository postRepository(){
        return new JdbcTemplatePostRepository(dataSource);
    }
}
