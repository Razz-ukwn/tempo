package a1;

import androidx.compose.ui.platform.AndroidComposeView;
import b0.u;
import cb.d;
import rf.p;
import t.b3;
import t.n1;

public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    public final p<p<?>, n, o> f48a;

    /* renamed from: b  reason: collision with root package name */
    public final u<p<?>, b<?>> f49b = new u<>();

    public final class a implements n {

        /* renamed from: a  reason: collision with root package name */
        public final p<?> f50a = a.f15a;
    }

    public final class b<T extends o> {

        /* renamed from: a  reason: collision with root package name */
        public final T f51a;

        /* renamed from: b  reason: collision with root package name */
        public final n1 f52b = d.R(0, b3.f14997a);

        public b(T t2) {
            this.f51a = t2;
        }

        public final int a() {
            return ((Number) this.f52b.getValue()).intValue();
        }
    }

    public r(AndroidComposeView.g gVar) {
        this.f48a = gVar;
    }
}
