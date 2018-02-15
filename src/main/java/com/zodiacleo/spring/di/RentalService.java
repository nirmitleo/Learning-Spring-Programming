package com.zodiacleo.spring.di;

import com.zodiacleo.spring.di.locators.SourceLocator;

import java.util.ArrayList;
import java.util.List;

public class RentalService
{
    private SourceLocator sourceLocator;
    
    public RentalService(SourceLocator sourceLocator)
    {
        this.sourceLocator = sourceLocator;
    }
    
    public List<RentalLocation> find(String title, String zipcode, int miles)
    {
        List<RentalLocation> locations = sourceLocator.find(zipcode, miles);
        List<RentalLocation> results = new ArrayList<>();
        for (RentalLocation location : locations)
        {
            if (location.getTitles().contains(title))
            {
                results.add(location);
            }
        }
        return results;
    }
}
