package a9;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.activity.j;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.a;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import e2.d;
import e2.i;
import j6.m;
import java.util.WeakHashMap;

public final class n extends o {

    /* renamed from: e  reason: collision with root package name */
    public final int f151e;

    /* renamed from: f  reason: collision with root package name */
    public final int f152f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f153g;

    /* renamed from: h  reason: collision with root package name */
    public AutoCompleteTextView f154h;

    /* renamed from: i  reason: collision with root package name */
    public final h f155i = new h(this, 0);

    /* renamed from: j  reason: collision with root package name */
    public final i f156j = new i(this);

    /* renamed from: k  reason: collision with root package name */
    public final m f157k = new m(this);

    /* renamed from: l  reason: collision with root package name */
    public boolean f158l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f159n;

    /* renamed from: o  reason: collision with root package name */
    public long f160o = Long.MAX_VALUE;

    /* renamed from: p  reason: collision with root package name */
    public AccessibilityManager f161p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f162q;

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f163r;

    public n(a aVar) {
        super(aVar);
        this.f152f = n8.a.c(aVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f151e = n8.a.c(aVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f153g = n8.a.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, v7.a.f16228a);
    }

    public final void a() {
        if (this.f161p.isTouchExplorationEnabled()) {
            if ((this.f154h.getInputType() != 0) && !this.f167d.hasFocus()) {
                this.f154h.dismissDropDown();
            }
        }
        this.f154h.post(new j(this, 10));
    }

    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    public final View.OnFocusChangeListener e() {
        return this.f156j;
    }

    public final View.OnClickListener f() {
        return this.f155i;
    }

    public final d h() {
        return this.f157k;
    }

    public final boolean i(int i8) {
        return i8 != 0;
    }

    public final boolean j() {
        return this.f158l;
    }

    public final boolean l() {
        return this.f159n;
    }

    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f154h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new k(this));
            this.f154h.setOnDismissListener(new l(this));
            boolean z10 = false;
            this.f154h.setThreshold(0);
            TextInputLayout textInputLayout = this.f164a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() != 0) {
                z10 = true;
            }
            if (!z10 && this.f161p.isTouchExplorationEnabled()) {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.d.s(this.f167d, 2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final void n(i iVar) {
        if (!(this.f154h.getInputType() != 0)) {
            iVar.j(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f7779a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText((CharSequence) null);
        }
    }

    public final void o(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.f161p.isEnabled()) {
            if (!(this.f154h.getInputType() != 0)) {
                u();
                this.m = true;
                this.f160o = System.currentTimeMillis();
            }
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.f153g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) this.f152f);
        ofFloat.addUpdateListener(new j(this));
        this.f163r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) this.f151e);
        ofFloat2.addUpdateListener(new j(this));
        this.f162q = ofFloat2;
        ofFloat2.addListener(new m(this));
        this.f161p = (AccessibilityManager) this.f166c.getSystemService("accessibility");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f154h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            this.f154h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
    }

    public final void t(boolean z10) {
        if (this.f159n != z10) {
            this.f159n = z10;
            this.f163r.cancel();
            this.f162q.start();
        }
    }

    public final void u() {
        if (this.f154h != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f160o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                this.m = false;
            }
            if (!this.m) {
                t(!this.f159n);
                if (this.f159n) {
                    this.f154h.requestFocus();
                    this.f154h.showDropDown();
                    return;
                }
                this.f154h.dismissDropDown();
                return;
            }
            this.m = false;
        }
    }
}
