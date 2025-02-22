package e2;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f7775a;

    /* renamed from: b  reason: collision with root package name */
    public final i f7776b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7777c;

    public a(int i8, i iVar, int i10) {
        this.f7775a = i8;
        this.f7776b = iVar;
        this.f7777c = i10;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f7775a);
        this.f7776b.f7779a.performAction(this.f7777c, bundle);
    }
}
