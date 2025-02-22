package ke;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.m;
import com.quickkonnect.silencio.R;
import java.util.List;
import me.e;
import sf.j;

public final class f extends RecyclerView.e<b> {
    public final Context B;
    public final m C;
    public List<e> D;
    public final boolean E;

    /* renamed from: d  reason: collision with root package name */
    public int f10438d;

    /* renamed from: e  reason: collision with root package name */
    public a f10439e;

    public interface a {
        void e(e eVar);

        void h();
    }

    public static final class b extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final ImageView f10440u;

        /* renamed from: v  reason: collision with root package name */
        public final TextView f10441v;

        /* renamed from: w  reason: collision with root package name */
        public final TextView f10442w;

        /* renamed from: x  reason: collision with root package name */
        public final View f10443x;

        public b(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.iv_photo);
            if (findViewById != null) {
                this.f10440u = (ImageView) findViewById;
                View findViewById2 = view.findViewById(R.id.folder_title);
                if (findViewById2 != null) {
                    this.f10441v = (TextView) findViewById2;
                    View findViewById3 = view.findViewById(R.id.folder_count);
                    if (findViewById3 != null) {
                        this.f10442w = (TextView) findViewById3;
                        View findViewById4 = view.findViewById(R.id.bottomOverlay);
                        j.e(findViewById4, "itemView.findViewById(R.id.bottomOverlay)");
                        this.f10443x = findViewById4;
                        j.e(view.findViewById(R.id.transparent_bg), "itemView.findViewById(R.id.transparent_bg)");
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
    }

    public f(Context context, m mVar, List<e> list, boolean z10) {
        j.f(mVar, "glide");
        j.f(list, "items");
        this.B = context;
        this.C = mVar;
        this.D = list;
        this.E = z10;
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            this.f10438d = displayMetrics.widthPixels / 3;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public final int d() {
        return this.E ? this.D.size() + 1 : this.D.size();
    }

    public final int f(int i8) {
        return (!this.E || i8 != 0) ? 101 : 100;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(androidx.recyclerview.widget.RecyclerView.b0 r11, int r12) {
        /*
            r10 = this;
            ke.f$b r11 = (ke.f.b) r11
            int r0 = r10.f(r12)
            r1 = 101(0x65, float:1.42E-43)
            android.view.View r2 = r11.f10443x
            android.view.View r3 = r11.f2440a
            android.widget.ImageView r4 = r11.f10440u
            if (r0 != r1) goto L_0x00a9
            java.util.List<me.e> r0 = r10.D
            boolean r1 = r10.E
            if (r1 == 0) goto L_0x0018
            int r12 = r12 + -1
        L_0x0018:
            java.lang.Object r12 = r0.get(r12)
            me.e r12 = (me.e) r12
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r0 != 0) goto L_0x0026
            goto L_0x0039
        L_0x0026:
            boolean r5 = r0 instanceof android.app.Activity
            if (r5 != 0) goto L_0x002b
            goto L_0x0039
        L_0x002b:
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r5 = r0.isDestroyed()
            if (r5 != 0) goto L_0x003b
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x003b
        L_0x0039:
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = r1
        L_0x003c:
            if (r0 == 0) goto L_0x0087
            java.util.List<me.d> r0 = r12.B
            int r5 = r0.size()
            if (r5 <= 0) goto L_0x004f
            java.lang.Object r0 = r0.get(r1)
            me.d r0 = (me.d) r0
            android.net.Uri r0 = r0.B
            goto L_0x0055
        L_0x004f:
            android.net.Uri r0 = r12.f11475c
            if (r0 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            com.bumptech.glide.m r5 = r10.C
            r5.getClass()
            com.bumptech.glide.l r6 = new com.bumptech.glide.l
            java.lang.Class<android.graphics.drawable.Drawable> r7 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.b r8 = r5.f4127a
            android.content.Context r9 = r5.f4128b
            r6.<init>(r8, r5, r7, r9)
            com.bumptech.glide.l r0 = r6.E(r0)
            h5.g r5 = h5.g.x()
            int r6 = r10.f10438d
            h5.a r5 = r5.k(r6, r6)
            h5.g r5 = (h5.g) r5
            r6 = 2131165717(0x7f070215, float:1.794566E38)
            h5.a r5 = r5.l(r6)
            com.bumptech.glide.l r0 = r0.y(r5)
            com.bumptech.glide.l r0 = r0.G()
            r0.C(r4)
        L_0x0087:
            java.lang.String r0 = r12.f11476d
            android.widget.TextView r4 = r11.f10441v
            r4.setText(r0)
            java.util.List<me.d> r0 = r12.B
            int r0 = r0.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.widget.TextView r11 = r11.f10442w
            r11.setText(r0)
            ke.g r11 = new ke.g
            r11.<init>(r10, r12)
            r3.setOnClickListener(r11)
            r2.setVisibility(r1)
            goto L_0x00be
        L_0x00a9:
            int r11 = je.e.f9993a
            r11 = 2131165639(0x7f0701c7, float:1.79455E38)
            r4.setImageResource(r11)
            ke.h r11 = new ke.h
            r11.<init>(r10)
            r3.setOnClickListener(r11)
            r11 = 8
            r2.setVisibility(r11)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.f.i(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    public final RecyclerView.b0 j(RecyclerView recyclerView, int i8) {
        j.f(recyclerView, "parent");
        View inflate = LayoutInflater.from(this.B).inflate(R.layout.item_folder_layout, recyclerView, false);
        j.e(inflate, "itemView");
        return new b(inflate);
    }
}
