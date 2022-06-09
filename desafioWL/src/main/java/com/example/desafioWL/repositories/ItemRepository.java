package com.example.desafioWL.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.desafioWL.entities.Item;
//aqui é salvo os dados do banco 

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

}
