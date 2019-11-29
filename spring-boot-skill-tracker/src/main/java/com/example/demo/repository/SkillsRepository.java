package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Skills_details;
@Repository
public interface SkillsRepository extends JpaRepository<Skills_details, Integer>{

}
