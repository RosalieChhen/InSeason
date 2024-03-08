package com.training.inseason.persistence.mappers;

import com.training.inseason.domain.models.Produce;
import com.training.inseason.persistence.entities.ProduceEntity;
import org.springframework.stereotype.Component;

@Component
public class ProduceEntityMapper {
    public Produce mapToProduce(ProduceEntity produceEntity) {
        Produce produce = new Produce();
        produce.setName(produceEntity.getName());
        produce.setCategory(produceEntity.getCategory());
        produce.setMonths(produceEntity.getMonths());
        return produce;
    }
}
