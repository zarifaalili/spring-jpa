package org.example.jpa.dao.repository;

import org.example.jpa.dao.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<AddressEntity,Long> {
}
