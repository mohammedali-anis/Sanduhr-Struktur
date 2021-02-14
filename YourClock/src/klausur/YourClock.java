package klausur;

public class YourClock {
    public int getMaxValue(int[][] arr) {
        int max = -1;
        // Ich habe 4 Möglicgkeiten nach rechts und unten zu gehen, daher row/col < 4
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int val = arr[0 + row][0 + col] + arr[0 + row][1 + col] + arr[0 + row][2 + col]
                                                + arr[1 + row][1 + col] +
                          arr[2 + row][0 + col] + arr[2 + row][1 + col] + arr[2 + row][2 + col];
                // wenn meine aktuelle Summe größer als bisheriges Maximum: ersetze Maximum durch aktuellen Wert
                if (val > max){
                    max = val;
                }
            }
        }
        return max;
    }
}
