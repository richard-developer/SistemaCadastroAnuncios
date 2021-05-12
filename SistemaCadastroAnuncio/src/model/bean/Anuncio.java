/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Ricardo
 */
public class Anuncio {

    private int ID;
    private String NOME_ANUNCIO;
    private String CLIENTE;
    private LocalDate DATA_INICIO;
    private LocalDate DATA_TERMINO;
    private int VALOR_INVEST_DIA;
    // Recebem as datas que vem do Banco:
    private Date DATA_INICIO_BD;
    private Date DATA_TERMINO_BD;

    public Date getDATA_TERMINO_BD() {
        return DATA_TERMINO_BD;
    }

    public void setDATA_TERMINO_BD(Date DATA_TERMINO_BD) {
        this.DATA_TERMINO_BD = DATA_TERMINO_BD;
    }

    public Date getDATA_INICIO_BD() {
        return DATA_INICIO_BD;
    }

    public void setDATA_INICIO_BD(Date DATA_INICIO_BD) {
        this.DATA_INICIO_BD = DATA_INICIO_BD;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNOME_ANUNCIO() {
        return NOME_ANUNCIO;
    }

    public void setNOME_ANUNCIO(String NOME_ANUNCIO) {
        this.NOME_ANUNCIO = NOME_ANUNCIO;
    }

    public String getCLIENTE() {
        return CLIENTE;
    }

    public void setCLIENTE(String CLIENTE) {
        this.CLIENTE = CLIENTE;
    }

    public LocalDate getDATA_INICIO() {
        return DATA_INICIO;
    }

    public void setDATA_INICIO(LocalDate DATA_INICIO) {
        this.DATA_INICIO = DATA_INICIO;
    }

    public LocalDate getDATA_TERMINO() {
        return DATA_TERMINO;
    }

    public void setDATA_TERMINO(LocalDate DATA_TERMINO) {
        this.DATA_TERMINO = DATA_TERMINO;
    }

    public int getVALOR_INVEST_DIA() {
        return VALOR_INVEST_DIA;
    }

    public void setVALOR_INVEST_DIA(int VALOR_INVEST_DIA) {
        this.VALOR_INVEST_DIA = VALOR_INVEST_DIA;
    }

}
