package com.training.inseason.persistence.entities;

import com.training.inseason.domain.models.enums.Category;
import com.training.inseason.domain.models.enums.Month;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Produce")
public class ProduceEntity implements Serializable {
    @Id
    private long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Category category;
    @Enumerated(EnumType.STRING)
    private List<Month> months;
}
