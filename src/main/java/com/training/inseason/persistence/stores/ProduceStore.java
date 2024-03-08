package com.training.inseason.persistence.stores;

import com.training.inseason.domain.models.Produce;
import com.training.inseason.domain.services.ProduceService;
import com.training.inseason.persistence.entities.ProduceEntity;
import com.training.inseason.persistence.mappers.ProduceEntityMapper;
import com.training.inseason.persistence.repositories.ProduceRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProduceStore implements ProduceService {

    private final ProduceRepository produceRepository;
    private final ProduceEntityMapper mapper;
    @Override
    public List<Produce> getAllProduces() {

        List<Produce> produces = new ArrayList<>();

        // map from ProduceEntity into Produce
        produceRepository.findAll().forEach(produceEntity -> {
            final Produce produce = mapper.mapToProduce((produceEntity));
            if(produce != null){
                produces.add(produce);
            }
        });

        return produces;
    }

    @Override
    public Produce getProduceBy(long id) {
        ProduceEntity produceEntity = produceRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        return mapper.mapToProduce(produceEntity);
    }

    @Override
    public Produce createProduce() {
        return null;
    }

    @Override
    public Produce editProduce(long id) {
        return null;
    }
}
