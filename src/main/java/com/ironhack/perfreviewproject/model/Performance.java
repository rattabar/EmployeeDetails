package com.ironhack.perfreviewproject.model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Data
@Table(name = "performance")
public class Performance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String perfId;

    //packages per hour
    private int pph;
    //errors
    private int missort;
    //Sort duration
    private int duration;

}
