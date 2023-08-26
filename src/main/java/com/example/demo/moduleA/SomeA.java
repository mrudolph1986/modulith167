package com.example.demo.moduleA;

import com.example.demo.common.mapper.Mapper;
import com.example.demo.moduleB.SomeB;
import org.springframework.stereotype.Service;

@Service
public class SomeA {
    private final Mapper mapper;
    private final SomeB someB;

    public SomeA(Mapper mapper, SomeB someB) {
        this.mapper = mapper;
        this.someB = someB;
    }
}
