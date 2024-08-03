package com.ironhack.perfreviewproject.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "performance")
public class Performance {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String perfId;

    //packages per hour
    private int pph;
    //errors
    private int missort;
    //Sort duration
    private int duration;

    public String getPerfId() {
        return perfId;
    }

    public void setPerfId(String perfId) {
        this.perfId = perfId;
    }

    public int getPph() {
        return pph;
    }

    public void setPph(int pph) {
        this.pph = pph;
    }

    public int getMissort() {
        return missort;
    }

    public void setMissort(int missort) {
        this.missort = missort;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
