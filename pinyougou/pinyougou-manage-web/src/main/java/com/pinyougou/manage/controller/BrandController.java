package com.pinyougou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/brand")
//@Controller
@RestController
//组合了@ResponseBody 和@Controller 对类中的所有方法生效
public class BrandController {

    //引入远程的服务对象
    @Reference
    private BrandService brandService;

//    @RequestMapping(value="findAll",method = RequestMethod.GET)
//    @ResponseBody
    @GetMapping("findAll")
    public List<TbBrand>findAll(){
        return brandService.queryAll();

    }
}
