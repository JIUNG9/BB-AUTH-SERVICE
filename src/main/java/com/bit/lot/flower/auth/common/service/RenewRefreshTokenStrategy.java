package com.bit.lot.flower.auth.common.service;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public interface RenewRefreshTokenStrategy {
  public String renew(HttpServletRequest request);
}
