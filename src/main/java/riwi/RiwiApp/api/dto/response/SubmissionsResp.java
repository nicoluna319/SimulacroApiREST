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

public class SubmissionsResp {
    

    private Long id;
    
    private String content;

    private Date date;

    private Long user;

    private Long assignments;

}
