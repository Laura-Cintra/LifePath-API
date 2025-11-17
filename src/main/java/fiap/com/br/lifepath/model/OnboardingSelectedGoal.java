package fiap.com.br.lifepath.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_onboarding_selected_goal")
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnboardingSelectedGoal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_onboarding_selected_goal")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_user_onboarding", nullable = false)
    private UserOnboarding userOnboarding;

    @ManyToOne
    @JoinColumn(name = "id_predefined_goal", nullable = false)
    private PredefinedGoal predefinedGoal;
}
