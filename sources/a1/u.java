package a1;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import gf.q;
import java.util.ArrayList;
import sf.j;
import x0.a;
import x0.h;
import zf.n;

public final class u implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    public final k f55a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f56b;

    /* renamed from: c  reason: collision with root package name */
    public int f57c;

    /* renamed from: d  reason: collision with root package name */
    public final y f58d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f59e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f60f = true;

    public u(y yVar, c0 c0Var, boolean z10) {
        j.f(yVar, "initState");
        this.f55a = c0Var;
        this.f56b = z10;
        this.f58d = yVar;
    }

    public final void a(e eVar) {
        this.f57c++;
        try {
            this.f59e.add(eVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i8 = this.f57c - 1;
        this.f57c = i8;
        if (i8 == 0) {
            ArrayList arrayList = this.f59e;
            if (!arrayList.isEmpty()) {
                this.f55a.c(q.P0(arrayList));
                arrayList.clear();
            }
        }
        return this.f57c > 0;
    }

    public final boolean beginBatchEdit() {
        boolean z10 = this.f60f;
        if (!z10) {
            return z10;
        }
        this.f57c++;
        return true;
    }

    public final void c(int i8) {
        sendKeyEvent(new KeyEvent(0, i8));
        sendKeyEvent(new KeyEvent(1, i8));
    }

    public final boolean clearMetaKeyStates(int i8) {
        boolean z10 = this.f60f;
        if (z10) {
            return false;
        }
        return z10;
    }

    public final void closeConnection() {
        this.f59e.clear();
        this.f57c = 0;
        this.f60f = false;
        this.f55a.d(this);
    }

    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f60f;
        if (z10) {
            return false;
        }
        return z10;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i8, Bundle bundle) {
        j.f(inputContentInfo, "inputContentInfo");
        boolean z10 = this.f60f;
        if (z10) {
            return false;
        }
        return z10;
    }

    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f60f;
        return z10 ? this.f56b : z10;
    }

    public final boolean commitText(CharSequence charSequence, int i8) {
        boolean z10 = this.f60f;
        if (z10) {
            a(new b(i8, String.valueOf(charSequence)));
        }
        return z10;
    }

    public final boolean deleteSurroundingText(int i8, int i10) {
        boolean z10 = this.f60f;
        if (!z10) {
            return z10;
        }
        a(new c(i8, i10));
        return true;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i8, int i10) {
        boolean z10 = this.f60f;
        if (!z10) {
            return z10;
        }
        a(new d(i8, i10));
        return true;
    }

    public final boolean endBatchEdit() {
        return b();
    }

    public final boolean finishComposingText() {
        boolean z10 = this.f60f;
        if (!z10) {
            return z10;
        }
        a(new f());
        return true;
    }

    public final int getCursorCapsMode(int i8) {
        y yVar = this.f58d;
        return TextUtils.getCapsMode(yVar.f67a.f16819a, h.c(yVar.f68b), i8);
    }

    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i8) {
        y yVar = this.f58d;
        j.f(yVar, "<this>");
        ExtractedText extractedText = new ExtractedText();
        a aVar = yVar.f67a;
        String str = aVar.f16819a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j10 = yVar.f68b;
        extractedText.selectionStart = h.c(j10);
        extractedText.selectionEnd = h.b(j10);
        extractedText.flags = n.z0(aVar.f16819a, 10) ^ true ? 1 : 0;
        return extractedText;
    }

    public final Handler getHandler() {
        return null;
    }

    public final CharSequence getSelectedText(int i8) {
        y yVar = this.f58d;
        long j10 = yVar.f68b;
        if (((int) (j10 >> 32)) == h.a(j10)) {
            return null;
        }
        j.f(yVar, "<this>");
        a aVar = yVar.f67a;
        aVar.getClass();
        long j11 = yVar.f68b;
        return aVar.subSequence(h.c(j11), h.b(j11)).f16819a;
    }

    public final CharSequence getTextAfterCursor(int i8, int i10) {
        y yVar = this.f58d;
        j.f(yVar, "<this>");
        long j10 = yVar.f68b;
        int b10 = h.b(j10);
        int b11 = h.b(j10) + i8;
        a aVar = yVar.f67a;
        return aVar.subSequence(b10, Math.min(b11, aVar.f16819a.length())).f16819a;
    }

    public final CharSequence getTextBeforeCursor(int i8, int i10) {
        y yVar = this.f58d;
        j.f(yVar, "<this>");
        long j10 = yVar.f68b;
        return yVar.f67a.subSequence(Math.max(0, h.c(j10) - i8), h.c(j10)).f16819a;
    }

    public final boolean performContextMenuAction(int i8) {
        boolean z10 = this.f60f;
        if (z10) {
            z10 = false;
            switch (i8) {
                case 16908319:
                    a(new x(0, this.f58d.f67a.f16819a.length()));
                    break;
                case 16908320:
                    c(277);
                    break;
                case 16908321:
                    c(278);
                    break;
                case 16908322:
                    c(279);
                    break;
            }
        }
        return z10;
    }

    public final boolean performEditorAction(int i8) {
        boolean z10 = this.f60f;
        if (!z10) {
            return z10;
        }
        if (i8 != 0) {
            switch (i8) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i8);
                    break;
            }
        }
        this.f55a.b();
        return true;
    }

    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f60f;
        if (z10) {
            return true;
        }
        return z10;
    }

    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    public final boolean requestCursorUpdates(int i8) {
        boolean z10 = this.f60f;
        if (!z10) {
            return z10;
        }
        Log.w("RecordingIC", "requestCursorUpdates is not supported");
        return false;
    }

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        j.f(keyEvent, "event");
        boolean z10 = this.f60f;
        if (!z10) {
            return z10;
        }
        this.f55a.a(keyEvent);
        return true;
    }

    public final boolean setComposingRegion(int i8, int i10) {
        boolean z10 = this.f60f;
        if (z10) {
            a(new v(i8, i10));
        }
        return z10;
    }

    public final boolean setComposingText(CharSequence charSequence, int i8) {
        boolean z10 = this.f60f;
        if (z10) {
            a(new w(i8, String.valueOf(charSequence)));
        }
        return z10;
    }

    public final boolean setSelection(int i8, int i10) {
        boolean z10 = this.f60f;
        if (!z10) {
            return z10;
        }
        a(new x(i8, i10));
        return true;
    }
}
