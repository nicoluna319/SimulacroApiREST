package riwi.RiwiApp.api.dto.response;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class AssignmentsResp {
    
    private String title;
    private String description;
    private Date date;
    private Long lessons;


}
