package riwi.RiwiApp.infrastructure.abstract_service;

import riwi.RiwiApp.api.dto.request.MessagesReq;
import riwi.RiwiApp.api.dto.response.MessagesResp;

public interface IMessages extends CrudService<MessagesReq, MessagesResp, Long>{
    
    public final String FIELD_BY_SORT = "date";
}
