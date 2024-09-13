package com.vantruong.identity.service;

import com.vantruong.common.exception.Constant;
import com.vantruong.common.exception.NotFoundException;
import com.vantruong.identity.entity.Token;
import com.vantruong.identity.repository.TokenRepository;
import com.vantruong.identity.constant.MessageConstant;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TokenService {
  private final TokenRepository tokenRepository;

  public TokenService(TokenRepository tokenRepository) {
    this.tokenRepository = tokenRepository;
  }

  public Token findByTokenValue(String tokenValue) {
    return tokenRepository.findTokenByTokenValue(tokenValue).orElseThrow(()
            -> new NotFoundException(Constant.ErrorCode.NOT_FOUND, MessageConstant.INVALID_TOKEN));
  }

  @Transactional
  public void createToken(Token token) {
    tokenRepository.save(token);
  }
}
