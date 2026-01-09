package com.example.room_rental;

import com.example.room_rental.entity.Room;
import com.example.room_rental.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final RoomService roomService;

    @Override
    public void run(String... args) throws Exception {
        // Chỉ thêm dữ liệu nếu chưa có
        if (roomService.getAllRooms().isEmpty()) {
            roomService.saveRoom(Room.builder()
                    .roomNumber("P101")
                    .area(25.0)
                    .basePrice(3000000L)
                    .description("Phòng view đẹp, đầy đủ tiện nghi")
                    .rented(false)
                    .build());

            roomService.saveRoom(Room.builder()
                    .roomNumber("P102")
                    .area(30.0)
                    .basePrice(3500000L)
                    .description("Phòng góc, có ban công")
                    .rented(true)
                    .build());

            roomService.saveRoom(Room.builder()
                    .roomNumber("P203")
                    .area(20.0)
                    .basePrice(2500000L)
                    .description("Phòng nhỏ gọn, phù hợp sinh viên")
                    .rented(false)
                    .build());

            System.out.println("Đã thêm 3 phòng mẫu!");
        }
    }
}