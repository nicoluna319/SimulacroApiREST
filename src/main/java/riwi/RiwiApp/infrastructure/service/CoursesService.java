package riwi.RiwiApp.infrastructure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import riwi.RiwiApp.api.dto.request.CoursesReq;
import riwi.RiwiApp.api.dto.response.CoursesResp;
import riwi.RiwiApp.domain.repositories.CoursesRepository;
import riwi.RiwiApp.infrastructure.abstract_service.ICourses;
import riwi.RiwiApp.utils.SortType;

@Service
@AllArgsConstructor
public class CoursesService implements ICourses {
    
    @Autowired
    private final CoursesRepository coursesRepository;

    @Override
    public CoursesResp create(CoursesReq request) {

        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public CoursesResp get(Long id) {

        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public CoursesResp update(CoursesReq request, Long id) {

        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {

        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Page<CoursesResp> getAll(int page, int size, SortType sortType) {

        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    //AQUI QUEDÉ
    
}
