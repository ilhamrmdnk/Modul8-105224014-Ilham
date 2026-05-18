package com.rpg.entitas;

import com.rpg.arena.Karakter;

// Class Monster
public class Monster extends Karakter {

    // Jenis monster
    private String jenisMonster;

    // Constructor
    public Monster(String nama,
                   int hp,
                   int baseDamage,
                   String jenisMonster) {

        super(nama, hp, baseDamage);

        this.jenisMonster = jenisMonster;
    }

    // Override serang
    @Override
    public int serang() {

        // Damage biasa
        return baseDamage;
    }

    // Override bertahan
    @Override
    public void bertahan() {

        // Monster heal sedikit hp
        hp += 10;

        System.out.println(
                nama + " memulihkan 10 HP!"
        );
    }

    // Override gunakan item
    @Override
    public void gunakanItem() {

        System.out.println(
                nama + " tidak memiliki item!"
        );
    }

    // Override tampilkan status
    @Override
    public void tampilkanStatus() {

        System.out.println(
                "Monster : " + nama
        );

        System.out.println(
                "Jenis   : " + jenisMonster
        );

        System.out.println(
                "HP      : " + hp
        );
    }
}