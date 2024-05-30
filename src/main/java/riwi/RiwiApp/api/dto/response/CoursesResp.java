package riwi.RiwiApp.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CoursesResp {
    
    private String courseName;

    private String courseDescription;

    private Long instructorId;

}
