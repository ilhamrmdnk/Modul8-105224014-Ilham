package com.rpg.main;

import java.util.Scanner;

import com.rpg.entitas.Pahlawan;
import com.rpg.entitas.Monster;

public class GameEngine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input nama pahlawan
        System.out.print(
                "Masukkan nama pahlawan : "
        );

        String nama = input.nextLine();

        // Membuat object pahlawan
        Pahlawan hero =
                new Pahlawan(
                        nama,
                        150,
                        20,
                        100,
                        2
                );

        // Array monster
        Monster[] monsters = {

                new Monster(
                        "Goblin",
                        60,
                        10,
                        "Goblin"
                ),

                new Monster(
                        "Orc",
                        80,
                        15,
                        "Orc"
                ),

                new Monster(
                        "Dragon",
                        120,
                        25,
                        "Dragon"
                )
        };

        // Loop monster satu per satu
        for (Monster monster : monsters) {

            System.out.println(
                    "\n===== MUSUH MUNCUL ====="
            );

            monster.tampilkanStatus();

            // Battle loop
            while (hero.getHp() > 0
                    && monster.getHp() > 0) {

                System.out.println(
                        "\n===== STATUS ====="
                );

                hero.tampilkanStatus();
                monster.tampilkanStatus();

                // Menu pilihan
                System.out.println(
                        "\n1. Serang"
                );

                System.out.println(
                        "2. Skill"
                );

                System.out.println(
                        "3. Bertahan / Heal"
                );

                System.out.print(
                        "Pilih aksi : "
                );

                int pilih = input.nextInt();

                int damageHero = 0;

                // Switch case aksi player
                switch (pilih) {

                    case 1:

                        // Serangan biasa
                        damageHero = hero.serang();

                        System.out.println(
                                hero.getNama()
                                        + " menyerang!"
                        );

                        break;

                    case 2:

                        // Skill
                        damageHero =
                                hero.serang(
                                        "Fire Slash",
                                        20
                                );

                        break;

                    case 3:

                        // Bertahan + heal
                        hero.bertahan();
                        hero.gunakanItem();

                        break;

                    default:

                        System.out.println(
                                "Pilihan tidak valid!"
                        );
                }

                // Monster menerima damage
                monster.terimaDamage(
                        damageHero
                );

                // Jika monster kalah
                if (monster.getHp() <= 0) {

                    System.out.println(
                            monster.getNama()
                                    + " kalah!"
                    );

                    break;
                }

                // Serangan monster
                int damageMonster =
                        monster.serang();

                System.out.println(
                        monster.getNama()
                                + " menyerang balik!"
                );

                // Hero menerima damage
                hero.terimaDamage(
                        damageMonster
                );
            }

            // Jika hero kalah
            if (hero.getHp() <= 0) {

                break;
            }
        }

        // Kondisi akhir game
        if (hero.getHp() > 0) {

            System.out.println(
                    "\n===== VICTORY ====="
            );

            System.out.println(
                    hero.getNama()
                            + " berhasil menamatkan Dungeon!"
            );
        }

        else {

            System.out.println(
                    "\n===== GAME OVER ====="
            );

            System.out.println(
                    hero.getNama()
                            + " telah kalah..."
            );
        }

        input.close();
    }
}