/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonogram;


/**
 *
 * @author рам
 */
public class Sbornic extends Sound {
    String hw;
    public Sbornic(String name, String executor, String genre, double fsize, double ftime, String hw) {
        super(name, executor, genre, fsize, ftime);
    }

    @Override
    void print() {//вывод
        System.out.println("Название:" + name + " Исполнитель:" + executor + " Жанр:" + genre + " Размер файла:" + fsize + "МБ" + " Продолжительность:" + ftime + "мин" + " кто:" + hw);
    }

}
