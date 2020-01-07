package com.warape.seataccount.controller;

import com.warape.seataccount.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author IT云清
 */
@Slf4j
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountServiceImpl;

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     * @return
     */
    @RequestMapping("decrease")
    public String decrease(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money){
        accountServiceImpl.decrease(userId,money);
        return "Account decrease success";
    }
}
