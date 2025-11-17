package fiap.com.br.lifepath.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_insights")
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Insights {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_insights")
    private Integer id;

    @Column(nullable = false, length = 450)
    private String message;

    @Column(nullable = false, length = 10)
    private String locale;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime created = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "id_user_onboarding", nullable = false)
    private UserOnboarding userOnboarding;
}
