package fiap.com.br.lifepath.model;

import fiap.com.br.lifepath.model.enums.YesNo;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_step")
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Step {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_step")
    private Integer id;

    @Column(nullable = false, length = 250)
    private String title;

    @Column(nullable = false, length = 400)
    private String description;

    private Integer estimatedWeeks;

    @Enumerated(EnumType.STRING)
    @Column(name = "is_completed")
    private YesNo isCompleted;

    @ManyToOne
    @JoinColumn(name = "id_user_onboarding", nullable = false)
    private UserOnboarding userOnboarding;
}
