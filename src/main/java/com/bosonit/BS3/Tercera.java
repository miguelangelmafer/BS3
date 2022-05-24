package com.bosonit.BS3;

import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

public class Tercera implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("args:" + Arrays.deepToString((args)));
    }
}
