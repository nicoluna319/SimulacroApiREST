package riwi.RiwiApp.domain.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "courses")
public class CoursesEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String courseName;
    @Column(nullable = false, length = 100)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "instructor_id",
        referencedColumnName = "id"
    )
    private UserEntity instructor;  

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "courses", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = false)

    private List<LessonsEntity> lessons;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "courses", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = false)

    private List<MessagesEntity> Messages;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "courses", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = false)

    private List<EnrollmentsEntity> enrollments;


}
