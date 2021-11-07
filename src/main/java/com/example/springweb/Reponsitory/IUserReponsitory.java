package com.example.springweb.Reponsitory;

import com.example.springweb.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserReponsitory extends JpaRepository<UserEntity, Long> {
    @Query("select u from UserEntity u where u.userName=:userName")
    public UserEntity findAllByUserName(String userName);
    @Query(value = "select u from UserEntity u where u.userName=:userName ")
    UserEntity findAllByUser(String userName);
}
