package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import w1.a;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final CheckedTextView f1008a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f1009b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f1010c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1011d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1012e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1013f;

    public h(CheckedTextView checkedTextView) {
        this.f1008a = checkedTextView;
    }

    public final void a() {
        CheckedTextView checkedTextView = this.f1008a;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.f1011d || this.f1012e) {
            Drawable mutate = checkMarkDrawable.mutate();
            if (this.f1011d) {
                a.b.h(mutate, this.f1009b);
            }
            if (this.f1012e) {
                a.b.i(mutate, this.f1010c);
            }
            if (mutate.isStateful()) {
                mutate.setState(checkedTextView.getDrawableState());
            }
            checkedTextView.setCheckMarkDrawable(mutate);
        }
    }
}
