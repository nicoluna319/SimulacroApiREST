package riwi.RiwiApp.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentsResp {
    
    private Long id;
    
    private Long user;
    
    private Long courses;
    
    private String date;
}
