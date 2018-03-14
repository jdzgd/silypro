package com.gk.web.controller;

import com.gk.entity.SysDic;
import com.gk.service.SysDicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 16:48 2018/1/8
 * @Modified By:
 **/
@Controller
@RequestMapping("/DataDictionary")
public class SysDicController {
    @Autowired
    private SysDicService sysDicService;

    @RequestMapping(value = "/AllDataDictionary", method = RequestMethod.POST)
    @ResponseBody
    public List<SysDic> selectSysDic(){
        return sysDicService.selectSysDic();
    }
}
