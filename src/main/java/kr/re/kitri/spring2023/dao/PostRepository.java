package kr.re.kitri.spring2023.dao;

import kr.re.kitri.spring2023.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {
    public List<Post> selectAllPosts() {
        // DB 연동을해서 데이터를 가져옵니다.
        // select * from post;
        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1, "오늘은 좋은날1", "스프링 좋아요1"));
        posts.add(new Post(2, "오늘은 좋은날2", "스프링 좋아요2"));
        posts.add(new Post(3, "오늘은 좋은날3", "스프링 좋아요3"));
        posts.add(new Post(4, "오늘은 좋은날4", "스프링 좋아요4"));
        posts.add(new Post(5, "오늘은 좋은날5", "스프링 좋아요5"));
        return posts;

    }

    public Post selectPostById(String id) {
        // select * from post where postId = id;

        return new Post(1, "오늘은 좋은날", "스프링 좋아요");
    }

    public Post insertPost(Post post) {
        // db에 insert..
        // insert into post values (post.getId(), ....)
        return post;
    }
}
