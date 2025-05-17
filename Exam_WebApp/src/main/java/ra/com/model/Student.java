package ra.com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @Column(columnDefinition = "char(5)")
    private String studentId;

    @Column(columnDefinition = "varchar(200)", nullable = false)
    private String studentName;

    @Column(nullable = false, unique = true, columnDefinition = "TEXT")
    private String studentEmail;

    @Column(nullable = false, unique = true, columnDefinition = "varchar(15)")
    private String studentPhone;

    @Column(nullable = false)
    private Boolean studentSex;

    @Column(nullable = false)
    private LocalDate studentBod;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @Column(columnDefinition = "TEXT")
    private String studentAvatar;

    @Column(nullable = false)
    private Boolean studentStatus;
}
