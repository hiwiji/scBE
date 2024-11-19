package com.github.supercoding.web.dto;

public class Spec {

    private String cpu;
    private String capacity;


    // 기본생성자
    public Spec() {
    }


    public Spec(String cpu, String capacity) {
        this.cpu = cpu;
        this.capacity = capacity;
    }

    // getter
    public String getCpu() {
        return cpu;
    }

    public String getCapacity() {
        return capacity;
    }
}
