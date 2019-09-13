package ru.rfb.hack.service.auth;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rfb.hack.domain.entity.UserEntity;
import ru.rfb.hack.domain.model.request.AuthRequest;
import ru.rfb.hack.domain.model.response.AuthResponse;
import ru.rfb.hack.repository.UserEntityRepository;

import java.util.Objects;

@Service
public class AuthService {

    private final static Logger log = LoggerFactory.getLogger(AuthService.class);

    @Autowired
    private UserEntityRepository userEntityRepository;

    public AuthResponse signIn(AuthRequest request) {

        if (validateRequestParams(request)) {
            UserEntity user = userEntityRepository.findByUserNameAndPassword(request.getUserName(), request.getPassword());

            if (Objects.nonNull(user)) {
                String token = generateToken();
                return new AuthResponse(request.getUserName(), token);
            }
        }

        return new AuthResponse("Invalid auth credentials");
    }

    private boolean validateRequestParams(AuthRequest request) {
        if (StringUtils.isNotBlank(request.getUserName()) &&
            StringUtils.isNotBlank(request.getPassword())) {
            return true;
        }
        return false;
    }

    private String generateToken() {
        return RandomStringUtils.random(20, true, true);
    }
}
