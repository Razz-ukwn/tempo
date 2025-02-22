package v4;

import ag.b1;
import com.bumptech.glide.load.data.d;
import java.util.Collections;
import java.util.List;
import p4.f;
import p4.h;

public interface n<Model, Data> {

    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final f f16188a;

        /* renamed from: b  reason: collision with root package name */
        public final List<f> f16189b;

        /* renamed from: c  reason: collision with root package name */
        public final d<Data> f16190c;

        public a() {
            throw null;
        }

        public a(f fVar, d<Data> dVar) {
            List<f> emptyList = Collections.emptyList();
            b1.b(fVar);
            this.f16188a = fVar;
            b1.b(emptyList);
            this.f16189b = emptyList;
            b1.b(dVar);
            this.f16190c = dVar;
        }
    }

    a<Data> a(Model model, int i8, int i10, h hVar);

    boolean b(Model model);
}
