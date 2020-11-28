package calculator;

public class ClassCalculator {
    // methode ajoutee par Diarra

    public int sum(int a, int b) {
        return a + b;
    }

    public int sus(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return a / b;
    }
    // methode ajoutee par Oumy

    public int minElement(int[] list) {
        int min = list[0];
        int i;
        for (i = 0; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;
    }
    public int MaxElement( int [] list){
        int max = list[0];
        int i;
        for ( i = 0; i < list.length; i++){
            if (list[i] > max){
                max = list[i];
            }
        }
        return max;
    }
    // methode ajoutee par Wore

    public int multiply(int a, int b) {
		return a * b ;
	}
    
    public int min(int a, int b){
		return Math.min(a,b);
	} 
    
    public int max(int a, int b){
		return Math.max(a,b);
	}


}
