package postapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Post {
    private int id;
    private String title;
    private String content;
    private List<User> data;
    private String created;
    private String updated;

}
