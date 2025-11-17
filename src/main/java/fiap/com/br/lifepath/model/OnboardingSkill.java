package fiap.com.br.lifepath.model;

import fiap.com.br.lifepath.model.enums.Priority;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_onboarding_skill")
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnboardingSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_onboarding_skill")
    private Integer id;

    @Column(nullable = false, length = 20)
    private Priority importance;

    @ManyToOne
    @JoinColumn(name = "id_skill", nullable = false)
    private Skill skill;

    @ManyToOne
    @JoinColumn(name = "id_user_onboarding", nullable = false)
    private UserOnboarding userOnboarding;
}
