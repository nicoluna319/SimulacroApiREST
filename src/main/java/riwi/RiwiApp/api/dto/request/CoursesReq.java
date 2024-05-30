package riwi.RiwiApp.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CoursesReq {

    @NotBlank(message = "El nombre del curso es requerido")
    private String courseName;
    
    @NotBlank(message = "La descripción del curso es requerida")
    @Size(max = 1000, message = "La descripción del curso no puede tener más de 1000 caracteres")
    private String courseDescription;

    @NotNull(message = "El ID del instructor es requerido")
    private Long instructorId;
    
}
