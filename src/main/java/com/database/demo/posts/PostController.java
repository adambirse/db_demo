package com.database.demo.posts;

import com.database.demo.comments.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @GetMapping("/posts")
    public void testData() {

        Post p = new Post();
        p.setContent("content " + System.currentTimeMillis());
        p.setDescription("description" + System.currentTimeMillis());
        p.setTitle("title" + System.currentTimeMillis());

        postRepository.save(p);

    }
}
