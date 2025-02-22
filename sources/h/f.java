package h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.activity.result.d;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.h1;
import androidx.appcompat.widget.j0;
import cb.e;
import d2.s;
import i.c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

public final class f extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f9021e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f9022f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f9023a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f9024b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f9025c;

    /* renamed from: d  reason: collision with root package name */
    public Object f9026d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f9027c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public final Object f9028a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f9029b;

        public a(Object obj, String str) {
            this.f9028a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f9029b = cls.getMethod(str, f9027c);
            } catch (Exception e10) {
                StringBuilder c3 = d.c("Couldn't resolve menu item onClick handler ", str, " in class ");
                c3.append(cls.getName());
                InflateException inflateException = new InflateException(c3.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f9029b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f9028a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, new Object[]{menuItem})).booleanValue();
                }
                method.invoke(obj, new Object[]{menuItem});
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public class b {
        public CharSequence A;
        public CharSequence B;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: a  reason: collision with root package name */
        public final Menu f9030a;

        /* renamed from: b  reason: collision with root package name */
        public int f9031b;

        /* renamed from: c  reason: collision with root package name */
        public int f9032c;

        /* renamed from: d  reason: collision with root package name */
        public int f9033d;

        /* renamed from: e  reason: collision with root package name */
        public int f9034e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f9035f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f9036g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f9037h;

        /* renamed from: i  reason: collision with root package name */
        public int f9038i;

        /* renamed from: j  reason: collision with root package name */
        public int f9039j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f9040k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f9041l;
        public int m;

        /* renamed from: n  reason: collision with root package name */
        public char f9042n;

        /* renamed from: o  reason: collision with root package name */
        public int f9043o;

        /* renamed from: p  reason: collision with root package name */
        public char f9044p;

        /* renamed from: q  reason: collision with root package name */
        public int f9045q;

        /* renamed from: r  reason: collision with root package name */
        public int f9046r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f9047s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f9048t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f9049u;

        /* renamed from: v  reason: collision with root package name */
        public int f9050v;

        /* renamed from: w  reason: collision with root package name */
        public int f9051w;

        /* renamed from: x  reason: collision with root package name */
        public String f9052x;

        /* renamed from: y  reason: collision with root package name */
        public String f9053y;

        /* renamed from: z  reason: collision with root package name */
        public d2.b f9054z;

        public b(Menu menu) {
            this.f9030a = menu;
            this.f9031b = 0;
            this.f9032c = 0;
            this.f9033d = 0;
            this.f9034e = 0;
            this.f9035f = true;
            this.f9036g = true;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f9025c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f9047s).setVisible(this.f9048t).setEnabled(this.f9049u).setCheckable(this.f9046r >= 1).setTitleCondensed(this.f9041l).setIcon(this.m);
            int i8 = this.f9050v;
            if (i8 >= 0) {
                menuItem.setShowAsAction(i8);
            }
            String str = this.f9053y;
            f fVar = f.this;
            if (str != null) {
                if (!fVar.f9025c.isRestricted()) {
                    if (fVar.f9026d == null) {
                        fVar.f9026d = f.a(fVar.f9025c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.f9026d, this.f9053y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f9046r >= 2) {
                if (menuItem instanceof h) {
                    ((h) menuItem).f(true);
                } else if (menuItem instanceof c) {
                    c cVar = (c) menuItem;
                    try {
                        Method method = cVar.f9347e;
                        x1.b bVar = cVar.f9346d;
                        if (method == null) {
                            cVar.f9347e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        cVar.f9347e.invoke(bVar, new Object[]{Boolean.TRUE});
                    } catch (Exception e10) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                    }
                }
            }
            String str2 = this.f9052x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, f.f9021e, fVar.f9023a));
                z10 = true;
            }
            int i10 = this.f9051w;
            if (i10 > 0) {
                if (!z10) {
                    menuItem.setActionView(i10);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            d2.b bVar2 = this.f9054z;
            if (bVar2 != null) {
                if (menuItem instanceof x1.b) {
                    ((x1.b) menuItem).a(bVar2);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z11 = menuItem instanceof x1.b;
            if (z11) {
                ((x1.b) menuItem).setContentDescription(charSequence);
            } else {
                s.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z11) {
                ((x1.b) menuItem).setTooltipText(charSequence2);
            } else {
                s.m(menuItem, charSequence2);
            }
            char c3 = this.f9042n;
            int i11 = this.f9043o;
            if (z11) {
                ((x1.b) menuItem).setAlphabeticShortcut(c3, i11);
            } else {
                s.g(menuItem, c3, i11);
            }
            char c10 = this.f9044p;
            int i12 = this.f9045q;
            if (z11) {
                ((x1.b) menuItem).setNumericShortcut(c10, i12);
            } else {
                s.k(menuItem, c10, i12);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z11) {
                    ((x1.b) menuItem).setIconTintMode(mode);
                } else {
                    s.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList == null) {
                return;
            }
            if (z11) {
                ((x1.b) menuItem).setIconTintList(colorStateList);
            } else {
                s.i(menuItem, colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f9021e = r0
            f9022f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.f.<clinit>():void");
    }

    public f(Context context) {
        super(context);
        this.f9025c = context;
        Object[] objArr = {context};
        this.f9023a = objArr;
        this.f9024b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i8;
        ColorStateList colorStateList;
        AttributeSet attributeSet2 = attributeSet;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i8 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlResourceParser xmlResourceParser2 = xmlResourceParser;
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType != 1) {
                Menu menu2 = bVar.f9030a;
                if (eventType != i8) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z11 && name2.equals(str)) {
                            XmlResourceParser xmlResourceParser3 = xmlResourceParser;
                            z11 = false;
                            str = null;
                            eventType = xmlResourceParser.next();
                            i8 = 2;
                        } else if (name2.equals("group")) {
                            bVar.f9031b = 0;
                            bVar.f9032c = 0;
                            bVar.f9033d = 0;
                            bVar.f9034e = 0;
                            bVar.f9035f = true;
                            bVar.f9036g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.f9037h) {
                                d2.b bVar2 = bVar.f9054z;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.f9037h = true;
                                    bVar.b(menu2.add(bVar.f9031b, bVar.f9038i, bVar.f9039j, bVar.f9040k));
                                } else {
                                    bVar.f9037h = true;
                                    bVar.b(menu2.addSubMenu(bVar.f9031b, bVar.f9038i, bVar.f9039j, bVar.f9040k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z10 = true;
                        }
                    }
                } else if (!z11) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    f fVar = f.this;
                    if (equals) {
                        TypedArray obtainStyledAttributes = fVar.f9025c.obtainStyledAttributes(attributeSet2, e.M);
                        bVar.f9031b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar.f9032c = obtainStyledAttributes.getInt(3, 0);
                        bVar.f9033d = obtainStyledAttributes.getInt(4, 0);
                        bVar.f9034e = obtainStyledAttributes.getInt(5, 0);
                        bVar.f9035f = obtainStyledAttributes.getBoolean(2, true);
                        bVar.f9036g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = fVar.f9025c;
                            h1 h1Var = new h1(context, context.obtainStyledAttributes(attributeSet2, e.N));
                            bVar.f9038i = h1Var.i(2, 0);
                            bVar.f9039j = (h1Var.h(5, bVar.f9032c) & -65536) | (h1Var.h(6, bVar.f9033d) & 65535);
                            bVar.f9040k = h1Var.k(7);
                            bVar.f9041l = h1Var.k(8);
                            bVar.m = h1Var.i(0, 0);
                            String j10 = h1Var.j(9);
                            bVar.f9042n = j10 == null ? 0 : j10.charAt(0);
                            bVar.f9043o = h1Var.h(16, 4096);
                            String j11 = h1Var.j(10);
                            bVar.f9044p = j11 == null ? 0 : j11.charAt(0);
                            bVar.f9045q = h1Var.h(20, 4096);
                            if (h1Var.l(11)) {
                                bVar.f9046r = h1Var.a(11, false) ? 1 : 0;
                            } else {
                                bVar.f9046r = bVar.f9034e;
                            }
                            bVar.f9047s = h1Var.a(3, false);
                            bVar.f9048t = h1Var.a(4, bVar.f9035f);
                            bVar.f9049u = h1Var.a(1, bVar.f9036g);
                            bVar.f9050v = h1Var.h(21, -1);
                            bVar.f9053y = h1Var.j(12);
                            bVar.f9051w = h1Var.i(13, 0);
                            bVar.f9052x = h1Var.j(15);
                            String j12 = h1Var.j(14);
                            boolean z12 = j12 != null;
                            if (z12 && bVar.f9051w == 0 && bVar.f9052x == null) {
                                bVar.f9054z = (d2.b) bVar.a(j12, f9022f, fVar.f9024b);
                            } else {
                                if (z12) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                bVar.f9054z = null;
                            }
                            bVar.A = h1Var.k(17);
                            bVar.B = h1Var.k(22);
                            if (h1Var.l(19)) {
                                bVar.D = j0.b(h1Var.h(19, -1), bVar.D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                bVar.D = null;
                            }
                            if (h1Var.l(18)) {
                                bVar.C = h1Var.b(18);
                            } else {
                                bVar.C = colorStateList;
                            }
                            h1Var.n();
                            bVar.f9037h = false;
                            XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                        } else if (name3.equals("menu")) {
                            bVar.f9037h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(bVar.f9031b, bVar.f9038i, bVar.f9039j, bVar.f9040k);
                            bVar.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet2, addSubMenu);
                        } else {
                            XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                            str = name3;
                            z11 = true;
                        }
                        eventType = xmlResourceParser.next();
                        i8 = 2;
                    }
                }
                XmlResourceParser xmlResourceParser6 = xmlResourceParser;
                eventType = xmlResourceParser.next();
                i8 = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public final void inflate(int i8, Menu menu) {
        if (!(menu instanceof x1.a)) {
            super.inflate(i8, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f9025c.getResources().getLayout(i8);
            b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e10) {
            throw new InflateException("Error inflating menu XML", e10);
        } catch (IOException e11) {
            throw new InflateException("Error inflating menu XML", e11);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
