package com.pivaiot.common.lang.data;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class BaseIdData implements BaseData {
    private Long id;
}
