package com.atwinowsi.gulimall.product;

import com.atwinowsi.gulimall.product.entity.BrandEntity;
import com.atwinowsi.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.mysql.cj.QueryResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setName("AJ");
        brandService.save(brandEntity);
        System.out.println("save Runing>>>>>");
    }
    @Test
    void contextLoads1(){
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("超级帅");
        brandService.updateById(brandEntity);

    }
    @Test
    void findAll(){
        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        for (BrandEntity brandEntity : brand_id) {
            System.out.println(brandEntity);
        }

    }

}
