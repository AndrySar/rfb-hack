package ru.rfb.hack.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rfb.hack.domain.entity.UserEntity;
import ru.rfb.hack.repository.UserEntityRepository;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserEntityRepository userEntityRepository;

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userEntityRepository.save(userEntity);
    }

    @Override
    public UserEntity getUserById(long userId) {
        return userEntityRepository.getOne(userId);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userEntityRepository.findAll();
    }
}
