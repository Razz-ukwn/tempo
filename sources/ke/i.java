package ke;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.m;
import com.quickkonnect.silencio.R;
import droidninja.filepicker.views.SmoothCheckBox;
import java.util.ArrayList;
import java.util.List;
import je.e;
import me.d;
import sf.j;

public final class i extends n<a, d> {
    public int B;
    public View.OnClickListener C;
    public final Context D;
    public final m E;
    public final boolean F;
    public final a G;

    public static final class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final SmoothCheckBox f10447u;

        /* renamed from: v  reason: collision with root package name */
        public final ImageView f10448v;

        /* renamed from: w  reason: collision with root package name */
        public final ImageView f10449w;

        /* renamed from: x  reason: collision with root package name */
        public final View f10450x;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.checkbox);
            if (findViewById != null) {
                this.f10447u = (SmoothCheckBox) findViewById;
                View findViewById2 = view.findViewById(R.id.iv_photo);
                if (findViewById2 != null) {
                    this.f10448v = (ImageView) findViewById2;
                    View findViewById3 = view.findViewById(R.id.video_icon);
                    if (findViewById3 != null) {
                        this.f10449w = (ImageView) findViewById3;
                        View findViewById4 = view.findViewById(R.id.transparent_bg);
                        j.e(findViewById4, "itemView.findViewById(R.id.transparent_bg)");
                        this.f10450x = findViewById4;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            throw new NullPointerException("null cannot be cast to non-null type droidninja.filepicker.views.SmoothCheckBox");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Context context, m mVar, List list, ArrayList arrayList, boolean z10, a aVar) {
        super(list, arrayList);
        j.f(mVar, "glide");
        j.f(list, "medias");
        j.f(arrayList, "selectedPaths");
        this.D = context;
        this.E = mVar;
        this.F = z10;
        this.G = aVar;
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            this.B = displayMetrics.widthPixels / 3;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public static final void t(a aVar, i iVar, d dVar) {
        iVar.getClass();
        if (e.f9993a == 1) {
            e.b(dVar.B, 1);
            a aVar2 = iVar.G;
            if (aVar2 != null) {
                aVar2.a();
            }
        } else if (aVar.f10447u.O || e.e()) {
            SmoothCheckBox smoothCheckBox = aVar.f10447u;
            smoothCheckBox.b(!smoothCheckBox.O);
        }
    }

    public final int d() {
        return this.F ? this.f10462d.size() + 1 : this.f10462d.size();
    }

    public final int f(int i8) {
        return (!this.F || i8 != 0) ? 101 : 100;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(androidx.recyclerview.widget.RecyclerView.b0 r13, int r14) {
        /*
            r12 = this;
            ke.i$a r13 = (ke.i.a) r13
            int r0 = r12.f(r14)
            r1 = 101(0x65, float:1.42E-43)
            r2 = 8
            android.view.View r3 = r13.f2440a
            android.widget.ImageView r4 = r13.f10449w
            android.widget.ImageView r5 = r13.f10448v
            droidninja.filepicker.views.SmoothCheckBox r6 = r13.f10447u
            if (r0 != r1) goto L_0x00c1
            java.util.List<? extends T> r0 = r12.f10462d
            boolean r1 = r12.F
            if (r1 == 0) goto L_0x001c
            int r14 = r14 + -1
        L_0x001c:
            java.lang.Object r14 = r0.get(r14)
            me.d r14 = (me.d) r14
            android.content.Context r0 = r5.getContext()
            r1 = 0
            if (r0 != 0) goto L_0x002a
            goto L_0x003d
        L_0x002a:
            boolean r7 = r0 instanceof android.app.Activity
            if (r7 != 0) goto L_0x002f
            goto L_0x003d
        L_0x002f:
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r7 = r0.isDestroyed()
            if (r7 != 0) goto L_0x003f
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x003f
        L_0x003d:
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = r1
        L_0x0040:
            if (r0 == 0) goto L_0x0076
            android.net.Uri r0 = r14.B
            com.bumptech.glide.m r7 = r12.E
            r7.getClass()
            com.bumptech.glide.l r8 = new com.bumptech.glide.l
            java.lang.Class<android.graphics.drawable.Drawable> r9 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.b r10 = r7.f4127a
            android.content.Context r11 = r7.f4128b
            r8.<init>(r10, r7, r9, r11)
            com.bumptech.glide.l r0 = r8.E(r0)
            h5.g r7 = h5.g.x()
            int r8 = r12.B
            h5.a r7 = r7.k(r8, r8)
            h5.g r7 = (h5.g) r7
            r8 = 2131165717(0x7f070215, float:1.794566E38)
            h5.a r7 = r7.l(r8)
            com.bumptech.glide.l r0 = r0.y(r7)
            com.bumptech.glide.l r0 = r0.G()
            r0.C(r5)
        L_0x0076:
            int r0 = r14.C
            r5 = 3
            if (r0 != r5) goto L_0x007f
            r4.setVisibility(r1)
            goto L_0x0082
        L_0x007f:
            r4.setVisibility(r2)
        L_0x0082:
            ke.j r0 = new ke.j
            r0.<init>(r13, r12, r14)
            r3.setOnClickListener(r0)
            r6.setVisibility(r2)
            r0 = 0
            r6.setOnCheckedChangeListener(r0)
            ke.k r0 = new ke.k
            r0.<init>(r13, r12, r14)
            r6.setOnClickListener(r0)
            boolean r0 = r12.p(r14)
            r6.setChecked(r0)
            boolean r0 = r12.p(r14)
            if (r0 == 0) goto L_0x00a8
            r0 = r1
            goto L_0x00a9
        L_0x00a8:
            r0 = r2
        L_0x00a9:
            android.view.View r3 = r13.f10450x
            r3.setVisibility(r0)
            boolean r0 = r12.p(r14)
            if (r0 == 0) goto L_0x00b5
            r2 = r1
        L_0x00b5:
            r6.setVisibility(r2)
            ke.l r0 = new ke.l
            r0.<init>(r13, r12, r14)
            r6.setOnCheckedChangeListener(r0)
            goto L_0x00d4
        L_0x00c1:
            int r13 = je.e.f9993a
            r13 = 2131165639(0x7f0701c7, float:1.79455E38)
            r5.setImageResource(r13)
            r6.setVisibility(r2)
            android.view.View$OnClickListener r13 = r12.C
            r3.setOnClickListener(r13)
            r4.setVisibility(r2)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.i.i(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    public final RecyclerView.b0 j(RecyclerView recyclerView, int i8) {
        j.f(recyclerView, "parent");
        View inflate = LayoutInflater.from(this.D).inflate(R.layout.item_photo_layout, recyclerView, false);
        j.e(inflate, "itemView");
        return new a(inflate);
    }
}
