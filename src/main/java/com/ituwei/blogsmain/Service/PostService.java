package com.ituwei.blogsmain.Service;

import com.ituwei.blogsmain.payload.PostDto;
import com.ituwei.blogsmain.payload.PostResponse;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
}
