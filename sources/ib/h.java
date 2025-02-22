package ib;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import qe.a;
import qe.e;

public final class h implements TextWatcher {
    public boolean B = false;
    public final boolean C;

    /* renamed from: a  reason: collision with root package name */
    public boolean f9645a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9646b;

    /* renamed from: c  reason: collision with root package name */
    public a f9647c;

    /* renamed from: d  reason: collision with root package name */
    public Editable f9648d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f9649e;

    public h(Context context, String str, int i8, boolean z10) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException();
        }
        e a10 = e.a(context);
        this.f9649e = i8;
        a aVar = new a(a10, str);
        this.f9647c = aVar;
        aVar.g();
        Editable editable = this.f9648d;
        if (editable != null) {
            this.B = true;
            String r10 = e.r(editable);
            Editable editable2 = this.f9648d;
            editable2.replace(0, editable2.length(), r10, 0, r10.length());
            this.B = false;
        }
        this.C = z10;
    }

    public final String a(CharSequence charSequence) {
        this.f9647c.g();
        String str = "+" + this.f9649e;
        boolean z10 = this.C;
        if (z10 || (charSequence.length() > 0 && charSequence.charAt(0) != '0')) {
            charSequence = str + charSequence;
        }
        int length = charSequence.length();
        char c3 = 0;
        String str2 = "";
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = charSequence.charAt(i8);
            if (PhoneNumberUtils.isNonSeparator(charAt)) {
                if (c3 != 0) {
                    str2 = this.f9647c.j(c3);
                }
                c3 = charAt;
            }
        }
        if (c3 != 0) {
            str2 = this.f9647c.j(c3);
        }
        String trim = str2.trim();
        if (z10 || charSequence.length() == 0 || charSequence.charAt(0) != '0') {
            trim = trim.length() > str.length() ? trim.charAt(str.length()) == ' ' ? trim.substring(str.length() + 1) : trim.substring(str.length()) : "";
        }
        return TextUtils.isEmpty(trim) ? "" : trim;
    }

    public final synchronized void afterTextChanged(Editable editable) {
        boolean z10 = true;
        if (this.f9646b) {
            if (editable.length() == 0) {
                z10 = false;
            }
            this.f9646b = z10;
            return;
        } else if (!this.f9645a) {
            int selectionEnd = Selection.getSelectionEnd(editable);
            boolean z11 = selectionEnd == editable.length();
            String a10 = a(editable);
            if (!a10.equals(editable.toString())) {
                if (!z11) {
                    int i8 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i8 >= editable.length()) {
                            break;
                        } else if (i8 >= selectionEnd) {
                            break;
                        } else {
                            if (PhoneNumberUtils.isNonSeparator(editable.charAt(i8))) {
                                i10++;
                            }
                            i8++;
                        }
                    }
                    selectionEnd = 0;
                    int i11 = 0;
                    while (true) {
                        if (selectionEnd >= a10.length()) {
                            selectionEnd = 0;
                            break;
                        } else if (i11 == i10) {
                            break;
                        } else {
                            if (PhoneNumberUtils.isNonSeparator(a10.charAt(selectionEnd))) {
                                i11++;
                            }
                            selectionEnd++;
                        }
                    }
                } else {
                    selectionEnd = a10.length();
                }
            }
            if (!z11) {
                while (true) {
                    int i12 = selectionEnd - 1;
                    if (i12 > 0 && !PhoneNumberUtils.isNonSeparator(a10.charAt(i12))) {
                        selectionEnd--;
                    }
                }
            }
            try {
                this.f9645a = true;
                editable.replace(0, editable.length(), a10, 0, a10.length());
                this.f9645a = false;
                this.f9648d = editable;
                Selection.setSelection(editable, selectionEnd);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            return;
        }
        return;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
        boolean z10;
        if (!this.f9645a && !this.f9646b && i10 > 0) {
            int i12 = i8;
            while (true) {
                if (i12 >= i8 + i10) {
                    z10 = false;
                    break;
                } else if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i12))) {
                    z10 = true;
                    break;
                } else {
                    i12++;
                }
            }
            if (z10 && !this.B) {
                this.f9646b = true;
                this.f9647c.g();
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
        boolean z10;
        if (!this.f9645a && !this.f9646b && i11 > 0) {
            int i12 = i8;
            while (true) {
                if (i12 >= i8 + i11) {
                    z10 = false;
                    break;
                } else if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i12))) {
                    z10 = true;
                    break;
                } else {
                    i12++;
                }
            }
            if (z10) {
                this.f9646b = true;
                this.f9647c.g();
            }
        }
    }
}
