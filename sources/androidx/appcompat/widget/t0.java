package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import java.lang.reflect.Method;

public final class t0 extends p0 implements s0 {
    public static final Method Z;
    public s0 Y;

    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    public static class c extends k0 {
        public final int I;
        public final int J;
        public s0 K;
        public h L;

        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.I = 21;
                this.J = 22;
                return;
            }
            this.I = 22;
            this.J = 21;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
            r2 = (r2 = pointToPosition((int) r5.getX(), (int) r5.getY())) - r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onHoverEvent(android.view.MotionEvent r5) {
            /*
                r4 = this;
                androidx.appcompat.widget.s0 r0 = r4.K
                if (r0 == 0) goto L_0x005a
                android.widget.ListAdapter r0 = r4.getAdapter()
                boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
                if (r1 == 0) goto L_0x0019
                android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
                int r1 = r0.getHeadersCount()
                android.widget.ListAdapter r0 = r0.getWrappedAdapter()
                androidx.appcompat.view.menu.e r0 = (androidx.appcompat.view.menu.e) r0
                goto L_0x001c
            L_0x0019:
                androidx.appcompat.view.menu.e r0 = (androidx.appcompat.view.menu.e) r0
                r1 = 0
            L_0x001c:
                int r2 = r5.getAction()
                r3 = 10
                if (r2 == r3) goto L_0x0043
                float r2 = r5.getX()
                int r2 = (int) r2
                float r3 = r5.getY()
                int r3 = (int) r3
                int r2 = r4.pointToPosition(r2, r3)
                r3 = -1
                if (r2 == r3) goto L_0x0043
                int r2 = r2 - r1
                if (r2 < 0) goto L_0x0043
                int r1 = r0.getCount()
                if (r2 >= r1) goto L_0x0043
                androidx.appcompat.view.menu.h r1 = r0.getItem(r2)
                goto L_0x0044
            L_0x0043:
                r1 = 0
            L_0x0044:
                androidx.appcompat.view.menu.h r2 = r4.L
                if (r2 == r1) goto L_0x005a
                androidx.appcompat.view.menu.f r0 = r0.f716a
                if (r2 == 0) goto L_0x0051
                androidx.appcompat.widget.s0 r3 = r4.K
                r3.g(r0, r2)
            L_0x0051:
                r4.L = r1
                if (r1 == 0) goto L_0x005a
                androidx.appcompat.widget.s0 r2 = r4.K
                r2.d(r0, r1)
            L_0x005a:
                boolean r5 = super.onHoverEvent(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.c.onHoverEvent(android.view.MotionEvent):boolean");
        }

        public final boolean onKeyDown(int i8, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i8 == this.I) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i8 != this.J) {
                return super.onKeyDown(i8, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                (adapter instanceof HeaderViewListAdapter ? (e) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (e) adapter).f716a.c(false);
                return true;
            }
        }

        public void setHoverListener(s0 s0Var) {
            this.K = s0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Z = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public t0(Context context, int i8, int i10) {
        super(context, (AttributeSet) null, i8, i10);
    }

    public final void d(f fVar, h hVar) {
        s0 s0Var = this.Y;
        if (s0Var != null) {
            s0Var.d(fVar, hVar);
        }
    }

    public final void g(f fVar, MenuItem menuItem) {
        s0 s0Var = this.Y;
        if (s0Var != null) {
            s0Var.g(fVar, menuItem);
        }
    }

    public final k0 q(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
