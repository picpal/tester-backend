package com.picpal.tester.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum TesterExceptionCode {
    NOT_FOUND_DATA(422, "COMMON-ERROR-422","NOT FOUND DATA");
    private int status;
    private String code;
    private String message;

    TesterExceptionCode(int status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

}
