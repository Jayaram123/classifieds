package com.example.classifiedhandler.repository;

import com.example.classifiedhandler.domain.entity.UserPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PostAddRepository extends JpaRepository<UserPost,String> {
}
