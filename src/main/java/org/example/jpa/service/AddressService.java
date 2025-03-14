package org.example.jpa.service;

import lombok.RequiredArgsConstructor;
import org.example.jpa.dao.entity.AddressEntity;
import org.example.jpa.dao.repository.AddressRepository;
import org.example.jpa.mapper.Addressmapper;
import org.example.jpa.model.dto.AddressDto;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {
  private final AddressRepository addressRepository;

  public void createAddress(AddressDto addressDto) {
      var entity = Addressmapper.toEntity(addressDto);
      addressRepository.save(entity);

  }
}
