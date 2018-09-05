package com.foxwho.service;


import java.util.List;
import com.foxwho.entity.Who;


public interface WhoService {
    List<Who> findAllWho(int pageNum, int pageSize);
}
