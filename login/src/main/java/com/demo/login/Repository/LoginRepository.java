package com.demo.login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.login.Model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {

}
