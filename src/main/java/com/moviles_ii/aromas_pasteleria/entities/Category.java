package com.moviles_ii.aromas_pasteleria.entities;

import com.moviles_ii.aromas_pasteleria.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", length = 50, nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

    @PrePersist
    void setPrePersist() {
        this.status = Status.ACTIVE;
    }
}
