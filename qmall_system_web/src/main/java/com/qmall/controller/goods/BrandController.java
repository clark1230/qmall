package com.qmall.controller.goods;

import com.qmall.goods.entity.Brand;
import com.qmall.goods.system.service.BrandService;
import com.qmall.utils.LayuiTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 品牌控制器
 */
@Controller
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 跳转到品牌列表页
     * @return
     */
    @RequestMapping(value = "brand")
    public String brand(){
        return "brand/brand";
    }
    @RequestMapping("/ajaxData")
    @ResponseBody
    public LayuiTable<Brand> ajaxData(@RequestParam(value = "offset",defaultValue = "1") int offset,
                                      @RequestParam(value = "limit",defaultValue = "20") int  limit){

        return brandService.page(offset,limit);
    }


}
