package com.bugod.core.controller;

import com.bugod.constant.enums.ErrorCodeEnum;
import com.bugod.constant.enums.GenderEnum;
import com.bugod.entity.GenderPO;
import com.bugod.entity.ResultWrapper;
import com.bugod.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;





/**
 * <pre>
 * Copyright (C) 2020 XXX股份有限公司
 * FileName: GenderController
 * Author:   虫神
 * Date:     2020/3/3 15:45
 * Description: 乱七八糟的Controller
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间         Jira编号            描述
 *
 *
 * </pre>
 */

@Slf4j
@RestController
@RequestMapping("/api")
@Api(tags = "控制层")
public class AllController extends BaseController {

    @ApiOperation(value = "Get获取枚举", notes = "Get获取枚举")
    @GetMapping("/enum")
    public ResultWrapper get(GenderPO request) {
        GenderEnum genderEnum = request.getGender();
        if (Objects.isNull(genderEnum)) {
            return error(ErrorCodeEnum.ARGS_NULL, "gender 不能为空");
        }
        return success(request);
    }

    @ApiOperation(value = "自定义注解", notes = "自定义注解")
    @PostMapping("/validate")
    public ResultWrapper<User> validate(@Validated User user) {
        user.setEmail("admin@usa.com").setMobile("+86 "+user.getMobile());
        return success(user);
    }

    @ApiOperation(value = "path", notes = "path")
    @PostMapping("/{uuid}")
    public ResultWrapper path(@PathVariable("uuid") String uuid) {
        return success();
    }

    @ApiOperation(value = "Get获取名字", notes = "Get获取名字")
    @GetMapping("/getName/x/y/z")
    public ResultWrapper getName(@RequestParam String name) {
        return success(name);
    }
}