package kr.re.kitri.spring2023.controller;

import kr.re.kitri.spring2023.model.Post;
import kr.re.kitri.spring2023.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/posts")
    public Post registPost(@RequestBody Post post) {
        return postService.setPost(post);
    }

    @GetMapping("/posts")
    public List<Post> viewAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/posts/{id}")
    public Post viewPostById(@PathVariable int id) {
        // id 값으로 상세보기를 수행해줘..
        return postService.getPostById(id);
    }
}
