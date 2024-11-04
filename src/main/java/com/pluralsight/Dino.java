package com.pluralsight;

public class Dino {
    private String name;
    private int age;
    private String species;
    private String diet;
    private double weight;


    public Dino(String name, int age, String species, String diet, double weight) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.diet = diet;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String isDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dino{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", diet=" + diet +
                ", weight=" + weight +
                '}';
    }
}
