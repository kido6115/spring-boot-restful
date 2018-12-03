package com.sungyeh.service.Impl;

import com.sungyeh.domain.User;
import com.sungyeh.repository.UserRepository;
import com.sungyeh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
@Service("com.sungyeh.service.Impl.UserServiceImpl")
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository repository;
    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
