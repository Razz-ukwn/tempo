package td;

import ag.g0;
import android.content.SharedPreferences;
import cb.b;
import com.quickkonnect.silencio.ui.tabs.home.HomeViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import sf.j;
import yg.b0;
import zd.h;

@e(c = "com.quickkonnect.silencio.ui.tabs.home.HomeViewModel$isOnline$1", f = "HomeViewModel.kt", l = {45}, m = "invokeSuspend")
public final class k extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public HomeViewModel f15622a;

    /* renamed from: b  reason: collision with root package name */
    public int f15623b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f15624c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(HomeViewModel homeViewModel, d<? super k> dVar) {
        super(2, dVar);
        this.f15624c = homeViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new k(this.f15624c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        HomeViewModel homeViewModel;
        a aVar = a.f10464a;
        int i8 = this.f15623b;
        if (i8 == 0) {
            b.J(obj);
            HomeViewModel homeViewModel2 = this.f15624c;
            if (zd.a.g(homeViewModel2)) {
                SharedPreferences sharedPreferences = h.f17950a;
                if (sharedPreferences == null) {
                    j.l("prefs");
                    throw null;
                } else if (sharedPreferences.getBoolean("IS_LOGIN", false)) {
                    mc.a aVar2 = homeViewModel2.f7116h;
                    this.f15622a = homeViewModel2;
                    this.f15623b = 1;
                    Object a10 = aVar2.f11379a.a(this);
                    if (a10 == aVar) {
                        return aVar;
                    }
                    homeViewModel = homeViewModel2;
                    obj = a10;
                }
            }
            return m.f8717a;
        } else if (i8 == 1) {
            homeViewModel = this.f15622a;
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        homeViewModel.f((b0) obj);
        return m.f8717a;
    }
}
