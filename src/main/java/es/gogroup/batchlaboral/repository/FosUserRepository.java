package es.gogroup.batchlaboral.repository;

import es.gogroup.batchlaboral.entity.FosUser;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FosUserRepository extends PagingAndSortingRepository <FosUser, Long> {
}
