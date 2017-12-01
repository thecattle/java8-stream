package com.sunp.data;


import java.util.List;

public class EarthModel {
    TeaModel tea;

    List<PersonModel> personModels;

    public List<PersonModel> getPersonModels() {
        return personModels;
    }

    public void setPersonModels(List<PersonModel> personModels) {
        this.personModels = personModels;
    }

    public TeaModel getTea() {
        return tea;
    }

    public void setTea(TeaModel tea) {
        this.tea = tea;
    }
}
