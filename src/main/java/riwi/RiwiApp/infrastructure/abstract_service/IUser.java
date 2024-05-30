package riwi.RiwiApp.infrastructure.abstract_service;

import riwi.RiwiApp.api.dto.request.UserReq;
import riwi.RiwiApp.api.dto.response.UserResp;

public interface IUser extends CrudService<UserReq, UserResp, Long>{
    
    public final String FIELD_BY_SORT = "userName";
}
