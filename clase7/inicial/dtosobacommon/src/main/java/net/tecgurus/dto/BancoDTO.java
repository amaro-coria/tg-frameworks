package net.tecgurus.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Amaro on 10/08/2017.
 */
@Data
public class BancoDTO implements Serializable{
    private Integer idBanco;
    private String nombre;
}