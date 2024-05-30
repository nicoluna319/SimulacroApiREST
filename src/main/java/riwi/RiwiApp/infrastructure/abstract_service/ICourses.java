package riwi.RiwiApp.infrastructure.abstract_service;

import riwi.RiwiApp.api.dto.request.CoursesReq;
import riwi.RiwiApp.api.dto.response.CoursesResp;

public interface ICourses extends CrudService<CoursesReq, CoursesResp, Long>{

    public final String FIELD_BY_SORT = "courseName";
    
}
