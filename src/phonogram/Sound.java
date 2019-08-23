/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonogram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Sound implements Comparable<Sound> {

    static List<Sound> list;
    String name;//название 
    String executor;//Исполнитель
    String genre;//Жанр
    double fsize;//размер файла
    double ftime;//продолжительность песни
    Sound(String name, String executor, String genre, double fsize, double ftime) {
        this.name = name;
        this.executor = executor;
        this.genre = genre;
        this.fsize = fsize;
        this.ftime = ftime;
    }

    @Override
    public int compareTo(Sound other) {//сортировка по название
        return this.genre.compareTo(other.genre);
    }

    void print() {//вывод
        System.out.println("Название:" + name + " Исполнитель:" + executor + " Жанр:" + genre + " Размер файла:" + fsize + "МБ" + " Продолжительность:" + ftime + "мин");
    }

    public double Summa() {//продолжительность
        return ftime;

    }

    public static void metod1() throws IOException {       //загрузка из файла
        if (list == null) {
            System.out.println("Коллекция пуста");
            return;
        }
        try {
            BufferedReader fr = new BufferedReader(new FileReader("DiskSave.txt"));
            Sound a = new Sound("Daram", "Arash", "Pop", 4.1, 3.5);
            List<Sound> DiskLoad = new ArrayList();
            String s;
            while ((s = fr.readLine()) != null) {
                String ms[] = s.split(",");
                a.name = ms[0];
                a.executor = ms[1];
                a.genre = ms[2];
                a.fsize = Double.parseDouble(ms[3]);
                a.ftime = Double.parseDouble(ms[4]);
                DiskLoad.add(new Sound(a.name, a.executor, a.genre, a.fsize, a.ftime));
            }
            fr.close();
            int i;
            for (i = 0; i < DiskLoad.size(); i++) {
                DiskLoad.get(i).print();
            }
        } catch (FileNotFoundException e) {
            System.err.println("Сначала сохраните файл! " + e.getMessage());
        }
    }

    public static void metod2() throws IOException {   //запись в файл
        if (list == null) {
            System.out.println("Коллекция пуста");
            return;
        }
        FileWriter fw = new FileWriter("DiskSave.txt");
        BufferedWriter out = new BufferedWriter(fw);
        for (Sound v : list) {
            try {

                out.write(v.name + ", ");
                out.write(v.executor + ", ");
                out.write(v.genre + ", ");
                out.write(v.fsize + ", ");
                out.write(v.ftime + "\r\n");

            } catch (IOException e) {
                System.err.println("Ошибка ввода-вывода " + e.getMessage());
            }

        }
        out.close();
        System.out.println("Файл сохранен");
    }

    public static void metod3() {   //создание коллекции      
        list = new ArrayList<>();
        list.add(new Sbornic("Million Miles An Hour", "Nickelback", "Rok", 9.59, 4.09, "mp3"));
        Sound a = new Album("Remind Me", "Eminem", "hip hop", 7.24, 3.45, 2005);
        list.add(a);
        if (a instanceof Album) {
            System.out.print( "..");
            ((Album) a).print();
        } 
        Sound a2 = new Album("Remind Me", "Eminem", "hip hop", 7.24, 3.46, 2005);
    }

    public static void metod4() { //вывод коллекции

        int i;
        if (list == null) {
            System.out.println("Коллекция пуста");
            return;
        }
        for (i = 0; i < list.size(); i++) {
            System.out.print(i + ".");
            list.get(i).print();
        }
        Sound ex = new Album("Remind Me", "Eminem", "hip hop", 7.24, 3.46, 2005);
        if (ex instanceof Album) {
            System.out.print(i + "..");
            ((Album) ex).print();
        } 
    }

    public static void metod5() { //поиск
        if (list == null) {
            System.out.println("Коллекция пуста");
            return;
        }
        System.out.println("1-Название:");
        System.out.println("2-Исполнитель:");
        System.out.println("3-Жанр:");
        Scanner k = new Scanner(System.in);
        int p = k.nextInt();
        switch (p) {
            case 1:
                System.out.println("Что искать?");
                Scanner name = new Scanner(System.in);
                String w = name.nextLine();
                System.out.println("Найденная композиция:");
                for (Sound v : list) {
                    if (v.name.equals(w)) {
                        v.print();
                    }
                }
                break;
            case 2:
                System.out.println("Что искать?");
                Scanner executor = new Scanner(System.in);
                String f = executor.nextLine();
                System.out.println("Найденная композиция:");
                for (Sound v : list) {
                    if (v.executor.equals(f)) {
                        v.print();
                    }
                }
                break;
            case 3:
                System.out.println("Что искать?");
                Scanner genre = new Scanner(System.in);
                String x = genre.nextLine();
                System.out.println("Найденная композиция:");
                for (Sound v : list) {
                    if (v.genre.equals(x)) {
                        v.print();
                    }
                }
                break;
        }

    }

    public static void metod6() {//сортировка
        if (list == null) {
            System.out.println("Коллекция пуста");
            return;
        }
        System.out.println("1-название");
        System.out.println("2-Исполнитель");
        System.out.println("3-Жанр");
        System.out.println("4-Размер файла");
        Scanner k = new Scanner(System.in);
        int p = k.nextInt();
        switch (p) {
            case 1:
                System.out.println("название");
                Comparator<Sound> cs = new Sortname();
                Collections.sort(list, cs);
                for (Sound v : list) {
                    v.print();
                }
                break;
            case 2:
                System.out.println("Исполнитель");
                Comparator<Sound> cs1 = new Sortexecutor();
                Collections.sort(list, cs1);
                for (Sound v : list) {
                    v.print();
                }
                break;
            case 3:
                System.out.println("Жанр");
                Collections.sort(list);
                for (Sound v : list) {
                    v.print();
                }
                break;
            case 4:
                System.out.println("Размер файла");
                Comparator<Sound> cs2 = new Sortfsize();
                Collections.sort(list, cs2);
                for (Sound v : list) {
                    v.print();
                }
                break;
        }

    }

    public static void metod7() {//расчет продолжительности
        if (list == null) {
            System.out.println("Коллекция пуста");
            return;
        }
        int i;
        double sum = 0;
        for (i = 0; i < list.size(); i++) {
            sum += list.get(i).Summa();
        }
        System.out.println("Продолжительность коллекции=" + sum + "мин");
    }

    public static void metod8() {//Добавление элемента с консоли
        System.out.println("Какую вы бы хотели добавить музыку:");
        System.out.println("1-сингл");
        System.out.println("2-Альбом");
        System.out.println("3-Сборник");
        Scanner k = new Scanner(System.in);
        int p = k.nextInt();
        switch (p) {
            case 1:
                System.out.println("сингл");

                list.add(new Single("Million Miles An Hour", "Nickelback", "Rok", 9.59, 4.09, "mp3"));
                list.add(new Album("Million Miles An Hour", "Nickelback", "Rok", 9.59, 4.09, 2018));
                break;
            case 2:
                System.out.println("Альбом");
                break;
            case 3:
                System.out.println("Сборник");

                Scanner t = new Scanner(System.in);
                System.out.println("Введите название");
                String b = t.nextLine();
                System.out.println("Введите исполнителя");
                String с = t.nextLine();
                System.out.println("Введите жанр");
                String n = t.nextLine();
                System.out.println("Введите размер");
                double di = t.nextDouble();
                System.out.println("Введите продолжительность");
                double mi = t.nextDouble();
                System.out.println("Введите кто");
                String hw = t.nextLine();
                list.add(new Sbornic(b, с, n, di, mi, hw));
//                if (list instanceof Sbornic) {
//
//                    String hw1 = ((Sbornic) list).hw;
//                    
//                }

                break;
        }
    }

    public static void metod9() {//Удаление элемента с консоли
        if (list == null) {
            System.out.println("Коллекция пуста");
            return;
        }
        System.out.println("Какой элемент с консоли удалить:");
        Scanner k = new Scanner(System.in);
        int p = k.nextInt();
        list.remove(p);
    }

    public static void metod10() {
        if (list == null) {
            System.out.println("Коллекция пуста");
            return;
        }
        list.removeAll(list);
    }

}
