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
public class Single extends Sound {
    String format;//формат сингла

    public Single(String name, String executor, String genre, double fsize, double ftime, String format) {//виниловый, видеосингл,mp3
        super(name, executor, genre, fsize, ftime);
    }

    @Override
    void print() {//вывод
        System.out.println("Название:" + name + " Исполнитель:" + executor + " Жанр:" + genre + " Размер файла:" + fsize + "МБ" + " Продолжительность:" + ftime + "мин" + " Формат сингла:" + format);
    }
}
