package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Associate_And_Skills;
@Repository
public interface SkillsAssociateRepository  extends JpaRepository<Associate_And_Skills, Integer>{

}
