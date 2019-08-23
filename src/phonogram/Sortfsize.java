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
public class Sortfsize implements Comparator<Sound> {

        @Override
	public int compare(Sound o1, Sound o2) {
		
		double p1 = o1.fsize;
		double p2 = o2.fsize;
		
		if (p1 > p2){
			return 1;
		}
		else if (p1 < p2){
			return -1;
		}
		else return 0;
	}
    
}
