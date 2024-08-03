package com.ironhack.perfreviewproject.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Data
@Table(name = "processTraining")
public class ProcessTraining {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String processId;

    private String processName;

    private String instructor;

    private String completionDate;



}
