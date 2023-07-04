package kr.re.kitri.spring2023.dao;

import kr.re.kitri.spring2023.model.Post;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {
    public String selectAllPosts() {
        // DB연동을해서 데이터를 가져옵니다.
        return "데이터....";

    }

    public Post selectPostById(String id) {
        // select * from post where postId = id;

        return new Post(1, "오늘은 좋은날", "스프링 좋아요");
    }
}
