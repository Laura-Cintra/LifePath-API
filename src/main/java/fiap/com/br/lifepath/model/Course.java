package fiap.com.br.lifepath.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_course")
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_course")
    private Integer id;

    @Column(nullable = false, length = 150)
    private String title;

    @Column(nullable = false, length = 150)
    private String provider;

    @Column(nullable = false, length = 500)
    private String link;
}
