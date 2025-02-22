package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.n0;
import androidx.core.widget.NestedScrollView;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import e.m;
import java.util.WeakHashMap;

public final class b extends m implements DialogInterface {
    public final AlertController B = new AlertController(getContext(), this, getWindow());

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.b f681a;

        /* renamed from: b  reason: collision with root package name */
        public final int f682b;

        public a(Context context) {
            this(context, b.g(context, 0));
        }

        public final b a() {
            AlertController.b bVar = this.f681a;
            b bVar2 = new b(bVar.f661a, this.f682b);
            View view = bVar.f665e;
            AlertController alertController = bVar2.B;
            if (view != null) {
                alertController.C = view;
            } else {
                CharSequence charSequence = bVar.f664d;
                if (charSequence != null) {
                    alertController.f637e = charSequence;
                    TextView textView = alertController.A;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f663c;
                if (drawable != null) {
                    alertController.f656y = drawable;
                    alertController.f655x = 0;
                    ImageView imageView = alertController.f657z;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f657z.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar.f666f;
            if (charSequence2 != null) {
                alertController.f638f = charSequence2;
                TextView textView2 = alertController.B;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.f667g;
            if (charSequence3 != null) {
                alertController.d(-1, charSequence3, bVar.f668h);
            }
            CharSequence charSequence4 = bVar.f669i;
            if (charSequence4 != null) {
                alertController.d(-2, charSequence4, bVar.f670j);
            }
            if (bVar.m != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f662b.inflate(alertController.G, (ViewGroup) null);
                int i8 = bVar.f676q ? alertController.H : alertController.I;
                ListAdapter listAdapter = bVar.m;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar.f661a, i8);
                }
                alertController.D = listAdapter;
                alertController.E = bVar.f677r;
                if (bVar.f673n != null) {
                    recycleListView.setOnItemClickListener(new a(bVar, alertController));
                }
                if (bVar.f676q) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f639g = recycleListView;
            }
            View view2 = bVar.f675p;
            if (view2 != null) {
                alertController.f640h = view2;
                alertController.f641i = 0;
                alertController.f642j = false;
            } else {
                int i10 = bVar.f674o;
                if (i10 != 0) {
                    alertController.f640h = null;
                    alertController.f641i = i10;
                    alertController.f642j = false;
                }
            }
            bVar2.setCancelable(bVar.f671k);
            if (bVar.f671k) {
                bVar2.setCanceledOnTouchOutside(true);
            }
            bVar2.setOnCancelListener((DialogInterface.OnCancelListener) null);
            bVar2.setOnDismissListener((DialogInterface.OnDismissListener) null);
            DialogInterface.OnKeyListener onKeyListener = bVar.f672l;
            if (onKeyListener != null) {
                bVar2.setOnKeyListener(onKeyListener);
            }
            return bVar2;
        }

        public a(Context context, int i8) {
            this.f681a = new AlertController.b(new ContextThemeWrapper(context, b.g(context, i8)));
            this.f682b = i8;
        }
    }

    public b(Context context, int i8) {
        super(context, g(context, i8));
    }

    public static int g(Context context, int i8) {
        if (((i8 >>> 24) & 255) >= 1) {
            return i8;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final void onCreate(Bundle bundle) {
        boolean z10;
        View view;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.B;
        alertController.f634b.setContentView(alertController.F);
        Window window = alertController.f635c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view2 = alertController.f640h;
        int i8 = 0;
        Context context = alertController.f633a;
        if (view2 == null) {
            view2 = alertController.f641i != 0 ? LayoutInflater.from(context).inflate(alertController.f641i, viewGroup, false) : null;
        }
        boolean z11 = view2 != null;
        if (!z11 || !AlertController.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z11) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f642j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f639g != null) {
                ((n0.a) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup c3 = AlertController.c(findViewById6, findViewById3);
        ViewGroup c10 = AlertController.c(findViewById7, findViewById4);
        ViewGroup c11 = AlertController.c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        alertController.f654w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f654w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c10.findViewById(16908299);
        alertController.B = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f638f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f654w.removeView(alertController.B);
                if (alertController.f639g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f654w.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.f654w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f639g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    c10.setVisibility(8);
                }
            }
        }
        Button button = (Button) c11.findViewById(16908313);
        alertController.f643k = button;
        AlertController.a aVar = alertController.L;
        button.setOnClickListener(aVar);
        boolean isEmpty = TextUtils.isEmpty(alertController.f644l);
        int i10 = alertController.f636d;
        if (!isEmpty || alertController.f645n != null) {
            alertController.f643k.setText(alertController.f644l);
            Drawable drawable = alertController.f645n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i10, i10);
                alertController.f643k.setCompoundDrawables(alertController.f645n, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f643k.setVisibility(0);
            z10 = true;
        } else {
            alertController.f643k.setVisibility(8);
            z10 = false;
        }
        Button button2 = (Button) c11.findViewById(16908314);
        alertController.f646o = button2;
        button2.setOnClickListener(aVar);
        if (!TextUtils.isEmpty(alertController.f647p) || alertController.f649r != null) {
            alertController.f646o.setText(alertController.f647p);
            Drawable drawable2 = alertController.f649r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i10, i10);
                alertController.f646o.setCompoundDrawables(alertController.f649r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f646o.setVisibility(0);
            z10 |= true;
        } else {
            alertController.f646o.setVisibility(8);
        }
        Button button3 = (Button) c11.findViewById(16908315);
        alertController.f650s = button3;
        button3.setOnClickListener(aVar);
        if (!TextUtils.isEmpty(alertController.f651t) || alertController.f653v != null) {
            alertController.f650s.setText(alertController.f651t);
            Drawable drawable3 = alertController.f653v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i10, i10);
                view = null;
                alertController.f650s.setCompoundDrawables(alertController.f653v, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                view = null;
            }
            alertController.f650s.setVisibility(0);
            z10 |= true;
        } else {
            alertController.f650s.setVisibility(8);
            view = null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z10) {
                AlertController.b(alertController.f643k);
            } else if (z10) {
                AlertController.b(alertController.f646o);
            } else if (z10) {
                AlertController.b(alertController.f650s);
            }
        }
        if (!(z10)) {
            c11.setVisibility(8);
        }
        if (alertController.C != null) {
            c3.addView(alertController.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.f657z = (ImageView) window.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.f637e)) || !alertController.J) {
                window.findViewById(R.id.title_template).setVisibility(8);
                alertController.f657z.setVisibility(8);
                c3.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                alertController.A = textView2;
                textView2.setText(alertController.f637e);
                int i11 = alertController.f655x;
                if (i11 != 0) {
                    alertController.f657z.setImageResource(i11);
                } else {
                    Drawable drawable4 = alertController.f656y;
                    if (drawable4 != null) {
                        alertController.f657z.setImageDrawable(drawable4);
                    } else {
                        alertController.A.setPadding(alertController.f657z.getPaddingLeft(), alertController.f657z.getPaddingTop(), alertController.f657z.getPaddingRight(), alertController.f657z.getPaddingBottom());
                        alertController.f657z.setVisibility(8);
                    }
                }
            }
        }
        boolean z12 = viewGroup.getVisibility() != 8;
        int i12 = (c3 == null || c3.getVisibility() == 8) ? 0 : 1;
        boolean z13 = c11.getVisibility() != 8;
        if (!z13 && (findViewById = c10.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i12 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f654w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (alertController.f638f == null && alertController.f639g == null) ? view : c3.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = c10.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f639g;
        if (recycleListView instanceof AlertController.RecycleListView) {
            recycleListView.getClass();
            if (!z13 || i12 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i12 != 0 ? recycleListView.getPaddingTop() : recycleListView.f658a, recycleListView.getPaddingRight(), z13 ? recycleListView.getPaddingBottom() : recycleListView.f659b);
            }
        }
        if (!z12) {
            View view3 = alertController.f639g;
            if (view3 == null) {
                view3 = alertController.f654w;
            }
            if (view3 != null) {
                if (z13) {
                    i8 = 2;
                }
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.j.d(view3, i12 | i8, 3);
                if (findViewById11 != null) {
                    c10.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    c10.removeView(findViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f639g;
        if (recycleListView2 != null && (listAdapter = alertController.D) != null) {
            recycleListView2.setAdapter(listAdapter);
            int i13 = alertController.E;
            if (i13 > -1) {
                recycleListView2.setItemChecked(i13, true);
                recycleListView2.setSelection(i13);
            }
        }
    }

    public final boolean onKeyDown(int i8, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.B.f654w;
        if (nestedScrollView != null && nestedScrollView.c(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i8, keyEvent);
    }

    public final boolean onKeyUp(int i8, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.B.f654w;
        if (nestedScrollView != null && nestedScrollView.c(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i8, keyEvent);
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.B;
        alertController.f637e = charSequence;
        TextView textView = alertController.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
