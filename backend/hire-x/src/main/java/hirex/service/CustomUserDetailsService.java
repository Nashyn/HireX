package hirex.service;

import hirex.dto.RegistrationRequestDTO;
import hirex.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import hirex.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) {
        User user = userRepository.findByEmail(email);
        List<String> roles = new ArrayList<>();
        roles.add(user.getUserRole());
        UserDetails userDetails =
                org.springframework.security.core.userdetails.User.builder()
                        .username(user.getEmail())
                        .password(user.getPassword())
                        .roles(roles.toArray(new String[0]))
                        .build();
        return userDetails;
    }

    public User getUser(String email){
        return userRepository.findByEmail(email);
    }

    public User addUser(RegistrationRequestDTO registrationRequestDTO){
        User user = new User();
        user.setEmail(registrationRequestDTO.getEmail());
        user.setPassword(registrationRequestDTO.getPassword());
        user.setFirstname(registrationRequestDTO.getFirstname());
        user.setLastname(registrationRequestDTO.getLastname());
        user.setUserRole(registrationRequestDTO.getRole());

        return userRepository.save(user);
    }
    public void updateUserPassword(User user, String password){
        user.setPassword(password);
        userRepository.save(user);

        List<String> roles = new ArrayList<>();
        roles.add(user.getUserRole());
        UserDetails userDetails =
                org.springframework.security.core.userdetails.User.builder()
                        .username(user.getEmail())
                        .password(user.getPassword())
                        .roles(roles.toArray(new String[0]))
                        .build();
    }

}
