package com.quickkonnect.silencio.models.response.menu;

import bb.b;
import java.util.List;
import sf.e;
import sf.j;

public final class HistoryModel {
    public static final int $stable = 8;
    @b("audioHistory")
    private final List<AudioHistory> audioHistory;
    @b("count")
    private final Integer count;

    public HistoryModel() {
        this((List) null, (Integer) null, 3, (e) null);
    }

    public HistoryModel(List<AudioHistory> list, Integer num) {
        this.audioHistory = list;
        this.count = num;
    }

    public static /* synthetic */ HistoryModel copy$default(HistoryModel historyModel, List<AudioHistory> list, Integer num, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = historyModel.audioHistory;
        }
        if ((i8 & 2) != 0) {
            num = historyModel.count;
        }
        return historyModel.copy(list, num);
    }

    public final List<AudioHistory> component1() {
        return this.audioHistory;
    }

    public final Integer component2() {
        return this.count;
    }

    public final HistoryModel copy(List<AudioHistory> list, Integer num) {
        return new HistoryModel(list, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryModel)) {
            return false;
        }
        HistoryModel historyModel = (HistoryModel) obj;
        return j.a(this.audioHistory, historyModel.audioHistory) && j.a(this.count, historyModel.count);
    }

    public final List<AudioHistory> getAudioHistory() {
        return this.audioHistory;
    }

    public final Integer getCount() {
        return this.count;
    }

    public int hashCode() {
        List<AudioHistory> list = this.audioHistory;
        int i8 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.count;
        if (num != null) {
            i8 = num.hashCode();
        }
        return hashCode + i8;
    }

    public String toString() {
        return "HistoryModel(audioHistory=" + this.audioHistory + ", count=" + this.count + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HistoryModel(List list, Integer num, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : list, (i8 & 2) != 0 ? null : num);
    }
}
