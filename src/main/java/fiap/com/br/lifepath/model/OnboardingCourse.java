package fiap.com.br.lifepath.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_onboarding_course")
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnboardingCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_onboarding_course")
    private Integer id;

    @Column(nullable = false)
    private Double relevanceScore;

    @ManyToOne
    @JoinColumn(name = "id_course", nullable = false)
    private Course course;

    @ManyToOne
    @JoinColumn(name = "id_user_onboarding", nullable = false)
    private UserOnboarding userOnboarding;
}
