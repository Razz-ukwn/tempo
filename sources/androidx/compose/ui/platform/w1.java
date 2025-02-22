package androidx.compose.ui.platform;

import android.graphics.Matrix;
import b7.a;
import cb.b;
import ff.m;
import rf.p;
import sf.j;

public final class w1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final p<T, Matrix, m> f1490a;

    /* renamed from: b  reason: collision with root package name */
    public Matrix f1491b;

    /* renamed from: c  reason: collision with root package name */
    public Matrix f1492c;

    /* renamed from: d  reason: collision with root package name */
    public float[] f1493d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f1494e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1495f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1496g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1497h = true;

    public w1(p<? super T, ? super Matrix, m> pVar) {
        j.f(pVar, "getMatrix");
        this.f1490a = pVar;
    }

    public final float[] a(T t2) {
        float[] fArr = this.f1494e;
        if (fArr == null) {
            fArr = a.s();
            this.f1494e = fArr;
        }
        if (this.f1496g) {
            this.f1497h = a.u(b(t2), fArr);
            this.f1496g = false;
        }
        if (this.f1497h) {
            return fArr;
        }
        return null;
    }

    public final float[] b(T t2) {
        float[] fArr = this.f1493d;
        if (fArr == null) {
            fArr = a.s();
            this.f1493d = fArr;
        }
        if (!this.f1495f) {
            return fArr;
        }
        Matrix matrix = this.f1491b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f1491b = matrix;
        }
        this.f1490a.invoke(t2, matrix);
        Matrix matrix2 = this.f1492c;
        if (matrix2 == null || !j.a(matrix, matrix2)) {
            b.I(matrix, fArr);
            this.f1491b = matrix2;
            this.f1492c = matrix;
        }
        this.f1495f = false;
        return fArr;
    }

    public final void c() {
        this.f1495f = true;
        this.f1496g = true;
    }
}
