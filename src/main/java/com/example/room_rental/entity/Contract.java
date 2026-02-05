package com.example.room_rental.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "contracts")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tenant_id", nullable = false)
    private Customer tenant;

    @OneToOne
    @JoinColumn(name = "room_id", nullable = false, unique = true)
    private Room room;

    private LocalDate startDate;

    private LocalDate endDate; // null nếu thuê dài hạn

    private Long deposit; // tiền cọc

    private Long monthlyRent; // tiền thuê thực tế mỗi tháng

    private boolean active = true; // đang hiệu lực hay đã chấm dứt
}