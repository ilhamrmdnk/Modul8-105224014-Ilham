package com.rpg.entitas;
import com.rpg.arena.Karakter;

// Class Pahlawan
public class Pahlawan extends Karakter {

    // Atribut tambahan
    private int mana;
    private int level;

    // Constructor
    public Pahlawan(String nama,
                    int hp,
                    int baseDamage,
                    int mana,
                    int level) {

        super(nama, hp, baseDamage);

        this.mana = mana;
        this.level = level;
    }

    // Getter mana
    public int getMana() {
        return mana;
    }

    // Setter mana
    public void setMana(int mana) {
        this.mana = mana;
    }

    // Getter level
    public int getLevel() {
        return level;
    }

    // Setter level
    public void setLevel(int level) {
        this.level = level;
    }

    // Override method serang
    @Override
    public int serang() {

        // Damage berdasarkan level
        return baseDamage * level;
    }

    // Overloading method serang skill
    public int serang(String namaSkill,
                      int manaCost) {

        // Jika mana cukup
        if (mana >= manaCost) {

            // Mengurangi mana
            mana -= manaCost;

            System.out.println(
                    nama + " menggunakan skill "
                            + namaSkill
            );

            // Damage lebih besar
            return baseDamage * level * 2;
        }

        // Jika mana kurang
        System.out.println(
                "Mana tidak cukup!"
        );

        return 0;
    }

    // Override bertahan
    @Override
    public void bertahan() {

        // Mengaktifkan mode defend
        isDefending = true;

        System.out.println(
                nama + " bersiaga bertahan!"
        );
    }

    // Override gunakan item
    @Override
    public void gunakanItem() {

        // Menambah hp
        hp += 30;

        System.out.println(
                nama + " menggunakan potion +30 HP"
        );
    }

    // Override tampilin status
    @Override
    public void tampilkanStatus() {

        System.out.println(
                "Pahlawan : " + nama
        );

        System.out.println(
                "HP       : " + hp
        );

        System.out.println(
                "Mana     : " + mana
        );

        System.out.println(
                "Level    : " + level
        );
    }
}