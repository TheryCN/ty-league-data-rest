package com.github.therycn.tyleaguedatarest.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Abstract Entity.
 *
 * @param <ID> the entity id
 */
@MappedSuperclass
@Getter
@Setter
public class AbstractEntity<ID> extends AbstractAggregateRoot<AbstractEntity<ID>> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

}
