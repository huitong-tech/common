package com.pivaiot.common.lang.exception;

public class CommonException extends RuntimeException {

    private ErrorCode errorCode;

    public CommonException() {
        super();
    }

    public CommonException(ErrorCode errorCode) {
        super(errorCode.getErrorCode());
        this.errorCode = errorCode;
    }

    public CommonException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public CommonException(String message, Throwable cause, ErrorCode errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public CommonException(Throwable cause, ErrorCode errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

}
