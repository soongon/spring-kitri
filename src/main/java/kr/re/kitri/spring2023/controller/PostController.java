package kr.re.kitri.spring2023.controller;

import kr.re.kitri.spring2023.model.Post;
import kr.re.kitri.spring2023.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @PutMapping("/posts")
    public Post modifyPost(@RequestBody Post post) {
        return postService.modifyPost(post);
    }

    @DeleteMapping("/posts/{id}")
    public void removePost(@PathVariable int id) {
        postService.removePost(id);
    }

    @PostMapping("/posts")
    public Post registPost(@RequestBody Post post) {
        return postService.setPost(post);
    }

    @GetMapping("/posts")
    public List<Post> viewAllPosts() {
        log.debug("전체보기 요청이 들어왔습니다.");
        return postService.getAllPosts();
    }

    @GetMapping("/posts/{id}")
    public Post viewPostById(@PathVariable int id) {
        // id 값으로 상세보기를 수행해줘..
        return postService.getPostById(id);
    }
}
