package riwi.RiwiApp.infrastructure.abstract_service;

import riwi.RiwiApp.api.dto.request.EnrollmentsReq;
import riwi.RiwiApp.api.dto.response.EnrollmentsResp;

public interface IEnrollments extends CrudService<EnrollmentsReq, EnrollmentsResp, Long>{
    
    public final String FIELD_BY_SORT = "date";
}
