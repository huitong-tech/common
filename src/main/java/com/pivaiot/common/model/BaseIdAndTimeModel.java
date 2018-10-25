package com.pivaiot.common.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
public abstract class BaseIdAndTimeModel extends BaseIdModel {
    private Date createdTime;
    private Date updatedTime;
}
