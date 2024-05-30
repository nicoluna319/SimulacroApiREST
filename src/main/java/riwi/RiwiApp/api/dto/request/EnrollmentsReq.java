package riwi.RiwiApp.api.dto.request;

import java.sql.Date;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentsReq {
    
    @NotNull(message = "El ID del usuario es requerido")
    private Long user;
    @NotNull(message = "El ID del curso es requerido")
    private Long courses;
    @NotNull(message = "La fecha es requerida")
    private Date date;
}
