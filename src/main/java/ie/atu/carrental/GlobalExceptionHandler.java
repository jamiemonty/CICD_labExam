package ie.atu.carrental;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> showErrors(MethodArgumentNotValidException ex)
    {
        Map<String, String> errorList = new HashMap<>();
        for(FieldError error : ex.getFieldErrors())
        {
            String err_name = error.getField();
            String err_message = error.getDefaultMessage();
            errorList.put("timestamp: ", String.valueOf(LocalDateTime.now()));
            errorList.put(err_name, err_message);
        }
        return ResponseEntity.status(400).body(errorList);
    }


}
