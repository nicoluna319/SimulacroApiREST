package riwi.RiwiApp.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessagesResp {
    
    private Long id;
    private Long sender;
    private Long receiver;
    private Long courses;
    private String content;
    private String date;

}
