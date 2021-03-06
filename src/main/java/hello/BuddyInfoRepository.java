package hello;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

@RepositoryRestResource(collectionResourceRel = "buddies", path = "buddies")
public interface BuddyInfoRepository extends PagingAndSortingRepository<BuddyInfo, Long> {
    List<BuddyInfo> findByName(String name);
    BuddyInfo findById(long id);
}