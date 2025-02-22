package yd;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.material.snackbar.g;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.tabs.wallet.WalletFragment;
import ff.m;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class l extends k implements rf.l<g<BaseResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WalletFragment f17357a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(WalletFragment walletFragment) {
        super(1);
        this.f17357a = walletFragment;
    }

    public final Object invoke(Object obj) {
        String message;
        ViewGroup viewGroup;
        g gVar = (g) obj;
        if (gVar instanceof g.a) {
            b bVar = this.f17357a.C0;
            if (bVar != null) {
                bVar.dismiss();
                this.f17357a.o0().f7160l.k(new g.b());
                String str = gVar.f17949b;
                if (str != null) {
                    WalletFragment walletFragment = this.f17357a;
                    String string = walletFragment.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(walletFragment, string, str, "OK", (String) null, false, j.f17355a, k.f17356a);
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = this.f17357a.C0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = this.f17357a.C0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    BaseResponse baseResponse = (BaseResponse) gVar.f17948a;
                    if (!(baseResponse == null || (message = baseResponse.getMessage()) == null)) {
                        View f02 = this.f17357a.f0();
                        this.f17357a.e0();
                        Object systemService = f02.getContext().getSystemService("input_method");
                        j.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        boolean z10 = false;
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(f02.getWindowToken(), 0);
                        int[] iArr = Snackbar.A;
                        ViewGroup viewGroup2 = null;
                        while (true) {
                            if (!(f02 instanceof CoordinatorLayout)) {
                                if (f02 instanceof FrameLayout) {
                                    if (f02.getId() == 16908290) {
                                        viewGroup = (ViewGroup) f02;
                                        break;
                                    }
                                    viewGroup2 = (ViewGroup) f02;
                                }
                                ViewParent parent = f02.getParent();
                                if (parent instanceof View) {
                                    f02 = (View) parent;
                                    continue;
                                } else {
                                    f02 = null;
                                    continue;
                                }
                                if (f02 == null) {
                                    viewGroup = viewGroup2;
                                    break;
                                }
                            } else {
                                viewGroup = (ViewGroup) f02;
                                break;
                            }
                        }
                        if (viewGroup != null) {
                            Context context = viewGroup.getContext();
                            LayoutInflater from = LayoutInflater.from(context);
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Snackbar.A);
                            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
                            obtainStyledAttributes.recycle();
                            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(resourceId != -1 && resourceId2 != -1 ? R.layout.mtrl_layout_snackbar_include : R.layout.design_layout_snackbar_include, viewGroup, false);
                            Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
                            ((SnackbarContentLayout) snackbar.f6064i.getChildAt(0)).getMessageView().setText(message);
                            snackbar.f6066k = 0;
                            BaseTransientBottomBar.e eVar = snackbar.f6064i;
                            j.e(eVar, "snackbar.view");
                            View findViewById = eVar.findViewById(R.id.snackbar_text);
                            j.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                            ((TextView) findViewById).setMaxLines(4);
                            com.google.android.material.snackbar.g b10 = com.google.android.material.snackbar.g.b();
                            int g10 = snackbar.g();
                            BaseTransientBottomBar.c cVar = snackbar.f6073s;
                            synchronized (b10.f6095a) {
                                if (b10.c(cVar)) {
                                    g.c cVar2 = b10.f6097c;
                                    cVar2.f6101b = g10;
                                    b10.f6096b.removeCallbacksAndMessages(cVar2);
                                    b10.d(b10.f6097c);
                                } else {
                                    g.c cVar3 = b10.f6098d;
                                    if (cVar3 != null) {
                                        if (cVar != null && cVar3.f6100a.get() == cVar) {
                                            z10 = true;
                                        }
                                    }
                                    if (z10) {
                                        b10.f6098d.f6101b = g10;
                                    } else {
                                        b10.f6098d = new g.c(g10, cVar);
                                    }
                                    g.c cVar4 = b10.f6097c;
                                    if (cVar4 == null || !b10.a(cVar4, 4)) {
                                        b10.f6097c = null;
                                        g.c cVar5 = b10.f6098d;
                                        if (cVar5 != null) {
                                            b10.f6097c = cVar5;
                                            b10.f6098d = null;
                                            g.b bVar4 = cVar5.f6100a.get();
                                            if (bVar4 != null) {
                                                bVar4.b();
                                            } else {
                                                b10.f6097c = null;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
                        }
                    }
                    this.f17357a.o0().f7160l.k(new g.b());
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            }
        }
        return m.f8717a;
    }
}
