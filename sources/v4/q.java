package v4;

import ag.b1;
import c2.d;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p4.f;
import p4.h;
import r4.s;
import v4.n;

public final class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final List<n<Model, Data>> f16195a;

    /* renamed from: b  reason: collision with root package name */
    public final d<List<Throwable>> f16196b;

    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {
        public List<Throwable> B;
        public boolean C;

        /* renamed from: a  reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.d<Data>> f16197a;

        /* renamed from: b  reason: collision with root package name */
        public final c2.d<List<Throwable>> f16198b;

        /* renamed from: c  reason: collision with root package name */
        public int f16199c;

        /* renamed from: d  reason: collision with root package name */
        public j f16200d;

        /* renamed from: e  reason: collision with root package name */
        public d.a<? super Data> f16201e;

        public a(ArrayList arrayList, c2.d dVar) {
            this.f16198b = dVar;
            if (!arrayList.isEmpty()) {
                this.f16197a = arrayList;
                this.f16199c = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        public final Class<Data> a() {
            return this.f16197a.get(0).a();
        }

        public final void b() {
            List<Throwable> list = this.B;
            if (list != null) {
                this.f16198b.a(list);
            }
            this.B = null;
            for (com.bumptech.glide.load.data.d<Data> b10 : this.f16197a) {
                b10.b();
            }
        }

        public final void c(Exception exc) {
            List<Throwable> list = this.B;
            b1.b(list);
            list.add(exc);
            g();
        }

        public final void cancel() {
            this.C = true;
            for (com.bumptech.glide.load.data.d<Data> cancel : this.f16197a) {
                cancel.cancel();
            }
        }

        public final p4.a d() {
            return this.f16197a.get(0).d();
        }

        public final void e(j jVar, d.a<? super Data> aVar) {
            this.f16200d = jVar;
            this.f16201e = aVar;
            this.B = this.f16198b.b();
            this.f16197a.get(this.f16199c).e(jVar, this);
            if (this.C) {
                cancel();
            }
        }

        public final void f(Data data) {
            if (data != null) {
                this.f16201e.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (!this.C) {
                if (this.f16199c < this.f16197a.size() - 1) {
                    this.f16199c++;
                    e(this.f16200d, this.f16201e);
                    return;
                }
                b1.b(this.B);
                this.f16201e.c(new s("Fetch failed", new ArrayList(this.B)));
            }
        }
    }

    public q(ArrayList arrayList, c2.d dVar) {
        this.f16195a = arrayList;
        this.f16196b = dVar;
    }

    public final n.a<Data> a(Model model, int i8, int i10, h hVar) {
        n.a a10;
        List<n<Model, Data>> list = this.f16195a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        f fVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = list.get(i11);
            if (nVar.b(model) && (a10 = nVar.a(model, i8, i10, hVar)) != null) {
                arrayList.add(a10.f16190c);
                fVar = a10.f16188a;
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a<>(fVar, new a(arrayList, this.f16196b));
    }

    public final boolean b(Model model) {
        for (n<Model, Data> b10 : this.f16195a) {
            if (b10.b(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f16195a.toArray()) + '}';
    }
}
