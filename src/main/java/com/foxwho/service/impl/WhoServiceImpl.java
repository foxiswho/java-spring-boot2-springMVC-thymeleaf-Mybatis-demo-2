package com.foxwho.service.impl;

import com.foxwho.dao.WhoMapper;
import com.foxwho.entity.Who;
import com.foxwho.service.WhoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "WhoService")
public class WhoServiceImpl implements WhoService {
    @Autowired
    private WhoMapper whoMapper;

    public int addWho(Who who){
        return whoMapper.insert(who);
    }

    @Override
    public List<Who> findAllWho(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return whoMapper.selectWhos();
    }

}
