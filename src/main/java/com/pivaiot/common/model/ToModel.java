package com.pivaiot.common.model;

/**
 * Model in MVVM or DTO
 *
 * @param <T> dto type
 */
public interface ToModel<T> {
    T toModel();
}
