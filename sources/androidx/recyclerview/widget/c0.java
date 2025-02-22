package androidx.recyclerview.widget;

import android.view.View;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f2597a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2598b = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2599a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f2600b;

        /* renamed from: c  reason: collision with root package name */
        public int f2601c;

        /* renamed from: d  reason: collision with root package name */
        public int f2602d;

        /* renamed from: e  reason: collision with root package name */
        public int f2603e;

        public final boolean a() {
            int i8 = this.f2599a;
            int i10 = 2;
            if ((i8 & 7) != 0) {
                int i11 = this.f2602d;
                int i12 = this.f2600b;
                if ((((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) << 0) & i8) == 0) {
                    return false;
                }
            }
            if ((i8 & 112) != 0) {
                int i13 = this.f2602d;
                int i14 = this.f2601c;
                if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 4) & i8) == 0) {
                    return false;
                }
            }
            if ((i8 & 1792) != 0) {
                int i15 = this.f2603e;
                int i16 = this.f2600b;
                if ((((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) << 8) & i8) == 0) {
                    return false;
                }
            }
            if ((i8 & 28672) != 0) {
                int i17 = this.f2603e;
                int i18 = this.f2601c;
                if (i17 > i18) {
                    i10 = 1;
                } else if (i17 != i18) {
                    i10 = 4;
                }
                if ((i8 & (i10 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i8);

        int e(View view);
    }

    public c0(b bVar) {
        this.f2597a = bVar;
    }

    public final View a(int i8, int i10, int i11, int i12) {
        b bVar = this.f2597a;
        int b10 = bVar.b();
        int c3 = bVar.c();
        int i13 = i10 > i8 ? 1 : -1;
        View view = null;
        while (i8 != i10) {
            View d10 = bVar.d(i8);
            int a10 = bVar.a(d10);
            int e10 = bVar.e(d10);
            a aVar = this.f2598b;
            aVar.f2600b = b10;
            aVar.f2601c = c3;
            aVar.f2602d = a10;
            aVar.f2603e = e10;
            if (i11 != 0) {
                aVar.f2599a = i11 | 0;
                if (aVar.a()) {
                    return d10;
                }
            }
            if (i12 != 0) {
                aVar.f2599a = i12 | 0;
                if (aVar.a()) {
                    view = d10;
                }
            }
            i8 += i13;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.f2597a;
        int b10 = bVar.b();
        int c3 = bVar.c();
        int a10 = bVar.a(view);
        int e10 = bVar.e(view);
        a aVar = this.f2598b;
        aVar.f2600b = b10;
        aVar.f2601c = c3;
        aVar.f2602d = a10;
        aVar.f2603e = e10;
        aVar.f2599a = 24579 | 0;
        return aVar.a();
    }
}
