package kr.re.kitri.spring2023.controller;

import kr.re.kitri.spring2023.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public String viewAllPosts() {
        return postService.getAllPosts();
    }
}
