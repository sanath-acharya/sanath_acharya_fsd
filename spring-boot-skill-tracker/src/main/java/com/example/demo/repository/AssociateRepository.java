package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Associate;
@Repository
public interface AssociateRepository extends JpaRepository<Associate, Integer>{

}
