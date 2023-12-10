package com.example.magasin.Repositories;

import com.example.magasin.Entities.Magasin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagasinRepository extends JpaRepository<Magasin,Integer> {
}
