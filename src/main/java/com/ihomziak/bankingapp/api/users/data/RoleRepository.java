package com.ihomziak.bankingapp.api.users.data;

import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<RoleEntity, Long> {

    RoleEntity findByName(String name);
}