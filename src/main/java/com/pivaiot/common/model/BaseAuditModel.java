package com.pivaiot.common.model;


import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public abstract class BaseAuditModel extends BaseIdAndTimeModel {
    private Long createdBy;
    private Long updatedBy;
}
