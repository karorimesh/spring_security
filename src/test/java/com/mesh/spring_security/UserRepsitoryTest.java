package com.mesh.spring_security;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import javax.persistence.EntityManager;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepsitoryTest {

//    @Autowired
//    UserRepository userRepository;
//    @Autowired
//    EntityManager entityManager;
//    @Test
//    public void repoTest(){
//        User user = new User();
//        user.setEmail("man@gmail.com");
//        user.setPassword("mmmmnnnn");
//        user.setFirstname("mesha");
//        user.setLastname("mesha");
//
//        User saveUser = userRepository.save(user);
//
//        User userExist = entityManager.find(User.class,saveUser.getUser_id());
//        Assertions.assertThat(userExist.getEmail()).isEqualTo(user.getEmail());
//
//
//    }
//
//    @Test
//    public void testFindByEmail(){
//        String email = "karorimesh@gmail.com";
//        User user = userRepository.findByEmail(email);
//        Assertions.assertThat(user).isNotNull();
//    }
}
