package o1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.activity.result.d;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import j0.t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import q.g;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12103a = false;

    /* renamed from: b  reason: collision with root package name */
    public final String f12104b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12105c;

    /* renamed from: d  reason: collision with root package name */
    public int f12106d;

    /* renamed from: e  reason: collision with root package name */
    public float f12107e;

    /* renamed from: f  reason: collision with root package name */
    public String f12108f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12109g;

    /* renamed from: h  reason: collision with root package name */
    public int f12110h;

    public a(String str, int i8, Object obj, boolean z10) {
        this.f12104b = str;
        this.f12105c = i8;
        this.f12103a = z10;
        c(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        Object valueOf;
        Object string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), gf.B);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i8 = 0;
        boolean z10 = false;
        Object obj = null;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            int i11 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i8 = 6;
            } else {
                int i12 = 3;
                if (index == 3) {
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i12 = 4;
                    if (index == 2) {
                        string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i12 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i8 = 2;
                            } else {
                                if (index == 6) {
                                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    string = obtainStyledAttributes.getString(index);
                                } else {
                                    i11 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        valueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i8 = i11;
                            }
                        }
                        i8 = 7;
                    }
                }
                i8 = i12;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new a(str, i8, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    public static void b(View view, HashMap<String, a> hashMap) {
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            a aVar = hashMap.get(next);
            String a10 = !aVar.f12103a ? t.a("set", next) : next;
            try {
                switch (g.c(aVar.f12105c)) {
                    case 0:
                        cls.getMethod(a10, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f12106d)});
                        break;
                    case 1:
                        cls.getMethod(a10, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f12107e)});
                        break;
                    case 2:
                        cls.getMethod(a10, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f12110h)});
                        break;
                    case 3:
                        Method method = cls.getMethod(a10, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f12110h);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 4:
                        cls.getMethod(a10, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f12108f});
                        break;
                    case 5:
                        cls.getMethod(a10, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f12109g)});
                        break;
                    case 6:
                        cls.getMethod(a10, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f12107e)});
                        break;
                    case 7:
                        cls.getMethod(a10, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f12106d)});
                        break;
                }
            } catch (NoSuchMethodException e10) {
                Log.e("TransitionLayout", e10.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + a10);
            } catch (IllegalAccessException e11) {
                StringBuilder c3 = d.c(" Custom Attribute \"", next, "\" not found on ");
                c3.append(cls.getName());
                Log.e("TransitionLayout", c3.toString());
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                StringBuilder c10 = d.c(" Custom Attribute \"", next, "\" not found on ");
                c10.append(cls.getName());
                Log.e("TransitionLayout", c10.toString());
                e12.printStackTrace();
            }
        }
    }

    public final void c(Object obj) {
        switch (g.c(this.f12105c)) {
            case 0:
            case 7:
                this.f12106d = ((Integer) obj).intValue();
                return;
            case 1:
                this.f12107e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f12110h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f12108f = (String) obj;
                return;
            case 5:
                this.f12109g = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f12107e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public a(a aVar, Object obj) {
        this.f12104b = aVar.f12104b;
        this.f12105c = aVar.f12105c;
        c(obj);
    }
}
