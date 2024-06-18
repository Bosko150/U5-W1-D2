package com.epicode.U5D1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@Component
public class Tavolo {
    private int numero;
    private int posti;
    private StatoTavolo statoTavolo;
}
