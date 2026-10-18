package com.example.doctorservice.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorDetailResponseDTO {

    private Long id;
    private String name;
    private String specialization;
    private Integer experienceYears;
    private String email;
    private Boolean status;
}
