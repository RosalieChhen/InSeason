package com.training.inseason.domain.services;

import com.training.inseason.domain.models.Produce;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProduceService {
    public List<Produce> getAllProduces();
    public Produce getProduceBy(long id);
    public Produce createProduce();
    public Produce editProduce(long id);
}
