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
public class MessagesReq {
    
    @NotNull(message = "El ID del sender es requerido")
    private Long sender;

    @NotNull(message = "El ID del receiver es requerido")
    private Long receiver;

    @NotNull(message = "El ID del curso es requerido")
    private Long courses;

    @NotBlank(message = "El contenido es requerido")
    private String content;

    @NotNull(message = "La fecha es requerida")
    private Date date;
}
