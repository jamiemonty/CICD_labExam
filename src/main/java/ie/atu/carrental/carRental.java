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
    @Min(value = 06-11-2024)
    private Date rentalStartDate;
    @Min(value = 07-11-2024)
    private Date rentalEndDate;
    @Min(value = 0)
    private DecimalFormat dailyRate;

}
