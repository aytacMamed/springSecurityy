package com.changeside.springsecuritywithnewchanges.dto;

import java.util.List;

public record UserPageResponse(
        List<UserRequestResponse> users,
        long totalElements,
        int totalPages,
        boolean hasNextPage
) {
}
