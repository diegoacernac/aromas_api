package com.moviles_ii.aromas_pasteleria.entities;

import com.moviles_ii.aromas_pasteleria.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "description", length = 150, nullable = false)
    private String description;

    @Column(name = "stock", nullable = false)
    private int stock;

    @Column(name = "batch", length = 10, nullable = false)
    private String batch;

    @Column(name = "purchasePrice", nullable = false)
    private double purchasePrice;

    @Column(name = "salePrice", nullable = false)
    private double salePrice;

    @Column(name = "dueDate", nullable = false)
    private Date dueDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;

    @CreationTimestamp
    @Column(name = "registerDate", updatable = false, nullable = false)
    private LocalDateTime registerDate;

    @Column(name = "registerUser", length = 50, nullable = false)
    private String registerUser;

   @UpdateTimestamp
   @Column(name = "updateDate")
   private LocalDateTime updateDate;

    @Column(name = "updateUser", length = 50)
    private String updateUser;

    @PrePersist
    void setPrePersist() {
        this.status = Status.ACTIVE;
    }
}
