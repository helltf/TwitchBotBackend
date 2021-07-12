package com.helltf.TBBackend.Repositories;

import com.helltf.TBBackend.Entities.Channel;
import com.helltf.TBBackend.Entities.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends JpaRepository<Name, Integer> {
    Name findByName(String name);
}