package com.example.hotel.repo;

import com.example.hotel.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByRoomId(Long roomId);

    List<Booking> findByBookingConfirmationCode(String confirmationsCode);

    List<Booking> findByUserId(Long userId);


}
