package riwi.RiwiApp.infrastructure.abstract_service;

import riwi.RiwiApp.api.dto.request.AssignmentsReq;
import riwi.RiwiApp.api.dto.response.AssignmentsResp;

public interface IAssignments extends CrudService<AssignmentsReq, AssignmentsResp, Long>{
    
    public final String FIELD_BY_SORT = "date";
}
