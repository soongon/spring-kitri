package kr.re.kitri.spring2023.service;

import kr.re.kitri.spring2023.dao.PostRepository;
import kr.re.kitri.spring2023.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    public String getAllPosts() {
        return postRepository.selectAllPosts();
    }

    public Post getPostById(String id) {
        // 레파지토리야 id 줄계 상세보기 조회해 줘..
        return postRepository.selectPostById(id);
    }
}
