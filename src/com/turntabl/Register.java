package com.turntabl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Register {
    List<Nameable>register;

    public Register(List<Nameable> register) {
        this.register = register;
    }

    public List<String> studentNames(){
      return register.stream().map(s->s.getName()).collect(Collectors.toList());
    };

    public List<Nameable> getRegister() {
        return register;
    }

    @Override
    public String toString() {
        return "Register{" +
                "register=" + register +
                '}';
    }
}
