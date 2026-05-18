package com.rpg.arena;

// Abstract class karakter
public abstract class Karakter implements AksiBertarung {

    // Atribut protected
    protected String nama;
    protected int hp;
    protected int baseDamage;
    protected boolean isDefending;

    // Constructor
    public Karakter(String nama,
                     int hp,
                     int baseDamage) {

        this.nama = nama;
        this.hp = hp;
        this.baseDamage = baseDamage;

        // Default tidak bertahan
        this.isDefending = false;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter hp
    public int getHp() {
        return hp;
    }

    // Setter hp
    public void setHp(int hp) {
        this.hp = hp;
    }

    // Getter base damage
    public int getBaseDamage() {
        return baseDamage;
    }

    // Setter base damage
    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    // Getter defending
    public boolean isDefending() {
        return isDefending;
    }

    // Setter defending
    public void setDefending(boolean defending) {
        isDefending = defending;
    }

    // Method nerima damage
    public void terimaDamage(int damage) {

        // Jika sedang bertahan, damage dikurangi setengah
        if (isDefending) {
            damage = damage / 2;

            // Status bertahan kembali false
            isDefending = false;
        }

        // Mengurangi hp
        hp -= damage;

        // Jika hp minus maka jadi 0
        if (hp < 0) {
            hp = 0;
        }

        // Menampilkan damage
        System.out.println(
                nama + " menerima damage "
                        + damage
        );
    }

    // Abstract method
    public abstract void tampilkanStatus();
}