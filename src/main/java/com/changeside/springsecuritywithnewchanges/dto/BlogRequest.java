package com.changeside.springsecuritywithnewchanges.dto;

public record BlogRequest(
        String header,

        String content,

        UserBlogRequest user
) {
}