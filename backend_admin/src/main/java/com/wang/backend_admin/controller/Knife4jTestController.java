package com.wang.backend_admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Api(value = "测试Knife4j的控制类 ")
@Controller
public class Knife4jTestController {

    @ApiImplicitParam(name = "name", value = "名字", dataType = "String", dataTypeClass = String.class, required = true)
    @ApiOperation(value = "向客人问好")
    @GetMapping(name = "测试get请求的方法", value = {"/sayHi"}, produces = {"application/json;charset=UTF-8"})
    public ResponseEntity<String> testKnife4j(@RequestParam(value = "name") String name) {
        return ResponseEntity.ok("Hi:" + name);
    }
}
