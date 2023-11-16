package com.javarush.entity;

import jakarta.persistence.*;


import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;
@Entity
@Table(schema = "world", name = "country")
public class Country {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "code")
    private String code;
    @Column(name = "code_2")
    private String code_2;
    @Column(name = "name")
    private String name;
    @Column(name = "continent")
    @Enumerated(EnumType.ORDINAL)
    private Continent continent;
    @Column(name = "region")
    private String region;
    @Column(name = "surface_area")
    private BigDecimal surface_area;
    @Column(name = "indep_year")
    private Short indep_year;
    @Column(name = "population")
    private Integer population;
    @Column(name = "life_expectancy")
    private BigDecimal life_expectancy;
    @Column(name = "gnp")
    private BigDecimal gnp;
    @Column(name = "gnpo_id")
    private BigDecimal gnpo_id;
    @Column(name = "local_name")
    private String local_name;
    @Column(name = "government_form")
    private String government_form;
    @Column(name = "head_of_state")
    private String head_of_state;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "capital")
    private City city;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    private Set<CountryLanguage> languages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode_2() {
        return code_2;
    }

    public void setCode_2(String code_2) {
        this.code_2 = code_2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BigDecimal getSurface_area() {
        return surface_area;
    }

    public void setSurface_area(BigDecimal surface_area) {
        this.surface_area = surface_area;
    }

    public Short getIndep_year() {
        return indep_year;
    }

    public void setIndep_year(Short indep_year) {
        this.indep_year = indep_year;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public BigDecimal getLife_expectancy() {
        return life_expectancy;
    }

    public void setLife_expectancy(BigDecimal life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    public BigDecimal getGnp() {
        return gnp;
    }

    public void setGnp(BigDecimal gnp) {
        this.gnp = gnp;
    }

    public BigDecimal getGnpo_id() {
        return gnpo_id;
    }

    public void setGnpo_id(BigDecimal gnpo_id) {
        this.gnpo_id = gnpo_id;
    }

    public String getLocal_name() {
        return local_name;
    }

    public void setLocal_name(String local_name) {
        this.local_name = local_name;
    }

    public String getGovernment_form() {
        return government_form;
    }

    public void setGovernment_form(String government_form) {
        this.government_form = government_form;
    }

    public String getHead_of_state() {
        return head_of_state;
    }

    public void setHead_of_state(String head_of_state) {
        this.head_of_state = head_of_state;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Set<CountryLanguage> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<CountryLanguage> languages) {
        this.languages = languages;
    }
}
