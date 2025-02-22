package yc;

import android.content.SharedPreferences;
import android.view.View;
import b3.a;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.auth.onboarding.OnBoardingFragment;
import ff.m;
import rf.l;
import sf.j;
import sf.k;
import zd.h;

public final class b extends k implements l<View, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OnBoardingFragment f17334a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(OnBoardingFragment onBoardingFragment) {
        super(1);
        this.f17334a = onBoardingFragment;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        SharedPreferences.Editor editor = h.f17951b;
        if (editor != null) {
            editor.putBoolean("IS_INTRO_COMPLETE", true);
            SharedPreferences.Editor editor2 = h.f17951b;
            if (editor2 != null) {
                editor2.commit();
                ag.m.c(this.f17334a).n(new a(R.id.action_onBoardingFragment_to_codeBottomSheet2));
                return m.f8717a;
            }
            j.l("editor");
            throw null;
        }
        j.l("editor");
        throw null;
    }
}
