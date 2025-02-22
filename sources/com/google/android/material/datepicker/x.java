package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.widget.BaseAdapter;
import android.widget.TextView;
import c2.c;
import com.quickkonnect.silencio.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public final class x extends BaseAdapter {
    public static final int C = f0.d((Calendar) null).getMaximum(4);
    public static final int D = ((f0.d((Calendar) null).getMaximum(7) + f0.d((Calendar) null).getMaximum(5)) - 1);
    public final f B;

    /* renamed from: a  reason: collision with root package name */
    public final w f5931a;

    /* renamed from: b  reason: collision with root package name */
    public final d<?> f5932b;

    /* renamed from: c  reason: collision with root package name */
    public Collection<Long> f5933c;

    /* renamed from: d  reason: collision with root package name */
    public c f5934d;

    /* renamed from: e  reason: collision with root package name */
    public final a f5935e;

    public x(w wVar, d<?> dVar, a aVar, f fVar) {
        this.f5931a = wVar;
        this.f5932b = dVar;
        this.f5935e = aVar;
        this.B = fVar;
        this.f5933c = dVar.o();
    }

    public final int b() {
        int i8 = this.f5935e.f5848e;
        w wVar = this.f5931a;
        Calendar calendar = wVar.f5926a;
        int i10 = calendar.get(7);
        if (i8 <= 0) {
            i8 = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - i8;
        return i11 < 0 ? i11 + wVar.f5929d : i11;
    }

    /* renamed from: c */
    public final Long getItem(int i8) {
        if (i8 < b()) {
            return null;
        }
        int b10 = b();
        w wVar = this.f5931a;
        if (i8 > (b10 + wVar.f5930e) - 1) {
            return null;
        }
        Calendar b11 = f0.b(wVar.f5926a);
        b11.set(5, (i8 - b()) + 1);
        return Long.valueOf(b11.getTimeInMillis());
    }

    public final void d(TextView textView, long j10, int i8) {
        String str;
        b bVar;
        boolean z10;
        if (textView != null) {
            Context context = textView.getContext();
            boolean z11 = true;
            boolean z12 = f0.c().getTimeInMillis() == j10;
            d<?> dVar = this.f5932b;
            for (c<Long, Long> cVar : dVar.g()) {
                cVar.getClass();
            }
            for (c<Long, Long> cVar2 : dVar.g()) {
                cVar2.getClass();
            }
            Calendar c3 = f0.c();
            Calendar d10 = f0.d((Calendar) null);
            d10.setTimeInMillis(j10);
            if (c3.get(1) == d10.get(1)) {
                DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", Locale.getDefault());
                instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                str = instanceForSkeleton.format(new Date(j10));
            } else {
                DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", Locale.getDefault());
                instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
                str = instanceForSkeleton2.format(new Date(j10));
            }
            if (z12) {
                str = String.format(context.getString(R.string.mtrl_picker_today_description), new Object[]{str});
            }
            textView.setContentDescription(str);
            if (this.f5935e.f5846c.k(j10)) {
                textView.setEnabled(true);
                Iterator<Long> it = dVar.o().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    if (f0.a(j10) == f0.a(it.next().longValue())) {
                        z10 = true;
                        break;
                    }
                }
                textView.setSelected(z10);
                if (z10) {
                    bVar = this.f5934d.f5864b;
                } else {
                    if (f0.c().getTimeInMillis() != j10) {
                        z11 = false;
                    }
                    bVar = z11 ? this.f5934d.f5865c : this.f5934d.f5863a;
                }
            } else {
                textView.setEnabled(false);
                bVar = this.f5934d.f5869g;
            }
            if (this.B == null || i8 == -1) {
                bVar.b(textView);
                return;
            }
            int i10 = this.f5931a.f5928c;
            bVar.b(textView);
            textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setContentDescription(str);
        }
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j10) {
        w c3 = w.c(j10);
        w wVar = this.f5931a;
        if (c3.equals(wVar)) {
            Calendar b10 = f0.b(wVar.f5926a);
            b10.setTimeInMillis(j10);
            int i8 = b10.get(5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter().b() + (i8 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j10, i8);
        }
    }

    public final int getCount() {
        return D;
    }

    public final long getItemId(int i8) {
        return (long) (i8 / this.f5931a.f5929d);
    }

    /* JADX WARNING: type inference failed for: r7v9, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            com.google.android.material.datepicker.c r1 = r5.f5934d
            if (r1 != 0) goto L_0x000f
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r5.f5934d = r1
        L_0x000f:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0027
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131493006(0x7f0c008e, float:1.860948E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x005d
            com.google.android.material.datepicker.w r8 = r5.f5931a
            int r2 = r8.f5930e
            if (r7 < r2) goto L_0x0036
            goto L_0x005d
        L_0x0036:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x0066
        L_0x005d:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L_0x0066:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x006d
            goto L_0x0074
        L_0x006d:
            long r1 = r6.longValue()
            r5.d(r0, r1, r7)
        L_0x0074:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.x.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean hasStableIds() {
        return true;
    }
}
