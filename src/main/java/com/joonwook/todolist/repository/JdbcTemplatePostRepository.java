package com.joonwook.todolist.repository;

import com.joonwook.todolist.domain.PostForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcTemplatePostRepository implements PostRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcTemplatePostRepository(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int save(PostForm postForm) {
        System.out.println("content!!!!!!"+postForm.getContent());
        String sql = "insert into todo(content) values(?)";
        return jdbcTemplate.update(sql,postForm.getContent());
    }

    @Override
    public List<PostForm> findAll() {
        return jdbcTemplate.query("select * from todo", todoRowMapper());
    }

    private RowMapper<PostForm> todoRowMapper(){
        return new RowMapper<PostForm>(){
            @Override
            public PostForm mapRow(ResultSet rs, int rowNum) throws SQLException {
                PostForm postForm = new PostForm();
                postForm.setId(rs.getInt("id"));
                postForm.setContent(rs.getString("name"));
                return postForm;
            }
        };
    }
}
