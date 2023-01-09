package com.egs.userservice.service;

import com.egs.userservice.VO.Department;
import com.egs.userservice.VO.ResponseTemplateVO;
import com.egs.userservice.entity.User1;
import com.egs.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final RestTemplate restTemplate;

    public User1 saveUser(User1 user1) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user1);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User1 user1 = userRepository.findByUserId(userId);

        Department department =
                restTemplate.getForObject("http://localhost:9001/departments/" + user1.getDepartmentId()
                         ,Department.class);
        vo.setUser1(user1);
        vo.setDepartment(department);
        return vo;
    }
}
