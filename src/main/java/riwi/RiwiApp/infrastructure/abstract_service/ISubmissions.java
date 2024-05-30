package riwi.RiwiApp.infrastructure.abstract_service;

import riwi.RiwiApp.api.dto.request.SubmissionsReq;
import riwi.RiwiApp.api.dto.response.SubmissionsResp;

public interface ISubmissions extends CrudService<SubmissionsReq, SubmissionsResp, Long>{
    
    public final String FIELD_BY_SORT = "date";
}
