class LUPrefix {
    boolean[] v;
    int max = 1;

    public LUPrefix(int n) {
        v = new boolean[n + 2];
        v[0] = true;
        max = 1;
    }

    public void upload(int video) {
        v[video] = true;
        while (v[max]) {
            max++;
        }
    }

    public int longest() {
        return (max - 1);
    }
}