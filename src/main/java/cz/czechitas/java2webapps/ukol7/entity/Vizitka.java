package cz.czechitas.java2webapps.ukol7.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * Vizitka – údaje k jedné vizitce.
 * <p>
 * Pojmenování properties odpovídá názvům sloupečků v databázové tabulce. Jméno třídy odpovídá
 * jménu tabulky v databázi.
 */
@Entity
public class Vizitka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Length(max = 100)
    @NotBlank(message = "Jméno je povinný údaj.")
    private String celeJmeno;

    @Length(max = 100)
    @NotBlank(message = "Firma je povinný údaj.")
    private String firma;

    @Length(max = 100)
    @NotBlank(message = "Ulice je povinný údaj.")
    private String ulice;

    @Length(max = 100)
    @NotBlank(message = "Obec je povinný údaj.")
    private String obec;

    @Length(max = 5)
    @NotBlank(message = "PSČ je povinný údaj.")
    @Pattern(regexp = "\\d{5}", message = "PSČ je špatném tvaru.")
    private String psc;

    @Length(max = 100)
    @Email(message = "Email je ve špatném tvaru.")
    private String email;

    @Length(max = 20)
    @Pattern(regexp = "\\+?\\d*", message = "Telefonní číslo je ve špatném tvaru.")
    private String telefon;

    @Length(max = 100, message = "Chybné zadání.")
    private String web;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCeleJmeno() {
        return celeJmeno;
    }

    public void setCeleJmeno(String celeJmeno) {
        this.celeJmeno = celeJmeno;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getCelaAdresa() {
        return ulice + ", " + obec + " " + psc;
    }
}
