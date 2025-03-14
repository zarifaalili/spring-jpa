package org.example.jpa.mapper;

import org.example.jpa.dao.entity.AddressEntity;
import org.example.jpa.model.dto.AddressDto;

public class Addressmapper {
    public static AddressEntity toEntity(AddressDto addressDto) {
   AddressEntity entity=new AddressEntity();
   entity.setCity(addressDto.getCity());
   entity.setStreet(addressDto.getStreet());
   return entity;
    }
    public static AddressDto toDto(AddressEntity entity) {
        AddressDto dto=new AddressDto();
        dto.setCity(entity.getCity());
        dto.setStreet(entity.getStreet());
        return dto;
    }
}
