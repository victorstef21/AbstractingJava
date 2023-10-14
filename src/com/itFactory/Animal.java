package com.itFactory;

public class Animal {
    private String animal;
   private  String rasa;

    public Animal(String animal, String rasa) {
        this.animal = animal;
        this.rasa = rasa;
    }


    public String getAnimal() {
        return animal;
    }

    public String getRasa() {
        return rasa;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

}
