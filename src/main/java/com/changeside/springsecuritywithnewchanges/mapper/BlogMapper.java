package com.changeside.springsecuritywithnewchanges.mapper;

import com.changeside.springsecuritywithnewchanges.dto.BlogRequest;
import com.changeside.springsecuritywithnewchanges.entity.Blog;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BlogMapper {

    Blog blogRequestToEntity(BlogRequest request);

}
