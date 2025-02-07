package com.galvanize.autos.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonPropertyOrder({"count", "automobiles"})
public class AutosList {
    private List<Automobile> automobiles;

    public AutosList() {
        this.automobiles = new ArrayList<>();
    }

    public AutosList(List<Automobile> automobiles) {
        this.automobiles = automobiles;
    }

    public long getCount() {
        return automobiles.size();
    }

    public List<Automobile> getAutomobiles() {
        return automobiles;
    }

    public void setAutomobiles(List<Automobile> automobiles) {
        this.automobiles = automobiles;
    }

    @JsonIgnore
    public boolean isEmpty(){
        return this.automobiles.isEmpty();
    }

    @Override
    public String toString() {
        return "AutosList{" +
                "automobiles=" + automobiles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutosList autosList = (AutosList) o;
        return Objects.equals(automobiles, autosList.automobiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(automobiles);
    }
}