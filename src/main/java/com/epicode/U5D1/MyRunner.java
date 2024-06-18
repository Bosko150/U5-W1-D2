package com.epicode.U5D1;

import com.epicode.U5D1.entities.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private Menu menu;


    @Override
    public void run(String... args) throws Exception {

    }
}
