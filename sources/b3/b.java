package b3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import b3.m0;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rf.l;
import sf.j;
import sf.k;

@m0.b("activity")
public class b extends m0<a> {

    /* renamed from: c  reason: collision with root package name */
    public final Context f3026c;

    /* renamed from: d  reason: collision with root package name */
    public final Activity f3027d;

    public static class a extends z {
        public Intent G;
        public String H;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m0<? extends a> m0Var) {
            super(m0Var);
            j.f(m0Var, "activityNavigator");
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a) || !super.equals(obj)) {
                return false;
            }
            Intent intent = this.G;
            return (intent != null ? intent.filterEquals(((a) obj).G) : ((a) obj).G == null) && j.a(this.H, ((a) obj).H);
        }

        public final void h(Context context, AttributeSet attributeSet) {
            j.f(context, "context");
            super.h(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, m9.b.f11320a);
            j.e(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            String string = obtainAttributes.getString(4);
            if (string != null) {
                String packageName = context.getPackageName();
                j.e(packageName, "context.packageName");
                string = zf.j.v0(string, "${applicationId}", packageName);
            }
            if (this.G == null) {
                this.G = new Intent();
            }
            Intent intent = this.G;
            j.c(intent);
            intent.setPackage(string);
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.G == null) {
                    this.G = new Intent();
                }
                Intent intent2 = this.G;
                j.c(intent2);
                intent2.setComponent(componentName);
            }
            String string3 = obtainAttributes.getString(1);
            if (this.G == null) {
                this.G = new Intent();
            }
            Intent intent3 = this.G;
            j.c(intent3);
            intent3.setAction(string3);
            String string4 = obtainAttributes.getString(2);
            if (string4 != null) {
                Uri parse = Uri.parse(string4);
                if (this.G == null) {
                    this.G = new Intent();
                }
                Intent intent4 = this.G;
                j.c(intent4);
                intent4.setData(parse);
            }
            this.H = obtainAttributes.getString(3);
            obtainAttributes.recycle();
        }

        public final int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.G;
            int i8 = 0;
            int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.H;
            if (str != null) {
                i8 = str.hashCode();
            }
            return filterHashCode + i8;
        }

        public final String toString() {
            Intent intent = this.G;
            String str = null;
            ComponentName component = intent != null ? intent.getComponent() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (component != null) {
                sb2.append(" class=");
                sb2.append(component.getClassName());
            } else {
                Intent intent2 = this.G;
                if (intent2 != null) {
                    str = intent2.getAction();
                }
                if (str != null) {
                    sb2.append(" action=");
                    sb2.append(str);
                }
            }
            String sb3 = sb2.toString();
            j.e(sb3, "sb.toString()");
            return sb3;
        }
    }

    /* renamed from: b3.b$b  reason: collision with other inner class name */
    public static final class C0035b implements m0.a {
    }

    public static final class c extends k implements l<Context, Context> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f3028a = new c();

        public c() {
            super(1);
        }

        public final Object invoke(Object obj) {
            Context context = (Context) obj;
            j.f(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    public b(Context context) {
        Object obj;
        j.f(context, "context");
        this.f3026c = context;
        Iterator it = yf.k.o0(context, c.f3028a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f3027d = (Activity) obj;
    }

    public final z a() {
        return new a(this);
    }

    public final z c(z zVar, Bundle bundle, f0 f0Var, m0.a aVar) {
        Intent intent;
        int intExtra;
        a aVar2 = (a) zVar;
        if (aVar2.G != null) {
            Intent intent2 = new Intent(aVar2.G);
            int i8 = 0;
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = aVar2.H;
                if (!(str == null || str.length() == 0)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z10 = aVar instanceof C0035b;
            if (z10) {
                ((C0035b) aVar).getClass();
                intent2.addFlags(0);
            }
            Activity activity = this.f3027d;
            if (activity == null) {
                intent2.addFlags(268435456);
            }
            if (f0Var != null && f0Var.f3044a) {
                intent2.addFlags(536870912);
            }
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar2.D);
            Context context = this.f3026c;
            Resources resources = context.getResources();
            if (f0Var != null) {
                int i10 = f0Var.f3051h;
                int i11 = f0Var.f3052i;
                if ((i10 <= 0 || !j.a(resources.getResourceTypeName(i10), "animator")) && (i11 <= 0 || !j.a(resources.getResourceTypeName(i11), "animator"))) {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i10);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i11);
                } else {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i10) + " and popExit resource " + resources.getResourceName(i11) + " when launching " + aVar2);
                }
            }
            if (z10) {
                ((C0035b) aVar).getClass();
                context.startActivity(intent2);
            } else {
                context.startActivity(intent2);
            }
            if (f0Var == null || activity == null) {
                return null;
            }
            int i12 = f0Var.f3049f;
            int i13 = f0Var.f3050g;
            if ((i12 > 0 && j.a(resources.getResourceTypeName(i12), "animator")) || (i13 > 0 && j.a(resources.getResourceTypeName(i13), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i12) + " and exit resource " + resources.getResourceName(i13) + "when launching " + aVar2);
                return null;
            } else if (i12 < 0 && i13 < 0) {
                return null;
            } else {
                if (i12 < 0) {
                    i12 = 0;
                }
                if (i13 >= 0) {
                    i8 = i13;
                }
                activity.overridePendingTransition(i12, i8);
                return null;
            }
        } else {
            throw new IllegalStateException(x.b(new StringBuilder("Destination "), aVar2.D, " does not have an Intent set.").toString());
        }
    }

    public final boolean j() {
        Activity activity = this.f3027d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
