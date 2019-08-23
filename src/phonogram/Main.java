/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonogram;

import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import static phonogram.Sound.metod1;
import static phonogram.Sound.metod10;
import static phonogram.Sound.metod2;
import static phonogram.Sound.metod3;
import static phonogram.Sound.metod4;
import static phonogram.Sound.metod5;
import static phonogram.Sound.metod6;
import static phonogram.Sound.metod7;
import static phonogram.Sound.metod8;
import static phonogram.Sound.metod9;

/**
 * String name, String executor, String genre, double fsize, double ftime
 *
 * @author рам
 */
public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
//        List<Single> singl = new ArrayList();//синглы
//        singl.add(0, new Single("Dirty Laundry", "Nickelback", "Rok", 9.05, 4.0));
//        singl.add(1, new Single("Photograph", "Nickelback", "Rok", 9.15, 4.18));
//        singl.add(2, new Single("Right Now", "David Guetta; Rihanna", "Pop", 8.4, 3.05));
//        singl.add(3, new Single("Rap God", "Eminem", "hip hop", 10.5, 6.04));
//        singl.add(4, new Single("Остров сломанных игрушек", "БИ-2", "Pop", 3.1, 0.59));
//        System.out.println("Синглы:");
//        for (i = 0; i < singl.size(); i++) {
//            singl.get(i).print();
//        }
//        System.out.println("**********************************");
//        List<Album> No_Fixed_Adress = new ArrayList();//альбом
//        No_Fixed_Adress.add(0, new Album("Million Miles An Hour", "Nickelback", "Rok", 9.59, 4.09));
//        No_Fixed_Adress.add(1, new Album("Edge Of A Revolution", "Nickelback", "Rok", 9.34, 4.03));
//        No_Fixed_Adress.add(2, new Album("What Are You Waiting For", "Nickelback", "Rok", 8.42, 3.39));
//        No_Fixed_Adress.add(3, new Album("She Keeps Me Up", "Nickelback", "Rok", 9.12, 3.57));
//        No_Fixed_Adress.add(4, new Album("Believe", "Nickelback", "Rok", 8.17, 3.32));
//        No_Fixed_Adress.add(5, new Album("Satellite", "Nickelback", "Rok", 9.11, 3.57));
//        System.out.println("Альбом:No_Fixed_Adress");
//        for (i = 0; i < No_Fixed_Adress.size(); i++) {
//            No_Fixed_Adress.get(i).print();
//        }
//        System.out.println("**********************************");
//        List<Album> Горизонт_событий = new ArrayList();//альбом
//        Горизонт_событий.add(0, new Album("Летчик", "БИ-2", "Rok", 13.5, 5.51));
//        Горизонт_событий.add(1, new Album("Черное солнце", "БИ-2", "Rok", 11.1, 4.49));
//        Горизонт_событий.add(2, new Album("Детство", "БИ-2", "Rok", 7.54, 3.14));
//        Горизонт_событий.add(3, new Album("Лайки", "БИ-2", "Rok", 8.22, 3.31));
//        Горизонт_событий.add(4, new Album("Алиса", "БИ-2", "Rok", 8.57, 3.41));
//        System.out.println("Альбом:Горизонт_событий");
//        for (i = 0; i < Горизонт_событий.size(); i++) {
//            Горизонт_событий.get(i).print();
//        }
//        System.out.println("**********************************");
//        List<Album> Revival = new ArrayList();//альбом
//        Revival.add(0, new Album("Believe", "Eminem", "hip hop", 9.47, 5.15));
//        Revival.add(1, new Album("Untouchable", "Eminem", "hip hop", 10.1, 6.11));
//        Revival.add(2, new Album("Remind Me", "Eminem", "hip hop", 7.24, 3.45));
//        Revival.add(3, new Album("Heat", "Eminem", "hip hop", 8.4, 4.1));
//        System.out.println("Альбом:Revival");
//        for (i = 0; i < Revival.size(); i++) {
//            Revival.get(i).print();
//        }
//        System.out.println("**********************************");
//        List<AlbumSbor> Rock = new ArrayList();//альбом сборный
//        Rock.add(0, new AlbumSbor("Are You Gonna Be My Girl", "Jet", "Rok", 7.67, 3.35));
//        Rock.add(1, new AlbumSbor("Rockstar", "Nickelback", "Rok", 8.43, 4.12));
//        Rock.add(2, new AlbumSbor("Walk", "Pantera", "Rok", 10.1, 5.15));
//        Rock.add(3, new AlbumSbor("Song 2", "Blur", "Rok", 5.16, 2.02));
//        Rock.add(4, new AlbumSbor("American Idiot", "Green Day", "Rok", 6.1, 2.56));
//        System.out.println("Альбом сборный:Rock");
//        for (i = 0; i < Rock.size(); i++) {
//            Rock.get(i).print();
//        }
//        System.out.println("**********************************");
//        List<AlbumSbor> Лучшее = new ArrayList();//альбом сборный
//        Лучшее.add(0, new AlbumSbor("Ах какая женщина", "Фристайл", "Pop", 9.56, 5.13));
//        Лучшее.add(1, new AlbumSbor("Мальчик хочет в Тамбов", "Мурат Насыров", "Pop", 6.3, 3.35));
//        Лучшее.add(2, new AlbumSbor("Он тебя целует", "Руки Вверх", "Pop", 7.54, 4.03));
//        Лучшее.add(3, new AlbumSbor("Спектакль окончен", "Полина Гагарина", "Pop", 7.3, 4.0));
//        Лучшее.add(4, new AlbumSbor("Лунапарк", "БИ-2", "Pop", 7.7, 4.12));
//        Лучшее.add(5, new AlbumSbor("Самая-самая", "Егор Крид", "Pop", 6.34, 3.56));
//        System.out.println("Альбом сборный:Лучшее");
//        for (i = 0; i < Лучшее.size(); i++) {
//            Лучшее.get(i).print();
//        }
//        System.out.println("**********************************");
//        List<Sound> Disk = new ArrayList();
//        Disk.addAll(singl);
//        Disk.addAll(No_Fixed_Adress);
//        Disk.addAll(Горизонт_событий);
//        Disk.addAll(Revival);
//        Disk.addAll(Rock);
//        Disk.addAll(Лучшее);
        while(true){
        System.out.println("Меню:");
        System.out.println("0-Создать коллекцию:");
        System.out.println("1-Вывести коллекцию на экран:");
        System.out.println("2-Добавление элемента с консоли:");
        System.out.println("3-Удаление элемента с консоли:");
        System.out.println("4-Сортировка по признаку:");
        System.out.println("5-Поиск по признаку:");
        System.out.println("6-Сохранение на диске:");
        System.out.println("7-Загрузка с диска:");
        System.out.println("8-Очистка:"); 
        System.out.println("9-Расчет продолжительности:");
        System.out.println("10-ВЫХОД:");
        System.out.println("**********************************");
        System.out.println("Выберите действие:");
        Scanner vvod = new Scanner(System.in);
        int z = vvod.nextInt();
        switch (z) {
            case 0:
                System.out.println("Создать коллекцию:");
                metod3();
                break;
            case 1:
                System.out.println("Вывести коллекцию на экран:");//
                metod4();
                break;   
            case 2:
                System.out.println("Добавление элемента с консоли:");//
                metod8();
                break;
            case 3:
                System.out.println("Удаление элемента с консоли:");
                metod9();
                break;
            case 4:
                System.out.println("Сортировка по признаку:");
                metod6();
                break;
            case 5:
                System.out.println("Поиск по признаку:");
                metod5();
                break;
            case 6:
                System.out.println("Сохранение на диске:");
                metod2();
                break;
            case 7:
                System.out.println("Загрузка с диска:");
                 metod1();
                break;
            case 8:
                System.out.println("Очистка:");
                metod10();
                break;
            case 9:
                System.out.println("Расчет продолжительности:");
                metod7();
                break; 
            case 10:
                System.out.println("ВЫХОД:");
                return;
            default:
                return;
        }
    }
}
}
