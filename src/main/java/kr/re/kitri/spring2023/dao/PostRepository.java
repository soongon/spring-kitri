package kr.re.kitri.spring2023.dao;

import kr.re.kitri.spring2023.model.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Mapper
public interface PostRepository {
    List<Post> selectAllPosts();
    Post selectPostById(String id);
    Post insertPost(Post post);
}
