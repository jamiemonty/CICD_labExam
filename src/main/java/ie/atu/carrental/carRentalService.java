package ie.atu.carrental;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class carRentalService {
    private List<carRental> myList = new ArrayList<>();

    public List<carRental> addBooking(carRental car_rental){
        myList.add(car_rental);
        return myList;
    }

    public List<carRental> deleteBooking(String rentalCode) {

        for (int count = 0; count < myList.size(); count++)
        {
            if(myList.get(count).getRentalCode() == rentalCode)
            {
                myList.remove(count);
            }
        }
        return myList;
    }

    public List<carRental> updateBooking(carRental car_rental, String rentalCode){
        for(carRental r : myList)
        {
            r.setCarModel(car_rental.getCarModel());
            r.setRentalCode(car_rental.getRentalCode());
            r.setDailyRate(car_rental.getDailyRate());
            r.setRenterEmail(car_rental.getRenterEmail());
            r.setRentalStartDate(car_rental.getRentalStartDate());
            r.setRentalEndDate(car_rental.getRentalEndDate());
            r.setRenterName(car_rental.getRenterName());

            return myList;
        }
        throw new NoSuchElementException("Car rental with rental code " + rentalCode + " not found." )
    }
}
