package cprops.error;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "jsr330")
public interface ProjectMapper {

    @Mapping(target = "id", ignore = true)
    T1 fromBase(T1a base);
}
