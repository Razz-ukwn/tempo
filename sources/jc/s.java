package jc;

import cb.b;
import com.quickkonnect.silencio.MainActivity;
import com.quickkonnect.silencio.MainViewModel;
import e9.a;
import ff.m;
import jf.d;
import jf.f;
import rf.l;
import sf.k;

public final class s extends k implements l<a, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f9968a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(MainActivity mainActivity) {
        super(1);
        this.f9968a = mainActivity;
    }

    public final Object invoke(Object obj) {
        a aVar = (a) obj;
        if (aVar.f7874b == 2) {
            int i8 = MainActivity.f6650h0;
            MainViewModel mainViewModel = (MainViewModel) this.f9968a.f6653c0.getValue();
            mainViewModel.getClass();
            b.D(gc.b.o(mainViewModel), (f.b) null, 0, new y(mainViewModel, aVar.f7873a, (d<? super y>) null), 3);
        }
        return m.f8717a;
    }
}
