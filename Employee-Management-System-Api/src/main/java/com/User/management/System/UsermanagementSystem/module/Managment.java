package com.User.management.System.UsermanagementSystem.module;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@AllArgsConstructor
public class Managment {

    @NotNull(message = "UserId is required")
    private String UserId;

    @NotBlank(message = "Username is required")
    private String userName;

    @NotNull(message = "Date of birth is required")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date of birth must be in the format yyyy-MM-dd")
    private LocalDate dob;

    @Email
    @NotEmpty
    private String email;

    @Size(min = 10 , max = 12)
    @Pattern(regexp = "\\d{12}")
    private String phoneNumber;

    @NotNull(message = "Date is required")
    private LocalDate date;

    @NotNull(message = "Time is required")
    private LocalTime time;




    public void setStatus(boolean status) {
    }
}
