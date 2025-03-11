public class L3206 {
    public int numberOfAlternatingGroups(int[] colors) {
        int res = 0;
        int n = colors.length;
        for (int i = 1;i < n - 1; i++){
            if (colors[i] != colors[i - 1] && colors[i] != colors[i + 1]){
                res++;
            }

        }
        if (colors[n - 1] != colors[n - 2] && colors[0] != colors[n - 1]) res++;
        if (colors[n - 1] != colors[0] && colors[0] != colors[1]) res++;

        return res;
    }
}
