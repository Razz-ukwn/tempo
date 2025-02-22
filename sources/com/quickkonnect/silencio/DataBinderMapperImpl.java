package com.quickkonnect.silencio;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.c;
import androidx.databinding.d;
import c4.a;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.ArrayList;
import java.util.List;
import nc.a0;
import nc.b1;
import nc.c0;
import nc.f;
import nc.f0;
import nc.f1;
import nc.h;
import nc.h0;
import nc.h1;
import nc.j1;
import nc.k;
import nc.k0;
import nc.l1;
import nc.m;
import nc.m0;
import nc.n1;
import nc.o;
import nc.o0;
import nc.q;
import nc.q0;
import nc.s;
import nc.s0;
import nc.u;
import nc.u0;
import nc.w;
import nc.x0;
import nc.y;

public class DataBinderMapperImpl extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f6649a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(28);
        f6649a = sparseIntArray;
        sparseIntArray.put(R.layout.bottom_sheet_ask_silencio, 1);
        sparseIntArray.put(R.layout.bottom_sheet_change_password, 2);
        sparseIntArray.put(R.layout.bottom_sheet_choose_password, 3);
        sparseIntArray.put(R.layout.bottom_sheet_claim_coin_place_indoor, 4);
        sparseIntArray.put(R.layout.bottom_sheet_claim_coin_place_outdoor, 5);
        sparseIntArray.put(R.layout.bottom_sheet_claim_coin_source_indoor, 6);
        sparseIntArray.put(R.layout.bottom_sheet_claim_coin_source_outdoor, 7);
        sparseIntArray.put(R.layout.bottom_sheet_code, 8);
        sparseIntArray.put(R.layout.bottom_sheet_create_account, 9);
        sparseIntArray.put(R.layout.bottom_sheet_email, 10);
        sparseIntArray.put(R.layout.bottom_sheet_forgot_password, 11);
        sparseIntArray.put(R.layout.bottom_sheet_forgot_password_email, 12);
        sparseIntArray.put(R.layout.bottom_sheet_how_to_measure, 13);
        sparseIntArray.put(R.layout.bottom_sheet_login, 14);
        sparseIntArray.put(R.layout.bottom_sheet_map_popup, 15);
        sparseIntArray.put(R.layout.bottom_sheet_phone_number, 16);
        sparseIntArray.put(R.layout.bottom_sheet_popup, 17);
        sparseIntArray.put(R.layout.bottom_sheet_register, 18);
        sparseIntArray.put(R.layout.bottom_sheet_register_email_otp_verification, 19);
        sparseIntArray.put(R.layout.bottom_sheet_register_otp_verification, 20);
        sparseIntArray.put(R.layout.bottom_sheet_reset_password, 21);
        sparseIntArray.put(R.layout.bottom_sheet_verification, 22);
        sparseIntArray.put(R.layout.fragment_history, 23);
        sparseIntArray.put(R.layout.fragment_profile, 24);
        sparseIntArray.put(R.layout.fragment_shop, 25);
        sparseIntArray.put(R.layout.fragment_wallet, 26);
        sparseIntArray.put(R.layout.item_history_menu_recycler, 27);
        sparseIntArray.put(R.layout.item_wallet_recycler, 28);
    }

    public final List<c> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public final ViewDataBinding b(d dVar, View view, int i8) {
        int i10 = f6649a.get(i8);
        if (i10 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i10) {
                case 1:
                    if ("layout/bottom_sheet_ask_silencio_0".equals(tag)) {
                        return new nc.c(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_ask_silencio is invalid. Received: ", tag));
                case 2:
                    if ("layout/bottom_sheet_change_password_0".equals(tag)) {
                        return new f(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_change_password is invalid. Received: ", tag));
                case 3:
                    if ("layout/bottom_sheet_choose_password_0".equals(tag)) {
                        return new h(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_choose_password is invalid. Received: ", tag));
                case 4:
                    if ("layout/bottom_sheet_claim_coin_place_indoor_0".equals(tag)) {
                        return new k(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_claim_coin_place_indoor is invalid. Received: ", tag));
                case 5:
                    if ("layout/bottom_sheet_claim_coin_place_outdoor_0".equals(tag)) {
                        return new m(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_claim_coin_place_outdoor is invalid. Received: ", tag));
                case 6:
                    if ("layout/bottom_sheet_claim_coin_source_indoor_0".equals(tag)) {
                        return new o(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_claim_coin_source_indoor is invalid. Received: ", tag));
                case 7:
                    if ("layout/bottom_sheet_claim_coin_source_outdoor_0".equals(tag)) {
                        return new q(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_claim_coin_source_outdoor is invalid. Received: ", tag));
                case 8:
                    if ("layout/bottom_sheet_code_0".equals(tag)) {
                        return new s(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_code is invalid. Received: ", tag));
                case 9:
                    if ("layout/bottom_sheet_create_account_0".equals(tag)) {
                        return new u(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_create_account is invalid. Received: ", tag));
                case 10:
                    if ("layout/bottom_sheet_email_0".equals(tag)) {
                        return new w(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_email is invalid. Received: ", tag));
                case ModuleDescriptor.MODULE_VERSION:
                    if ("layout/bottom_sheet_forgot_password_0".equals(tag)) {
                        return new y(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_forgot_password is invalid. Received: ", tag));
                case 12:
                    if ("layout/bottom_sheet_forgot_password_email_0".equals(tag)) {
                        return new a0(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_forgot_password_email is invalid. Received: ", tag));
                case 13:
                    if ("layout/bottom_sheet_how_to_measure_0".equals(tag)) {
                        return new c0(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_how_to_measure is invalid. Received: ", tag));
                case 14:
                    if ("layout/bottom_sheet_login_0".equals(tag)) {
                        return new f0(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_login is invalid. Received: ", tag));
                case 15:
                    if ("layout/bottom_sheet_map_popup_0".equals(tag)) {
                        return new h0(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_map_popup is invalid. Received: ", tag));
                case 16:
                    if ("layout/bottom_sheet_phone_number_0".equals(tag)) {
                        return new k0(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_phone_number is invalid. Received: ", tag));
                case 17:
                    if ("layout/bottom_sheet_popup_0".equals(tag)) {
                        return new m0(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_popup is invalid. Received: ", tag));
                case 18:
                    if ("layout/bottom_sheet_register_0".equals(tag)) {
                        return new o0(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_register is invalid. Received: ", tag));
                case 19:
                    if ("layout/bottom_sheet_register_email_otp_verification_0".equals(tag)) {
                        return new q0(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_register_email_otp_verification is invalid. Received: ", tag));
                case 20:
                    if ("layout/bottom_sheet_register_otp_verification_0".equals(tag)) {
                        return new s0(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_register_otp_verification is invalid. Received: ", tag));
                case 21:
                    if ("layout/bottom_sheet_reset_password_0".equals(tag)) {
                        return new u0(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_reset_password is invalid. Received: ", tag));
                case 22:
                    if ("layout/bottom_sheet_verification_0".equals(tag)) {
                        return new x0(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for bottom_sheet_verification is invalid. Received: ", tag));
                case 23:
                    if ("layout/fragment_history_0".equals(tag)) {
                        return new b1(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for fragment_history is invalid. Received: ", tag));
                case 24:
                    if ("layout/fragment_profile_0".equals(tag)) {
                        return new f1(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for fragment_profile is invalid. Received: ", tag));
                case 25:
                    if ("layout/fragment_shop_0".equals(tag)) {
                        return new h1(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for fragment_shop is invalid. Received: ", tag));
                case 26:
                    if ("layout/fragment_wallet_0".equals(tag)) {
                        return new j1(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for fragment_wallet is invalid. Received: ", tag));
                case 27:
                    if ("layout/item_history_menu_recycler_0".equals(tag)) {
                        return new l1(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for item_history_menu_recycler is invalid. Received: ", tag));
                case 28:
                    if ("layout/item_wallet_recycler_0".equals(tag)) {
                        return new n1(dVar, view);
                    }
                    throw new IllegalArgumentException(a.c("The tag for item_wallet_recycler is invalid. Received: ", tag));
                default:
                    return null;
            }
        } else {
            throw new RuntimeException("view must have a tag");
        }
    }

    public final ViewDataBinding c(d dVar, View[] viewArr, int i8) {
        if (viewArr.length == 0 || f6649a.get(i8) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
