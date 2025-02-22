package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import cb.e;
import com.quickkonnect.silencio.R;
import e.m;
import java.lang.ref.WeakReference;

public final class AlertController {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public int E = -1;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final c K;
    public final a L = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f633a;

    /* renamed from: b  reason: collision with root package name */
    public final m f634b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f635c;

    /* renamed from: d  reason: collision with root package name */
    public final int f636d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f637e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f638f;

    /* renamed from: g  reason: collision with root package name */
    public RecycleListView f639g;

    /* renamed from: h  reason: collision with root package name */
    public View f640h;

    /* renamed from: i  reason: collision with root package name */
    public int f641i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f642j = false;

    /* renamed from: k  reason: collision with root package name */
    public Button f643k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f644l;
    public Message m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f645n;

    /* renamed from: o  reason: collision with root package name */
    public Button f646o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f647p;

    /* renamed from: q  reason: collision with root package name */
    public Message f648q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f649r;

    /* renamed from: s  reason: collision with root package name */
    public Button f650s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f651t;

    /* renamed from: u  reason: collision with root package name */
    public Message f652u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f653v;

    /* renamed from: w  reason: collision with root package name */
    public NestedScrollView f654w;

    /* renamed from: x  reason: collision with root package name */
    public int f655x = 0;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f656y;

    /* renamed from: z  reason: collision with root package name */
    public ImageView f657z;

    public static class RecycleListView extends ListView {

        /* renamed from: a  reason: collision with root package name */
        public final int f658a;

        /* renamed from: b  reason: collision with root package name */
        public final int f659b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.Q);
            this.f659b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f658a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r3 = r0.f652u;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f643k
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.m
                if (r1 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x000f:
                android.widget.Button r1 = r0.f646o
                if (r3 != r1) goto L_0x001c
                android.os.Message r1 = r0.f648q
                if (r1 == 0) goto L_0x001c
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x001c:
                android.widget.Button r1 = r0.f650s
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f652u
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                r3 = 1
                e.m r1 = r0.f634b
                androidx.appcompat.app.AlertController$c r0 = r0.K
                android.os.Message r3 = r0.obtainMessage(r3, r1)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f661a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f662b;

        /* renamed from: c  reason: collision with root package name */
        public Drawable f663c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f664d;

        /* renamed from: e  reason: collision with root package name */
        public View f665e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f666f;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f667g;

        /* renamed from: h  reason: collision with root package name */
        public DialogInterface.OnClickListener f668h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f669i;

        /* renamed from: j  reason: collision with root package name */
        public DialogInterface.OnClickListener f670j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f671k;

        /* renamed from: l  reason: collision with root package name */
        public DialogInterface.OnKeyListener f672l;
        public ListAdapter m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f673n;

        /* renamed from: o  reason: collision with root package name */
        public int f674o;

        /* renamed from: p  reason: collision with root package name */
        public View f675p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f676q;

        /* renamed from: r  reason: collision with root package name */
        public int f677r = -1;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f661a = contextThemeWrapper;
            this.f671k = true;
            this.f662b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<DialogInterface> f678a;

        public c(DialogInterface dialogInterface) {
            this.f678a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == -3 || i8 == -2 || i8 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f678a.get(), message.what);
            } else if (i8 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i8) {
            super(context, i8, 16908308, (Object[]) null);
        }

        public final long getItemId(int i8) {
            return (long) i8;
        }

        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, m mVar, Window window) {
        this.f633a = context;
        this.f634b = mVar;
        this.f635c = window;
        this.K = new c(mVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, e.B, R.attr.alertDialogStyle, 0);
        this.F = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.G = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.H = obtainStyledAttributes.getResourceId(7, 0);
        this.I = obtainStyledAttributes.getResourceId(3, 0);
        this.J = obtainStyledAttributes.getBoolean(6, true);
        this.f636d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        mVar.e().t(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i8, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.K.obtainMessage(i8, onClickListener) : null;
        if (i8 == -3) {
            this.f651t = charSequence;
            this.f652u = obtainMessage;
            this.f653v = null;
        } else if (i8 == -2) {
            this.f647p = charSequence;
            this.f648q = obtainMessage;
            this.f649r = null;
        } else if (i8 == -1) {
            this.f644l = charSequence;
            this.m = obtainMessage;
            this.f645n = null;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
