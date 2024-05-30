package riwi.RiwiApp.api.dto.request;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentsReq {
    
    @NotBlank(message = "El nombre del titulo es requerido")
    private String title;

    @NotBlank(message = "La descripción es requerida")
    private String description;

    @NotBlank(message = "La fecha es requerida")
    private Date date;

    @NotNull(message = "El ID de la lección es requerido")
    private Long lessons;

}
