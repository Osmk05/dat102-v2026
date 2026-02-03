package dat102.f06.diverse;

import java.util.Arrays;

public class MaksITabell {
	
	public static void main(String[] args) {
		
		int[] tabell = {-4, 5, 12, 0, 3, 7, -2, 3};
		
System.out.println("Den største verdien i tabellen "
				+ Arrays.toString(tabell) + " er " + makstab(tabell));
	}
    public static int makstab(int[] tab){
        return makstab(tab,0,tab.length -1);
    }
    public static int makstab(int[] tab, int start, int slutt){

        if(start == slutt){
            return tab[start];
        }
        else{
            int midten = (start + slutt)/2;
            int maksv = makstab(tab, start, midten);
            int maksh = makstab(tab, midten + 1, slutt);
            return Math.max(maksv,maksh);
        }
    }

}
