package le;

import ag.g0;
import ag.s0;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import cb.b;
import com.quickkonnect.silencio.R;
import ff.m;
import java.io.IOException;
import java.util.List;
import jf.d;
import jf.f;
import lf.i;
import ne.c;
import rf.p;
import sf.j;

public final class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f11081a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f11082b;

    public static final class a extends i implements p<g0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public g0 f11083a;

        /* renamed from: b  reason: collision with root package name */
        public g0 f11084b;

        /* renamed from: c  reason: collision with root package name */
        public int f11085c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ f f11086d;

        /* renamed from: le.f$a$a  reason: collision with other inner class name */
        public static final class C0209a extends i implements p<g0, d<? super Intent>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public g0 f11087a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a f11088b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0209a(a aVar, d dVar) {
                super(2, dVar);
                this.f11088b = aVar;
            }

            public final d<m> create(Object obj, d<?> dVar) {
                j.f(dVar, "completion");
                C0209a aVar = new C0209a(this.f11088b, dVar);
                aVar.f11087a = (g0) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0209a) create(obj, (d) obj2)).invokeSuspend(m.f8717a);
            }

            public final Object invokeSuspend(Object obj) {
                b.J(obj);
                c cVar = this.f11088b.f11086d.f11081a.B0;
                if (cVar != null) {
                    return cVar.a();
                }
                return null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar, d dVar) {
            super(2, dVar);
            this.f11086d = fVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            j.f(dVar, "completion");
            a aVar = new a(this.f11086d, dVar);
            aVar.f11083a = (g0) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create(obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f11085c;
            if (i8 == 0) {
                b.J(obj);
                g0 g0Var = this.f11083a;
                kotlinx.coroutines.scheduling.b bVar = s0.f481b;
                C0209a aVar2 = new C0209a(this, (d) null);
                this.f11084b = g0Var;
                this.f11085c = 1;
                obj = b.M(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Intent intent = (Intent) obj;
            f fVar = this.f11086d;
            if (intent != null) {
                fVar.f11081a.startActivityForResult(intent, 257);
            } else {
                Toast.makeText(fVar.f11081a.o(), R.string.no_camera_exists, 0).show();
            }
            return m.f8717a;
        }
    }

    public f(e eVar, List list) {
        this.f11081a = eVar;
        this.f11082b = list;
    }

    public final void onClick(View view) {
        try {
            b.D(this.f11081a.f11061v0, (f.b) null, 0, new a(this, (d) null), 3);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }
}
