/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.service;

import com.alkemy.icon.dto.ContinenteDTO;
import java.util.List;

/**
 *
 * @author net
 */
public interface ContinenteService {
    
    ContinenteDTO save(ContinenteDTO dto);
    
    List<ContinenteDTO> getAllContinentes(); 
    
}
