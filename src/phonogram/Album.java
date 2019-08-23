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
public class Album extends Sound {
    int god;
    public Album(String name, String executor, String genre, double fsize, double ftime, int god) {
        super(name, executor, genre, fsize, ftime);
    }

    @Override
    void print() {//вывод
        System.out.println("Название:" + name + " Исполнитель:" + executor + " Жанр:" + genre + " Размер файла:" + fsize + "МБ" + " Продолжительность:" + ftime + "мин" + " год:" + god);
    }
}
