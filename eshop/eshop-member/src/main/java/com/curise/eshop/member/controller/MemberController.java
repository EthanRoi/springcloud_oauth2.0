package com.curise.eshop.member.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * 〈〉
 *
 * @author Curise
 * @create 2018/12/12
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api")
public class MemberController {

    @GetMapping("hello")
    @PreAuthorize("hasAnyAuthority('hello')")
    public String hello(){
        return "hello";
    }

    @GetMapping("current")
    public Principal user(Principal principal) {
        return principal;
    }

    @GetMapping("query")
    @PreAuthorize("hasAnyAuthority('query')")
    public String query() {
        return "具有query权限";
    }
}
