package com.pivaiot.common.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class BaseIdModel implements BaseModel {
    private Long id;
}
