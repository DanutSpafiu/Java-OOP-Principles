package lab2_problema4;

import java.time.LocalDate;

public class Person {
    private String name;
    private String cnp;

    public Person(String name, String cnp) {
        this.name = name;
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getVarsta() {
        // Extragem anul din CNP (pozitiile 1 si 2)
        // Exemplu: 501... -> "01"
        int anExtras = Integer.parseInt(cnp.substring(1, 3));
        char primaCifra = cnp.charAt(0);
        int anComplet;

        // Decidem secolul in functie de prima cifra
        if (primaCifra == '1' || primaCifra == '2') {
            anComplet = 1900 + anExtras;
        } else {
            anComplet = 2000 + anExtras;
        }

        int anCurent = LocalDate.now().getYear();
        return anCurent - anComplet;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", CNP: " + cnp + ", Varsta: " + getVarsta() + " ani";
    }
}
// 5050216182110