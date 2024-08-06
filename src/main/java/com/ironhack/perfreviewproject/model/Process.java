package com.ironhack.perfreviewproject.model;

import jakarta.persistence.*;
import lombok.*;



@Getter
@Setter
@Entity
@NoArgsConstructor
@Data
@Table(name = "processes")
public class Process {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long processId;

    private String processName;

    private String instructorName;

    private String completionDate;

    public Process(String processName, String instructorName, String completionDate) {
        this.processName = processName;
        this.instructorName = instructorName;
        this.completionDate = completionDate;
    }


//    @ManyToMany(mappedBy = "processes", fetch = LAZY)
//    @JsonIgnore
//    private Collection<Employee> employees = new ArrayList<>();


}
