package com.iit.SportsManagementSystem.Mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

    public interface EntityMapper<D, E> {

        E toEntity(D dto);

        @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL)
        E mapToManagedEntity(@MappingTarget E entity, D dto);

        D toDto(E entity);

        List<E> toEntities(List<D> dtoList);

        List<D> toDtos(List<E> entityList);

        @Named("partialUpdate")
        @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
        E partialUpdate(@MappingTarget E entity, D dto);
}
