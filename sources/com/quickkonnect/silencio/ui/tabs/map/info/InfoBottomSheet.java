package com.quickkonnect.silencio.ui.tabs.map.info;

import a9.v;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import cb.b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.c;
import com.quickkonnect.silencio.R;
import nc.d0;
import sf.j;

public final class InfoBottomSheet extends c {
    public static final /* synthetic */ int M0 = 0;
    public d0 L0;

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_info, viewGroup, false);
        int i8 = R.id.btn_close_info;
        ImageView imageView = (ImageView) b.x(inflate, R.id.btn_close_info);
        if (imageView != null) {
            i8 = R.id.imageView24;
            if (((ImageView) b.x(inflate, R.id.imageView24)) != null) {
                i8 = R.id.imageView25;
                if (((ImageView) b.x(inflate, R.id.imageView25)) != null) {
                    i8 = R.id.imageView26;
                    if (((ImageView) b.x(inflate, R.id.imageView26)) != null) {
                        i8 = R.id.imageView27;
                        if (((ImageView) b.x(inflate, R.id.imageView27)) != null) {
                            i8 = R.id.imageView28;
                            if (((ImageView) b.x(inflate, R.id.imageView28)) != null) {
                                i8 = R.id.imageView29;
                                if (((ImageView) b.x(inflate, R.id.imageView29)) != null) {
                                    i8 = R.id.imageView30;
                                    if (((ImageView) b.x(inflate, R.id.imageView30)) != null) {
                                        i8 = R.id.imageView31;
                                        if (((ImageView) b.x(inflate, R.id.imageView31)) != null) {
                                            i8 = R.id.imageView32;
                                            if (((ImageView) b.x(inflate, R.id.imageView32)) != null) {
                                                i8 = R.id.imageView33;
                                                if (((ImageView) b.x(inflate, R.id.imageView33)) != null) {
                                                    i8 = R.id.imageView34;
                                                    if (((ImageView) b.x(inflate, R.id.imageView34)) != null) {
                                                        i8 = R.id.imageView36;
                                                        if (((ImageView) b.x(inflate, R.id.imageView36)) != null) {
                                                            i8 = R.id.imageView37;
                                                            if (((ImageView) b.x(inflate, R.id.imageView37)) != null) {
                                                                i8 = R.id.imageView38;
                                                                if (((ImageView) b.x(inflate, R.id.imageView38)) != null) {
                                                                    i8 = R.id.imageView39;
                                                                    if (((ImageView) b.x(inflate, R.id.imageView39)) != null) {
                                                                        i8 = R.id.imageView41;
                                                                        if (((ImageView) b.x(inflate, R.id.imageView41)) != null) {
                                                                            i8 = R.id.imageView42;
                                                                            if (((ImageView) b.x(inflate, R.id.imageView42)) != null) {
                                                                                i8 = R.id.imageView43;
                                                                                if (((ImageView) b.x(inflate, R.id.imageView43)) != null) {
                                                                                    i8 = R.id.textView100;
                                                                                    if (((TextView) b.x(inflate, R.id.textView100)) != null) {
                                                                                        i8 = R.id.textView101;
                                                                                        if (((TextView) b.x(inflate, R.id.textView101)) != null) {
                                                                                            i8 = R.id.textView102;
                                                                                            if (((TextView) b.x(inflate, R.id.textView102)) != null) {
                                                                                                i8 = R.id.textView103;
                                                                                                if (((TextView) b.x(inflate, R.id.textView103)) != null) {
                                                                                                    i8 = R.id.textView104;
                                                                                                    if (((TextView) b.x(inflate, R.id.textView104)) != null) {
                                                                                                        i8 = R.id.textView107;
                                                                                                        if (((TextView) b.x(inflate, R.id.textView107)) != null) {
                                                                                                            i8 = R.id.textView109;
                                                                                                            if (((TextView) b.x(inflate, R.id.textView109)) != null) {
                                                                                                                i8 = R.id.textView110;
                                                                                                                if (((TextView) b.x(inflate, R.id.textView110)) != null) {
                                                                                                                    i8 = R.id.textView111;
                                                                                                                    if (((TextView) b.x(inflate, R.id.textView111)) != null) {
                                                                                                                        i8 = R.id.textView112;
                                                                                                                        if (((TextView) b.x(inflate, R.id.textView112)) != null) {
                                                                                                                            i8 = R.id.textView39;
                                                                                                                            if (((TextView) b.x(inflate, R.id.textView39)) != null) {
                                                                                                                                i8 = R.id.textView44;
                                                                                                                                if (((TextView) b.x(inflate, R.id.textView44)) != null) {
                                                                                                                                    i8 = R.id.textView54;
                                                                                                                                    if (((TextView) b.x(inflate, R.id.textView54)) != null) {
                                                                                                                                        i8 = R.id.textView82;
                                                                                                                                        if (((TextView) b.x(inflate, R.id.textView82)) != null) {
                                                                                                                                            i8 = R.id.textView83;
                                                                                                                                            if (((TextView) b.x(inflate, R.id.textView83)) != null) {
                                                                                                                                                i8 = R.id.textView84;
                                                                                                                                                if (((TextView) b.x(inflate, R.id.textView84)) != null) {
                                                                                                                                                    i8 = R.id.textView85;
                                                                                                                                                    if (((TextView) b.x(inflate, R.id.textView85)) != null) {
                                                                                                                                                        i8 = R.id.textView86;
                                                                                                                                                        if (((TextView) b.x(inflate, R.id.textView86)) != null) {
                                                                                                                                                            i8 = R.id.textView87;
                                                                                                                                                            if (((TextView) b.x(inflate, R.id.textView87)) != null) {
                                                                                                                                                                i8 = R.id.textView88;
                                                                                                                                                                if (((TextView) b.x(inflate, R.id.textView88)) != null) {
                                                                                                                                                                    i8 = R.id.textView89;
                                                                                                                                                                    if (((TextView) b.x(inflate, R.id.textView89)) != null) {
                                                                                                                                                                        i8 = R.id.textView90;
                                                                                                                                                                        if (((TextView) b.x(inflate, R.id.textView90)) != null) {
                                                                                                                                                                            i8 = R.id.textView91;
                                                                                                                                                                            if (((TextView) b.x(inflate, R.id.textView91)) != null) {
                                                                                                                                                                                i8 = R.id.textView92;
                                                                                                                                                                                if (((TextView) b.x(inflate, R.id.textView92)) != null) {
                                                                                                                                                                                    i8 = R.id.textView93;
                                                                                                                                                                                    if (((TextView) b.x(inflate, R.id.textView93)) != null) {
                                                                                                                                                                                        i8 = R.id.textView94;
                                                                                                                                                                                        if (((TextView) b.x(inflate, R.id.textView94)) != null) {
                                                                                                                                                                                            i8 = R.id.textView95;
                                                                                                                                                                                            if (((TextView) b.x(inflate, R.id.textView95)) != null) {
                                                                                                                                                                                                i8 = R.id.textView96;
                                                                                                                                                                                                if (((TextView) b.x(inflate, R.id.textView96)) != null) {
                                                                                                                                                                                                    i8 = R.id.textView97;
                                                                                                                                                                                                    if (((TextView) b.x(inflate, R.id.textView97)) != null) {
                                                                                                                                                                                                        i8 = R.id.textView98;
                                                                                                                                                                                                        if (((TextView) b.x(inflate, R.id.textView98)) != null) {
                                                                                                                                                                                                            i8 = R.id.textView99;
                                                                                                                                                                                                            if (((TextView) b.x(inflate, R.id.textView99)) != null) {
                                                                                                                                                                                                                this.L0 = new d0((NestedScrollView) inflate, imageView);
                                                                                                                                                                                                                Dialog dialog = this.G0;
                                                                                                                                                                                                                BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
                                                                                                                                                                                                                com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
                                                                                                                                                                                                                if (bVar != null) {
                                                                                                                                                                                                                    bottomSheetBehavior = bVar.h();
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (bottomSheetBehavior != null) {
                                                                                                                                                                                                                    bottomSheetBehavior.C(3);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                d0 d0Var = this.L0;
                                                                                                                                                                                                                j.c(d0Var);
                                                                                                                                                                                                                d0Var.f11649b.setOnClickListener(new v(this, 15));
                                                                                                                                                                                                                d0 d0Var2 = this.L0;
                                                                                                                                                                                                                j.c(d0Var2);
                                                                                                                                                                                                                NestedScrollView nestedScrollView = d0Var2.f11648a;
                                                                                                                                                                                                                j.e(nestedScrollView, "binding.root");
                                                                                                                                                                                                                return nestedScrollView;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    public final void N() {
        super.N();
        this.L0 = null;
    }
}
