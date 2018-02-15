package com.zodiacleo.spring.di;

import java.util.List;

public class RentalLocation
{
    private String name;
    private List<String> titles;
    
    public RentalLocation(String name, List<String> titles)
    {
        this.name = name;
        this.titles = titles;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public List<String> getTitles()
    {
        return titles;
    }
    
    public void setTitles(List<String> titles)
    {
        this.titles = titles;
    }
}
