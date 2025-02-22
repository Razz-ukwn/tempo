package u1;

import java.util.ArrayList;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f15669a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f15670b;

    public e(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f15669a = new int[size];
        this.f15670b = new float[size];
        for (int i8 = 0; i8 < size; i8++) {
            this.f15669a[i8] = ((Integer) arrayList.get(i8)).intValue();
            this.f15670b[i8] = ((Float) arrayList2.get(i8)).floatValue();
        }
    }

    public e(int i8, int i10) {
        this.f15669a = new int[]{i8, i10};
        this.f15670b = new float[]{0.0f, 1.0f};
    }

    public e(int i8, int i10, int i11) {
        this.f15669a = new int[]{i8, i10, i11};
        this.f15670b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
