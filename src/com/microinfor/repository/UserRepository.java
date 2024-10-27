package com.microinfor.repository;

import com.microinfor.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User> {
}