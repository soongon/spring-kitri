package kr.re.kitri.spring2023.service;

import kr.re.kitri.spring2023.dao.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    public String getAllPosts() {
        return postRepository.selectAllPosts();
    }
}
