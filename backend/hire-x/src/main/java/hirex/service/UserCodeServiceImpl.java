//@author Rushikumar Patel

package hirex.service;

import hirex.model.User;
import hirex.model.UserCode;
import hirex.repository.UserCodeRepository;
import hirex.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserCodeServiceImpl implements UserCodeService{
    @Autowired
    private UserCodeRepository userCodeRepository;

    @Override
    public UserCode add(User user) {
        UserCode userCode = new UserCode();
        userCode.setUser(user);
        userCode.setCode(UUID.randomUUID().toString());
        userCode.setIsActive(true);

        userCodeRepository.save(userCode);

        return userCode;
    }

    @Override
    public UserCode getUserCodeByCode(String code) {
        return userCodeRepository.findByCode(code);
    }

    @Override
    public void updateIsActive(UserCode userCode) {
        userCode.setIsActive(false);
        userCodeRepository.save(userCode);
    }

}
