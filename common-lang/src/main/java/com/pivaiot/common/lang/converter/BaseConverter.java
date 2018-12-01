package com.pivaiot.common.lang.converter;

import com.pivaiot.common.lang.util.BeanUtil;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public abstract class BaseConverter<D, M> {

    @SuppressWarnings("unchecked")
    public D toData(M model) {
        try {
            D data = (D) getDataClass().newInstance();
            BeanUtil.copyProperties(model, data);
            return data;
        } catch (Exception e) {
            LOGGER.warn("Convert failed:{}", model);
            return null;
        }

    }

    @SuppressWarnings("unchecked")
    public M toModel(D data) {
        try {
            M model = (M) getModelClass().newInstance();
            BeanUtil.copyProperties(data, model);
            return model;
        } catch (Exception e) {
            LOGGER.warn("Convert failed:{}", data);
            return null;
        }

    }

    public List<D> toDataList(List<M> modelList) {
        return modelList.stream().map(this::toData).collect(Collectors.toList());
    }

    public List<M> toModelList(List<D> dataList) {
        return dataList.stream().map(this::toModel).collect(Collectors.toList());
    }

    private Type[] getTypes() {
        Type genType = this.getClass().getGenericSuperclass();
        return ((ParameterizedType)genType).getActualTypeArguments();
    }

    private Class getDataClass() {
        return (Class)(getTypes()[0]);
    }

    private Class getModelClass() {
        return (Class)(getTypes()[1]);
    }

}
