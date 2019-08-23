/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonogram;

import java.util.Comparator;

/**
 *
 * @author рам
 */
public class Sortname implements Comparator<Sound> {
@Override
public int compare(Sound o1,Sound o2){
    return  o1.name.compareTo(o2.name);
}      
}
