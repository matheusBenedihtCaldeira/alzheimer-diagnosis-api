package com.alzheimer.diagnosis.api.servicers.user.impl;

import com.alzheimer.diagnosis.api.repositories.UserRepository;
import com.alzheimer.diagnosis.api.servicers.user.DeleteUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteUserServiceImpl implements DeleteUserService {

    private final UserRepository repository;
    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}