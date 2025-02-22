package e;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.d;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.f;

public class o {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f7685b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f7686c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f7687d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f7688e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f7689f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f7690g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final f<String, Constructor<? extends View>> f7691h = new f<>();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f7692a = new Object[2];

    public static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final View f7693a;

        /* renamed from: b  reason: collision with root package name */
        public final String f7694b;

        /* renamed from: c  reason: collision with root package name */
        public Method f7695c;

        /* renamed from: d  reason: collision with root package name */
        public Context f7696d;

        public a(View view, String str) {
            this.f7693a = view;
            this.f7694b = str;
        }

        public final void onClick(View view) {
            String str;
            Method method;
            if (this.f7695c == null) {
                View view2 = this.f7693a;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.f7694b;
                    if (context != null) {
                        try {
                            if (!context.isRestricted() && (method = context.getClass().getMethod(str2, new Class[]{View.class})) != null) {
                                this.f7695c = method;
                                this.f7696d = context;
                                break;
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                        context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                    } else {
                        int id2 = view2.getId();
                        if (id2 == -1) {
                            str = "";
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                        }
                        StringBuilder c3 = d.c("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                        c3.append(view2.getClass());
                        c3.append(str);
                        throw new IllegalStateException(c3.toString());
                    }
                }
            }
            try {
                this.f7695c.invoke(this.f7696d, new Object[]{view});
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public androidx.appcompat.widget.d a(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public androidx.appcompat.widget.f c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    public s d(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    public d0 e(Context context, AttributeSet attributeSet) {
        return new d0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        f<String, Constructor<? extends View>> fVar = f7691h;
        Constructor<? extends U> orDefault = fVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f7685b);
            fVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return (View) orDefault.newInstance(this.f7692a);
    }

    public final void g(TextView textView, String str) {
        if (textView == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
