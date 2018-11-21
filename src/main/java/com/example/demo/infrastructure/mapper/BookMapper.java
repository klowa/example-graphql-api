package com.example.demo.infrastructure.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookMapper {
    List<BookEntity> getBooksByAuthorId(@Param("authorId") int authorId);

    void registBook(@Param("authorId") int authorId, @Param("name") String name);
}
