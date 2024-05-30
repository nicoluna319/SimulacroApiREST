package riwi.RiwiApp.api.dto.request;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionsReq {
    
    private String content;

    private Date date;

    private Long user;

    private Long assignments;
}
