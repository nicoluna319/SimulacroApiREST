package riwi.RiwiApp.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.RiwiApp.enums.Role;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class UserReq {
    
    @NotBlank(message = "El nombre de usuario es requerido")
    private String userName;

    @NotBlank(message = "La contraseña es requerida")
    private String password;

    @NotBlank(message = "El correo electrónico es requerido")
    private String email;

    @NotBlank(message = "El nombre completo es requerido")
    private String fullName;

    @NotNull(message = "El Role es requerido")
    private Role role;

}
    