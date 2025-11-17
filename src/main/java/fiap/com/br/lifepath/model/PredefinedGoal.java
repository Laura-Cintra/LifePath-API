package fiap.com.br.lifepath.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_predefined_goal")
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PredefinedGoal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_predefined_goal")
    private Integer id;

    @Column(nullable = false, length = 200)
    private String title;
}
