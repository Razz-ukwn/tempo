package com.quickkonnect.silencio.models.response.tabs;

import sf.e;
import sf.j;

public final class EarningsModel {
    public static final int $stable = 0;
    private final Double totalCoinsFromReferal;
    private final Double totalCoinsFromSamples;
    private final Double totalWalletAmount;

    public EarningsModel() {
        this((Double) null, (Double) null, (Double) null, 7, (e) null);
    }

    public EarningsModel(Double d10, Double d11, Double d12) {
        this.totalWalletAmount = d10;
        this.totalCoinsFromSamples = d11;
        this.totalCoinsFromReferal = d12;
    }

    public static /* synthetic */ EarningsModel copy$default(EarningsModel earningsModel, Double d10, Double d11, Double d12, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            d10 = earningsModel.totalWalletAmount;
        }
        if ((i8 & 2) != 0) {
            d11 = earningsModel.totalCoinsFromSamples;
        }
        if ((i8 & 4) != 0) {
            d12 = earningsModel.totalCoinsFromReferal;
        }
        return earningsModel.copy(d10, d11, d12);
    }

    public final Double component1() {
        return this.totalWalletAmount;
    }

    public final Double component2() {
        return this.totalCoinsFromSamples;
    }

    public final Double component3() {
        return this.totalCoinsFromReferal;
    }

    public final EarningsModel copy(Double d10, Double d11, Double d12) {
        return new EarningsModel(d10, d11, d12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsModel)) {
            return false;
        }
        EarningsModel earningsModel = (EarningsModel) obj;
        return j.a(this.totalWalletAmount, earningsModel.totalWalletAmount) && j.a(this.totalCoinsFromSamples, earningsModel.totalCoinsFromSamples) && j.a(this.totalCoinsFromReferal, earningsModel.totalCoinsFromReferal);
    }

    public final Double getTotalCoinsFromReferal() {
        return this.totalCoinsFromReferal;
    }

    public final Double getTotalCoinsFromSamples() {
        return this.totalCoinsFromSamples;
    }

    public final Double getTotalWalletAmount() {
        return this.totalWalletAmount;
    }

    public int hashCode() {
        Double d10 = this.totalWalletAmount;
        int i8 = 0;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.totalCoinsFromSamples;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.totalCoinsFromReferal;
        if (d12 != null) {
            i8 = d12.hashCode();
        }
        return hashCode2 + i8;
    }

    public String toString() {
        return "EarningsModel(totalWalletAmount=" + this.totalWalletAmount + ", totalCoinsFromSamples=" + this.totalCoinsFromSamples + ", totalCoinsFromReferal=" + this.totalCoinsFromReferal + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EarningsModel(Double d10, Double d11, Double d12, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : d10, (i8 & 2) != 0 ? null : d11, (i8 & 4) != 0 ? null : d12);
    }
}
