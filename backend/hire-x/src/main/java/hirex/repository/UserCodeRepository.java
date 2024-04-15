//@author Rushikumar Patel

package hirex.repository;

import hirex.model.UserCode;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface UserCodeRepository extends MongoRepository<UserCode, String> {

    UserCode findByCode(final String code);
}
