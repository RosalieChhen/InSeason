package com.training.inseason.api.controllers;

import com.training.inseason.api.constants.Endpoints;
import com.training.inseason.api.dto.ProduceDTO;
import com.training.inseason.api.mappers.ProduceDtoMapper;
import com.training.inseason.persistence.stores.ProduceStore;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(Endpoints.PRODUCES)
public class ProduceController {

    private final ProduceStore produceStore;
    private final ProduceDtoMapper mapper;

    @GetMapping
    public List<ProduceDTO> getAllProduces() {

        List<ProduceDTO> producesDTO = new ArrayList<>();

        // map from Produce into ProduceDTO
        produceStore.getAllProduces().forEach(produce -> {
            final ProduceDTO produceDTO = mapper.mapToProduceDto(produce);
            if(produceDTO != null) {
                producesDTO.add(produceDTO);
            }
        });

        return producesDTO;
    }

    @GetMapping("/{id}")
    public ProduceDTO getProduce(@PathVariable("id") Long id) {
        return mapper.mapToProduceDto(produceStore.getProduceBy(id));
    }
}
