package org.itstep.one_to_manny_uni;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "post")
public class Post {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @OneToMany(mappedBy = "comment", cascade = CascadeType.ALL)
    @JoinColumn(name="comment_id")
    private List<Comment> comments;
}
