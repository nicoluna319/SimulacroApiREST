package riwi.RiwiApp.infrastructure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import riwi.RiwiApp.api.dto.request.UserReq;
import riwi.RiwiApp.api.dto.response.UserResp;
import riwi.RiwiApp.domain.entities.UserEntity;
import riwi.RiwiApp.domain.repositories.UserRepository;
import riwi.RiwiApp.infrastructure.abstract_service.IUser;
import riwi.RiwiApp.utils.SortType;
import riwi.RiwiApp.utils.messages.ErrorMessages;

@Service
@AllArgsConstructor
public class UserService implements IUser{
    
    @Autowired
    private final UserRepository userRepository;

    @Override
    public UserResp create(UserReq request) {

        UserEntity entity = this.requestToEntity(request);
        return this.entityToResponse(this.userRepository.save(entity));

    }

    @Override
    public UserResp get(Long id) {

        return this.entityToResponse(this.find(id));

    }

    @Override
    public UserResp update(UserReq request, Long id) {

        UserEntity user = this.find(id);

        UserEntity userUpdate = this.requestToEntity(request);
        userUpdate.setId(id);
        userUpdate.setCourses(user.getCourses());


        return this.entityToResponse(this.userRepository.save(userUpdate));

    }

    @Override
    public void delete(Long id) {

        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }


    @Override
    public Page<UserResp> getAll(int page, int size, SortType sortType) {

        if (page <0) page = 0;

        PageRequest pagination = null;

        switch (sortType) {
            case NONE -> pagination = PageRequest.of(page, size);
            case ASC -> pagination = PageRequest.of(page, size, Sort.by(FIELD_BY_SORT).ascending());
            case DESC -> pagination = PageRequest.of(page, size, Sort.by(FIELD_BY_SORT).descending());
        }

        return this.userRepository.findAll(pagination).map(this::entityToResponse);
    }


    private UserResp entityToResponse (UserEntity entity) {
        return UserResp.builder()
            .id(entity.getId())
            .userName(entity.getUserName())
            .fullName(entity.getFullName())
            .email(entity.getEmail())
            .role(entity.getRole())
            .build();
    }

    private UserEntity requestToEntity (UserReq request) {
        return UserEntity.builder()
            .userName(request.getUserName())
            .fullName(request.getFullName())
            .email(request.getEmail())
            .password(request.getPassword())
            .role(request.getRole())
            .build();
    }

    private UserEntity find(Long id){

        return this.userRepository.findById(id)
        .orElseThrow(()-> new riwi.RiwiApp.utils.exception.BadRequestException(ErrorMessages.idNotFound("User")));

    }

}
