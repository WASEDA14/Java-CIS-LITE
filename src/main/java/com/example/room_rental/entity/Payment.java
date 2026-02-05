package com.example.room_rental.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "bills")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "contract_id", nullable = false)
    private Contract contract;

    private int month;
    private int year;

    private Double electricityStart;
    private Double electricityEnd;
    private Double waterStart;
    private Double waterEnd;

    private Long totalAmount;

    private boolean paid = false;

    private LocalDate paidDate;
}