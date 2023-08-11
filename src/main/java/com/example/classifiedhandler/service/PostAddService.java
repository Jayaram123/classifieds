package com.example.classifiedhandler.service;

import com.example.classifiedhandler.domain.entity.UserPost;
import com.example.classifiedhandler.domain.model.PostCreated;
import com.example.classifiedhandler.repository.PostAddRepository;
import org.springframework.stereotype.Service;

@Service
public class PostAddService {

    private final PostAddRepository postAddRepository;

    public PostAddService(PostAddRepository postAddRepository) {
        this.postAddRepository = postAddRepository;
    }



    public PostCreated createPost(UserPost userPost) {
        UserPost save = postAddRepository.save(userPost);

        PostCreated postCreated = new PostCreated();
        postCreated.setPostId(save.getPostId());
        postCreated.setPostingDateTime(save.getDatePosted());
        postCreated.setCategory("Some Category");
        return postCreated;

    }
}
