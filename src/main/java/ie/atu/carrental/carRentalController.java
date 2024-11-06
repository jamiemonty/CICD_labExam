package ie.atu.carrental;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    public List<carRental> newBooking(@Valid @RequestBody carRental car_rental)
    {
        return newRental.addBooking(car_rental);
    }

    @GetMapping("/rentals/{rentalCode")
    public List<carRental> getRental()
    {
        return myList;
    }

}
