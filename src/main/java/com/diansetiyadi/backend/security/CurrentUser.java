package com.diansetiyadi.backend.security;


import org.springframework.security.core.annotation.AuthenticationPrincipal;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@Documented
@AuthenticationPrincipal
public @interface CurrentUser {
}
