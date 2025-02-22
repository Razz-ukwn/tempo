package d2;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import com.quickkonnect.silencio.R;
import d2.i0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f7266a = false;

    /* renamed from: b  reason: collision with root package name */
    public static Method f7267b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f7268c = false;

    /* renamed from: d  reason: collision with root package name */
    public static Field f7269d;

    public interface a {
        boolean y(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        int indexOfKey;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = i0.s.f7232d;
            i0.s sVar = (i0.s) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (sVar == null) {
                sVar = new i0.s();
                view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
            }
            WeakReference<KeyEvent> weakReference2 = sVar.f7235c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                sVar.f7235c = new WeakReference<>(keyEvent);
                if (sVar.f7234b == null) {
                    sVar.f7234b = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = sVar.f7234b;
                if (keyEvent.getAction() != 1 || (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
                    weakReference = null;
                } else {
                    weakReference = sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !i0.g.b(view2)) {
                        return true;
                    }
                    i0.s.b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"LambdaLast"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(d2.o.a r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x000f
            boolean r7 = r7.y(r10)
            return r7
        L_0x000f:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0081
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L_0x0064
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L_0x0064
            if (r8 == 0) goto L_0x0064
            boolean r1 = f7266a
            if (r1 != 0) goto L_0x004c
            java.lang.Class r1 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x004a }
            f7267b = r1     // Catch:{ NoSuchMethodException -> 0x004a }
        L_0x004a:
            f7266a = r3
        L_0x004c:
            java.lang.reflect.Method r1 = f7267b
            if (r1 == 0) goto L_0x0061
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            r4[r0] = r10     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            if (r8 != 0) goto L_0x005b
            goto L_0x0061
        L_0x005b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            boolean r0 = r8.booleanValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
        L_0x0061:
            if (r0 == 0) goto L_0x0064
            goto L_0x0080
        L_0x0064:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x006b
            goto L_0x0080
        L_0x006b:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = d2.i0.c(r7, r10)
            if (r8 == 0) goto L_0x0076
            goto L_0x0080
        L_0x0076:
            if (r7 == 0) goto L_0x007c
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L_0x007c:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L_0x0080:
            return r3
        L_0x0081:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x00d4
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = f7268c
            if (r7 != 0) goto L_0x009a
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x0098 }
            f7269d = r7     // Catch:{ NoSuchFieldException -> 0x0098 }
            r7.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0098 }
        L_0x0098:
            f7268c = r3
        L_0x009a:
            java.lang.reflect.Field r7 = f7269d
            if (r7 == 0) goto L_0x00a5
            java.lang.Object r7 = r7.get(r9)     // Catch:{ IllegalAccessException -> 0x00a5 }
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch:{ IllegalAccessException -> 0x00a5 }
            goto L_0x00a6
        L_0x00a5:
            r7 = r2
        L_0x00a6:
            if (r7 == 0) goto L_0x00b3
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto L_0x00b3
            goto L_0x00d3
        L_0x00b3:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x00be
            goto L_0x00d3
        L_0x00be:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = d2.i0.c(r7, r10)
            if (r8 == 0) goto L_0x00c9
            goto L_0x00d3
        L_0x00c9:
            if (r7 == 0) goto L_0x00cf
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L_0x00cf:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L_0x00d3:
            return r3
        L_0x00d4:
            if (r8 == 0) goto L_0x00dc
            boolean r8 = d2.i0.c(r8, r10)
            if (r8 != 0) goto L_0x00e2
        L_0x00dc:
            boolean r7 = r7.y(r10)
            if (r7 == 0) goto L_0x00e3
        L_0x00e2:
            r0 = r3
        L_0x00e3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.o.b(d2.o$a, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
