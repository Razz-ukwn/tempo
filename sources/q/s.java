package q;

public interface s extends j<Float> {
    float b(long j10, float f10, float f11, float f12);

    long c(float f10, float f11, float f12);

    float d(float f10, float f11, float f12) {
        return b(c(f10, f11, f12), f10, f11, f12);
    }

    float e(long j10, float f10, float f11, float f12);

    <V extends p> t0<V> a(l0<Float, V> l0Var) {
        return new t0<>(new s0(this));
    }
}
