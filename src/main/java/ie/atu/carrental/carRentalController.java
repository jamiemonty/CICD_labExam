package ie.atu.carrental;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class carRentalController {

    private final carRental newRental;

    @Autowired
    public carRentalController(carRental newRental)
    {
        this.newRental = newRental;
    }


    @PostMapping("/rentals")
    public List<carRental> addBooking(@Valid @RequestBody carRental car_rental)
    {
        return newRental.addBooking(car_rental);
    }

    @GetMapping("/rentals/{rentalCode}")
    public List<carRental> getRental()
    {
        return myList;
    }

    @PutMapping("/rentals/{rentalCode}")
    public List<carRental> updateBooking(@Valid @RequestBody carRental car_rental, @PathVariable String rentalCode)
    {
        return newRental.updateBooking(car_rental, rentalCode);
    }

    @DeleteMapping("/rentals/{rentalCode}")
    public List<carRental>  deleteBooking(@Valid @PathVariable String rentalCode)
    {
        return newRental.deleteBooking(rentalCode);
    }
}
