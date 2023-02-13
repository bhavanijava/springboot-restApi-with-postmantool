package com.mobile.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobile.model.Mobile;

@Repository
public interface MobileRepo extends JpaRepository<Mobile, Integer> {

}
