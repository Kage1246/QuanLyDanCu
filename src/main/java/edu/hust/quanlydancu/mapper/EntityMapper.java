/**
 * This class was created by Kage
 * This class was created at 04-Jul-23 23:55:27
 */
package edu.hust.quanlydancu.mapper;

import java.util.List;

public interface EntityMapper<D, E> {
    E toEntity(D dto);
    D toDto(E entity);
    List<E> toEntity(List<D> dtoList);
    List<D> toDto(List<E> entityList);
}
