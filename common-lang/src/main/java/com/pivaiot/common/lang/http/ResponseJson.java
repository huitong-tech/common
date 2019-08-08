package com.pivaiot.common.lang.http;


import com.pivaiot.common.lang.exception.CommonException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseJson<T> {
    private T data;
    private String code;
    private String message;
    private Object meta;

    public ResponseJson(T data) {
        this.data = data;
    }

    public static <T> ResponseJson<T> ok(T data) {
        return new ResponseJson<>(data);
    }

    public static ResponseJson ok() {
        return new ResponseJson();
    }

    @SuppressWarnings("unchecked")
    public static ResponseJson err(CommonException e) {
        return new ResponseJson(null, e.getErrorCode().getCode(), e.getErrorCode().getMessage(), null);
    }

    @SuppressWarnings("unchecked")
    public static ResponseJson err(CommonException e, Object meta) {
        return new ResponseJson(null, e.getErrorCode().getCode(), e.getErrorCode().getMessage(), meta);
    }

    public static ResponseJson err() {
        return err(new CommonException());
    }
}
