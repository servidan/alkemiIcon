/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.repository;

import com.alkemy.icon.entity.IconEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author net
 */
@Repository
public interface IconRepository extends JpaRepository<IconEntity, Long>{
    
}
