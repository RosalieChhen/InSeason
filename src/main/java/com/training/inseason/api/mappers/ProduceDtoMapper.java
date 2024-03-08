package com.training.inseason.api.mappers;

import com.training.inseason.api.dto.ProduceDTO;
import com.training.inseason.domain.models.Produce;
import org.springframework.stereotype.Component;

@Component
public class ProduceDtoMapper {
    public ProduceDTO mapToProduceDto(Produce produce) {
        ProduceDTO produceDTO = new ProduceDTO();
        produceDTO.setName(produce.getName());
        produceDTO.setCategory(produce.getCategory());
        produceDTO.setMonths(produce.getMonths());
        return produceDTO;
    }
}
