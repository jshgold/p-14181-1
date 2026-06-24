package com.back.domain.post.post.dto;

import com.back.domain.post.post.entity.Post;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record PostWithContentDto(
        @NotNull int id,
        @NotNull LocalDateTime createDate,
        @NotNull LocalDateTime modifyDate,
        @NotNull int authorId,
        @NotNull String authorName,
        @NotNull String title,
        @NotNull String content
) {
    public PostWithContentDto(Post post) {
        this(
                post.getId(),
                post.getCreateDate(),
                post.getModifyDate(),
                post.getAuthor().getId(),
                post.getAuthor().getName(),
                post.getTitle(),
                post.getContent()
        );
    }
}