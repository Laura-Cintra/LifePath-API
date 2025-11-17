package fiap.com.br.lifepath.model;

import fiap.com.br.lifepath.model.enums.CategorySkill;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_skill")
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_skill")
    private Integer id;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(length = 100)
    private CategorySkill category;
}
