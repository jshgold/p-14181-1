package com.back.domain.post.postComment.dto;

import com.back.domain.post.postComment.entity.PostComment;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record PostCommentDto(
        @NotNull int id,
        @NotNull LocalDateTime createDate,
        @NotNull LocalDateTime modifyDate,
        @NotNull int authorId,
        @NotNull String authorName,
        @NotNull int postId,
        @NotNull String content
) {
    public PostCommentDto(PostComment postComment) {
        this(
                postComment.getId(),
                postComment.getCreateDate(),
                postComment.getModifyDate(),
                postComment.getAuthor().getId(),
                postComment.getAuthor().getName(),
                postComment.getPost().getId(),
                postComment.getContent()
        );
    }
}