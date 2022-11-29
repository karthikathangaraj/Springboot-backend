package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.prodapt;

public interface prod extends JpaRepository<prodapt,Integer>
{

}
