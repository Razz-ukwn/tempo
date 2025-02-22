package qe;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

public final class h implements Externalizable {
    public String B = "";

    /* renamed from: a  reason: collision with root package name */
    public boolean f13602a;

    /* renamed from: b  reason: collision with root package name */
    public String f13603b = "";

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f13604c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f13605d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f13606e;

    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f13602a = true;
            this.f13603b = readUTF;
        }
        int readInt = objectInput.readInt();
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f13604c.add(Integer.valueOf(objectInput.readInt()));
        }
        int readInt2 = objectInput.readInt();
        for (int i10 = 0; i10 < readInt2; i10++) {
            this.f13605d.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f13606e = true;
            this.B = readUTF2;
        }
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.f13602a);
        if (this.f13602a) {
            objectOutput.writeUTF(this.f13603b);
        }
        ArrayList arrayList = this.f13604c;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            objectOutput.writeInt(((Integer) arrayList.get(i8)).intValue());
        }
        ArrayList arrayList2 = this.f13605d;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i10 = 0; i10 < size2; i10++) {
            objectOutput.writeInt(((Integer) arrayList2.get(i10)).intValue());
        }
        objectOutput.writeBoolean(this.f13606e);
        if (this.f13606e) {
            objectOutput.writeUTF(this.B);
        }
    }
}
