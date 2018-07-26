package test;

public class MainTest {

    public static void main(String[] args) {
        int[] values = new int[] {894, 260, 392, 281, 27};
        int[] weights = new int[] {8, 6, 4, 0, 21};
        int W = 10;
        int[] tab = new int[W+1];
        System.out.println(knapsack(values, weights, W, tab, 0));
    }

    static int knapsack(int[] values, int[] weights, int W, int[] tab, int i) {
        if(i>=values.length) return 0;
        if(tab[W] != 0)
            return tab[W];

        int value1 = knapsack(values, weights, W, tab, i+1);
        int value2 = 0;
        if(W >= weights[i]) value2 = knapsack(values, weights, W-weights[i], tab, i+1) + values[i];

        return tab[W] = (value1>value2) ? value1 : value2;
    }

}
