package a9;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.activity.b;
import com.quickkonnect.silencio.R;
import t8.a;

public final class e extends o {

    /* renamed from: e  reason: collision with root package name */
    public final int f136e;

    /* renamed from: f  reason: collision with root package name */
    public final int f137f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f138g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeInterpolator f139h;

    /* renamed from: i  reason: collision with root package name */
    public EditText f140i;

    /* renamed from: j  reason: collision with root package name */
    public final a f141j = new a(this, 1);

    /* renamed from: k  reason: collision with root package name */
    public final b f142k = new b(this);

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f143l;
    public ValueAnimator m;

    public e(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f136e = n8.a.c(aVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f137f = n8.a.c(aVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f138g = n8.a.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, v7.a.f16228a);
        this.f139h = n8.a.d(aVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, v7.a.f16231d);
    }

    public final void a() {
        if (this.f165b.L == null) {
            t(u());
        }
    }

    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    public final View.OnFocusChangeListener e() {
        return this.f142k;
    }

    public final View.OnClickListener f() {
        return this.f141j;
    }

    public final View.OnFocusChangeListener g() {
        return this.f142k;
    }

    public final void m(EditText editText) {
        this.f140i = editText;
        this.f164a.setEndIconVisible(u());
    }

    public final void p(boolean z10) {
        if (this.f165b.L != null) {
            t(z10);
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.f139h);
        ofFloat.setDuration((long) this.f137f);
        ofFloat.addUpdateListener(new a(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.f138g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i8 = this.f136e;
        ofFloat2.setDuration((long) i8);
        ofFloat2.addUpdateListener(new c8.a(this, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f143l = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f143l.addListener(new c(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration((long) i8);
        ofFloat3.addUpdateListener(new c8.a(this, 1));
        this.m = ofFloat3;
        ofFloat3.addListener(new d(this));
    }

    public final void s() {
        EditText editText = this.f140i;
        if (editText != null) {
            editText.post(new b(this, 8));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = this.f165b.c() == z10;
        if (z10 && !this.f143l.isRunning()) {
            this.m.cancel();
            this.f143l.start();
            if (z11) {
                this.f143l.end();
            }
        } else if (!z10) {
            this.f143l.cancel();
            this.m.start();
            if (z11) {
                this.m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f140i;
        return editText != null && (editText.hasFocus() || this.f167d.hasFocus()) && this.f140i.getText().length() > 0;
    }
}
