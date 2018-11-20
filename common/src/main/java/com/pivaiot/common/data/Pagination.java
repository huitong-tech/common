package com.pivaiot.common.data;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 分页结构.
 *
 * @param <T> 分页数组中的数据项类型
 */
@Data
public class Pagination<T> implements BaseData {

    // 总记录数　
    private Long total;

    // 当前内容
    private List<T> rows;

    public Pagination() {
        this(0L, Lists.newArrayList());
    }

    public Pagination(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }


    public <R> Pagination<R> map(Function<? super T, ? extends R> mapFunction) {
        return new Pagination<>(this.total, this.rows.stream().map(mapFunction).collect(Collectors.toList()));
    }

    public static <T> Pagination craft(Long total, List<T> rows) {
        return new Pagination<>(total, rows);
    }

    public static <T> Pagination<T> empty() {
        return new Pagination<>();
    }
}
