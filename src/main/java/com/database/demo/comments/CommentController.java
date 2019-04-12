package com.database.demo.comments;

import com.database.demo.posts.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    CommentRepository commentRepository;

    @GetMapping("/comments")
    public void testData() {

        postRepository.findAll().forEach(p ->
        {
            Comment c = new Comment();
            c.setText("A comment: " + System.currentTimeMillis());
            c.setPost(p);
            commentRepository.save(c);
            System.out.println(p);
        });

    }
}
