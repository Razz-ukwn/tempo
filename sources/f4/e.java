package f4;

import ag.m;
import android.graphics.Bitmap;
import f4.b;
import java.util.Map;

public final class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public final h f8584a;

    /* renamed from: b  reason: collision with root package name */
    public final b f8585b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f8586a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, Object> f8587b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8588c;

        public a(Bitmap bitmap, Map<String, ? extends Object> map, int i8) {
            this.f8586a = bitmap;
            this.f8587b = map;
            this.f8588c = i8;
        }
    }

    public static final class b extends o.e<b.a, a> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e f8589f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(int i8, e eVar) {
            super(i8);
            this.f8589f = eVar;
        }

        public final void b(Object obj, Object obj2, Object obj3) {
            a aVar = (a) obj2;
            a aVar2 = (a) obj3;
            this.f8589f.f8584a.c((b.a) obj, aVar.f8586a, aVar.f8587b, aVar.f8588c);
        }

        public final int g(Object obj, Object obj2) {
            b.a aVar = (b.a) obj;
            return ((a) obj2).f8588c;
        }
    }

    public e(int i8, h hVar) {
        this.f8584a = hVar;
        this.f8585b = new b(i8, this);
    }

    public final void a(int i8) {
        int i10;
        if (i8 >= 40) {
            this.f8585b.h(-1);
            return;
        }
        if (10 <= i8 && i8 < 20) {
            b bVar = this.f8585b;
            synchronized (bVar) {
                i10 = bVar.f12024b;
            }
            bVar.h(i10 / 2);
        }
    }

    public final b.C0153b b(b.a aVar) {
        a aVar2 = (a) this.f8585b.c(aVar);
        if (aVar2 != null) {
            return new b.C0153b(aVar2.f8586a, aVar2.f8587b);
        }
        return null;
    }

    public final void c(b.a aVar, Bitmap bitmap, Map<String, ? extends Object> map) {
        int i8;
        int d10 = m.d(bitmap);
        b bVar = this.f8585b;
        synchronized (bVar) {
            i8 = bVar.f12025c;
        }
        if (d10 <= i8) {
            this.f8585b.d(aVar, new a(bitmap, map, d10));
            return;
        }
        this.f8585b.e(aVar);
        this.f8584a.c(aVar, bitmap, map, d10);
    }
}
