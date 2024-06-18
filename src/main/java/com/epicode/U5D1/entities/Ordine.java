package com.epicode.U5D1.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Component
public class Ordine {
    private int numeroOrdine;
    @Autowired
    private Tavolo tavolo;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalDate oraAcquisizione;
    private List<Item> itemList;
    private double costoTotale;

    public Ordine(int numeroOrdine, Tavolo tavolo, StatoOrdine statoOrdine, int numeroCoperti, List<Item> itemList) {
        this.numeroOrdine = numeroOrdine;
        this.tavolo = tavolo;
        this.statoOrdine = statoOrdine;
        this.numeroCoperti = numeroCoperti;
        this.itemList = itemList;
        this.oraAcquisizione = LocalDate.now();
        this.costoTotale = 0;
        for (Item item : itemList) {
            this.costoTotale += item.getPrice();
        }
    }
}
