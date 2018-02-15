package com.zodiacleo.spring.di.locators;

import com.zodiacleo.spring.di.RentalLocation;

import java.util.List;

public interface SourceLocator
{
    List<RentalLocation> find(String zipcode, int radius);
}
