package org.example.yoonoh.springboot.service.posts;

import lombok.RequiredArgsConstructor;
import org.example.yoonoh.springboot.domain.posts.Posts;
import org.example.yoonoh.springboot.domain.posts.PostsRepository;
import org.example.yoonoh.springboot.web.dto.PostsResponseDto;
import org.example.yoonoh.springboot.web.dto.PostsSaveRequestDto;
import org.example.yoonoh.springboot.web.dto.PostsUpdateRequestDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId(); // Entity와 id를 저장
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id="+id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id="+id));

        return new PostsResponseDto(entity);
    }
}
