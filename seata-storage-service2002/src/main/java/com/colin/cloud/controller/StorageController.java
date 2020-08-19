package com.colin.cloud.controller;


import com.colin.cloud.entities.CommonResult;
import com.colin.cloud.service.StorageService;
import io.seata.core.context.RootContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class StorageController {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        String globalXid = request.getHeader(RootContext.KEY_XID);
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
