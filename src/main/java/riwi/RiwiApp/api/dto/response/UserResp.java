package riwi.RiwiApp.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.RiwiApp.utils.enums.Role;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class UserResp {
    

    private Long id;
    
    private String userName;

    private String email;

    private String fullName;

    private Role role;


}
