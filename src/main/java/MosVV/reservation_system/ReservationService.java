package MosVV.reservation_system;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@Service
public class ReservationService {

    private  final Map<Long,Reservation> reservationMap=Map.of(
            1L, new Reservation(
                    1L,
                    100L,
                    40L,
                    LocalDate.now(),
                    LocalDate.now().plusDays(5),
                    ReservationStatus.APPROVED
            ),
            new Reservation(
                    2L,
                    102L,
                    42L,
                    LocalDate.now(),
                    LocalDate.now().plusDays(5),
                    ReservationStatus.APPROVED
            ),
            new Reservation(
                    3L,
                    103L,
                    43L,
                    LocalDate.now(),
                    LocalDate.now().plusDays(5),
                    ReservationStatus.APPROVED
            )
    );
    public Reservation getReservationByID(Long id){
        if(!reservationMap.containsKey(id)){
            throw new NoSuchElementException("Not found reservation by id = "+id);
        }
        return new Reservation(
                id,
                100L,
                40L,
                LocalDate.now(),
                LocalDate.now().plusDays(5),
                ReservationStatus.APPROVED
        );
    }

    public List<Reservation> findAllReservation() {
        return List.of(
                new Reservation(
                1L,
                100L,
                40L,
                LocalDate.now(),
                LocalDate.now().plusDays(5),
                ReservationStatus.APPROVED
                ),
                new Reservation(
                2L,
                100L,
                40L,
                LocalDate.now(),
                LocalDate.now().plusDays(5),
                ReservationStatus.APPROVED
                )

        );
    }
}
