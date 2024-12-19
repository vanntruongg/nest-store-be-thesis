package com.vantruong.user.exception;

import com.vantruong.common.exception.ErrorDetail;

public class ExpiredException extends RuntimeException {
  private final transient ErrorDetail errorDetail;

  public ExpiredException(int errorCode, String message) {
    super(message);
    this.errorDetail = ErrorDetail.builder()
            .errorCode(errorCode)
            .message(message)
            .build();
  }

  public ExpiredException(int errorCode, String message, Throwable cause) {
    super(message, cause);
    this.errorDetail = ErrorDetail.builder()
            .errorCode(errorCode)
            .message(message)
            .build();
  }
}