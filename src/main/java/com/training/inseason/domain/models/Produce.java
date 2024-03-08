package com.training.inseason.domain.models;

import com.training.inseason.domain.models.enums.Category;
import com.training.inseason.domain.models.enums.Month;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Produce {
    private String name;
    private Category category;
    private List<Month> months;
}
