package s4;

public final class g implements a<int[]> {
    public final int a() {
        return 4;
    }

    public final String b() {
        return "IntegerArrayPool";
    }

    public final int c(Object obj) {
        return ((int[]) obj).length;
    }

    public final Object newArray(int i8) {
        return new int[i8];
    }
}
