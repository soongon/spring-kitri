package kr.re.kitri.spring2023.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {
    private int id;
    private String title;
    private String body;
}
