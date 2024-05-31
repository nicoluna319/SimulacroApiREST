package riwi.RiwiApp.api.controllers;

import java.util.Objects;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import riwi.RiwiApp.api.dto.request.UserReq;
import riwi.RiwiApp.api.dto.response.UserResp;
import riwi.RiwiApp.infrastructure.abstract_service.IUser;
import riwi.RiwiApp.utils.SortType;

@RestController
@RequestMapping(path = "/user")
@AllArgsConstructor
public class UserController {

    private final IUser userService;
    
    @PostMapping
    public ResponseEntity<UserResp> insert(@Validated @RequestBody UserReq request){
        return ResponseEntity.ok(this.userService.create(request));
    }

    @GetMapping
    public ResponseEntity<Page<UserResp>> getAll(
        @RequestParam(defaultValue = "1") int Page,
        @RequestParam(defaultValue = "10") int size,
        @RequestHeader(required = false) SortType sortType){

            if (Objects.isNull(sortType))
            sortType = SortType.NONE;
        
            return ResponseEntity.ok(this.userService.getAll(Page - 1, size, sortType));
        
        }

        @GetMapping(path = "/{id}")
        public ResponseEntity<UserResp> get(@PathVariable Long id){
            return ResponseEntity.ok(this.userService.get(id));
        }

        @PutMapping(path = "/{id}")
        public ResponseEntity<UserResp> update(
            @Validated @RequestBody UserReq  request, 
            @PathVariable Long id){

                return ResponseEntity.ok(this.userService.update(request, id));

        }

        



        }

