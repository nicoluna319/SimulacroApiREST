package riwi.RiwiApp.api.dto.request;

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

public class LessonsReq {
    
    @NotBlank(message = "El titulo es requerido")
    private String title;

    @NotBlank(message = "El contenido es requerido")
    private String content;

    @NotNull(message = "El ID del curso es requerido")
    private Long courses;


}
