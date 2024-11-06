package ie.atu.carrental;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class carRental {

    @Pattern(regexp = "RENT-XXXX", message = "Invalid rental code format")
    private String rentalCode;
    @Size(max = 50, message = "Maximum of 50 characters allowed.")
    private String carModel;
    @Size(max = 100, message = "Maximum of 100 characters allowed.")
    private String renterName;
    @Email(message = "Invalid email format.")
    private String renterEmail;
    @FutureOrPresent(message = "The start date has to be in the present or future.")
    private Date rentalStartDate;
    @Future(message = "The end date must be after the start date.")
    private Date rentalEndDate;
    @Positive(message = "Daily rate has to be greater than 0")
    private DecimalFormat dailyRate;

}
