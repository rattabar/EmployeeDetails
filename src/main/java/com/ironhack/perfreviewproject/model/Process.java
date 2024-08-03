package com.ironhack.perfreviewproject.model;

import jakarta.persistence.*;
import lombok.*;


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

//    @ManyToMany(mappedBy = "employees", fetch = FetchType.LAZY)
//    private Set<ProcessTraining> processes = new HashSet<>();
}
