package es.gogroup.batchlaboral.service;

import es.gogroup.batchlaboral.entity.FosUser;
import es.gogroup.batchlaboral.repository.FosUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FosUserService {

    private final FosUserRepository repository;


    public FosUserService(FosUserRepository repository) {
        this.repository = repository;
    }

    public List<FosUser> getAllUsers(){
        return (List<FosUser>) this.repository.findAll();
    }
}
