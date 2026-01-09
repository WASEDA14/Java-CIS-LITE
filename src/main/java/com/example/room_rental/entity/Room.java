package com.example.room_rental.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rooms")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String roomNumber; // Ví dụ: P101, 201

    private Double area; // diện tích m²

    private Long basePrice; // tiền phòng cơ bản (VND/tháng)

    private String description;

    private boolean rented = false; // mặc định trống
}