package kr.re.kitri.spring2023.controller;

import kr.re.kitri.spring2023.model.Post;
import kr.re.kitri.spring2023.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public String viewAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/posts/{id}")
    public Post viewPostById(@PathVariable String id) {
        // id 값으로 상세보기를 수행해줘..
        return postService.getPostById(id);
    }
}
