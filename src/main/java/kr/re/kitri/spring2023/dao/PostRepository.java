package kr.re.kitri.spring2023.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {
    public String selectAllPosts() {
        // DB연동을해서 데이터를 가져옵니다.
        return "데이터....";

    }

    public String selectPostById(String id) {
        // select * from post where postId = id;
        return "{" +
                "  \"postId\": " + id + "," +
                "  \"title\": \"오늘은 좋은날\"" + "," +
                "  \"body\": \"스프링은 재밌고 성능이 좋습니다.\"" + "," +
                "}";
    }
}
