package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import q2.b;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final b f1875a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f1876b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1877c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f1878d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f1879a;

        /* renamed from: b  reason: collision with root package name */
        public q f1880b;

        public a() {
            this(1);
        }

        public final void a(q qVar, int i8, int i10) {
            int a10 = qVar.a(i8);
            SparseArray<a> sparseArray = this.f1879a;
            a aVar = sparseArray == null ? null : sparseArray.get(a10);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(qVar.a(i8), aVar);
            }
            if (i10 > i8) {
                aVar.a(qVar, i8 + 1, i10);
            } else {
                aVar.f1880b = qVar;
            }
        }

        public a(int i8) {
            this.f1879a = new SparseArray<>(i8);
        }
    }

    public o(Typeface typeface, b bVar) {
        int i8;
        int i10;
        this.f1878d = typeface;
        this.f1875a = bVar;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i11 = a10 + bVar.f12830a;
            i8 = bVar.f12831b.getInt(bVar.f12831b.getInt(i11) + i11);
        } else {
            i8 = 0;
        }
        this.f1876b = new char[(i8 * 2)];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i12 = a11 + bVar.f12830a;
            i10 = bVar.f12831b.getInt(bVar.f12831b.getInt(i12) + i12);
        } else {
            i10 = 0;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            q qVar = new q(this, i13);
            q2.a c3 = qVar.c();
            int a12 = c3.a(4);
            Character.toChars(a12 != 0 ? c3.f12831b.getInt(a12 + c3.f12830a) : 0, this.f1876b, i13 * 2);
            b7.a.o(qVar.b() > 0, "invalid metadata codepoint length");
            this.f1877c.a(qVar, 0, qVar.b() - 1);
        }
    }
}
