package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Hr;
@Repository
public interface HrRepository extends JpaRepository<Hr, Integer>{

}
