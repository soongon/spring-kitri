package kr.re.kitri.spring2023.service;

import kr.re.kitri.spring2023.dao.PostRepository;
import kr.re.kitri.spring2023.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional // 이 클래스의 모든 메서드는 트랜잭션 처리를 해줘..
public class PostService {

    @Autowired
    private PostRepository postRepository;
    public List<Post> getAllPosts() {
        return postRepository.selectAllPosts();
    }

    public Post getPostById(int id) {
        // 레파지토리야 id 줄계 상세보기 조회해 줘..
        return postRepository.selectPostById(id);
    }

    public Post setPost(Post post) {
        postRepository.insertPost(post);
        return post;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED) // 트랜잭션을 지원하지 않는다.
    public Post modifyPost(Post post) {
        postRepository.updatePost(post);
        return post;
    }

    public void removePost(int id) {
        postRepository.deletePost(id);
    }
}
