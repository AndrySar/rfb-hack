package ru.rfb.hack.service.registration;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rfb.hack.converter.UserEntityConverter;
import ru.rfb.hack.domain.entity.UserEntity;
import ru.rfb.hack.domain.model.request.RegistrationRequest;
import ru.rfb.hack.domain.model.response.RegistrationResponse;
import ru.rfb.hack.repository.UserEntityRepository;

import java.util.Objects;

@Service
public class RegistrationService {

    private final static Logger log = LoggerFactory.getLogger(RegistrationService.class);

    @Autowired
    private UserEntityRepository userEntityRepository;

    public RegistrationResponse signUp(RegistrationRequest request) {
        if (validateRegistrationRequest(request)) {
            log.info("User {} success validate", request.getUserName());

            UserEntity newUser = UserEntityConverter.convert(request);
            UserEntity oldUser = userEntityRepository.findByUserName(newUser.getUserName());

            if (Objects.nonNull(oldUser)) {
                return new RegistrationResponse(oldUser.getUserName(), "User already exists");
            }

            userEntityRepository.save(newUser);

            return new RegistrationResponse(request.getUserName(), "");
        }
        return new RegistrationResponse("","Invalid authorization");
    }

    private boolean validateRegistrationRequest(RegistrationRequest request) {
        if (StringUtils.isNotBlank(request.getUserName()) &&
            StringUtils.isNotBlank(request.getFirstName()) &&
            StringUtils.isNotBlank(request.getLastName()) &&
            StringUtils.isNotBlank(request.getPassword()) &&
            StringUtils.isNotBlank(request.getEmail())) {
            return true;
        }
        return false;
    }
}
