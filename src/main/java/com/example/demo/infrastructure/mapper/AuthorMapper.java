package com.example.demo.infrastructure.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuthorMapper {
    AuthorEntity getAuthorById(@Param("id") int id);
    void registAuthor(@Param("name") String name);
}
