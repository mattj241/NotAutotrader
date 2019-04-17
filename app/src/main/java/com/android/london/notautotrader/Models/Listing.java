package com.android.london.notautotrader.Models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Listing {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("vin")
    @Expose
    private String vin;
    @SerializedName("heading")
    @Expose
    private String heading;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("msrp")
    @Expose
    private Double msrp;
    @SerializedName("miles")
    @Expose
    private Double miles;
    @SerializedName("data_source")
    @Expose
    private String dataSource;
    @SerializedName("vdp_url")
    @Expose
    private String vdpUrl;
    @SerializedName("carfax_1_owner")
    @Expose
    private Boolean carfax1Owner;
    @SerializedName("carfax_clean_title")
    @Expose
    private Boolean carfaxCleanTitle;
    @SerializedName("exterior_color")
    @Expose
    private String exteriorColor;
    @SerializedName("interior_color")
    @Expose
    private String interiorColor;
    @SerializedName("dom")
    @Expose
    private Integer dom;
    @SerializedName("dom_180")
    @Expose
    private Integer dom180;
    @SerializedName("dom_active")
    @Expose
    private Integer domActive;
    @SerializedName("seller_type")
    @Expose
    private String sellerType;
    @SerializedName("inventory_type")
    @Expose
    private String inventoryType;
    @SerializedName("stock_no")
    @Expose
    private String stockNo;
    @SerializedName("last_seen_at")
    @Expose
    private Integer lastSeenAt;
    @SerializedName("last_seen_at_date")
    @Expose
    private String lastSeenAtDate;
    @SerializedName("scraped_at")
    @Expose
    private Integer scrapedAt;
    @SerializedName("scraped_at_date")
    @Expose
    private String scrapedAtDate;
    @SerializedName("first_seen_at")
    @Expose
    private Integer firstSeenAt;
    @SerializedName("first_seen_at_date")
    @Expose
    private String firstSeenAtDate;
    @SerializedName("ref_price")
    @Expose
    private Integer refPrice;
    @SerializedName("ref_price_dt")
    @Expose
    private Integer refPriceDt;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("media")
    @Expose
    private Media media;
    @SerializedName("dealer")
    @Expose
    private Dealer dealer;
    @SerializedName("build")
    @Expose
    private Build build;
//    @SerializedName("financing_options")
//    @Expose
//    private List<FinancingOption> financingOptions = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMsrp() {
        return msrp;
    }

    public void setMsrp(Double msrp) {
        this.msrp = msrp;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getVdpUrl() {
        return vdpUrl;
    }

    public void setVdpUrl(String vdpUrl) {
        this.vdpUrl = vdpUrl;
    }

    public Boolean getCarfax1Owner() {
        return carfax1Owner;
    }

    public void setCarfax1Owner(Boolean carfax1Owner) {
        this.carfax1Owner = carfax1Owner;
    }

    public Boolean getCarfaxCleanTitle() {
        return carfaxCleanTitle;
    }

    public void setCarfaxCleanTitle(Boolean carfaxCleanTitle) {
        this.carfaxCleanTitle = carfaxCleanTitle;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public Integer getDom() {
        return dom;
    }

    public void setDom(Integer dom) {
        this.dom = dom;
    }

    public Integer getDom180() {
        return dom180;
    }

    public void setDom180(Integer dom180) {
        this.dom180 = dom180;
    }

    public Integer getDomActive() {
        return domActive;
    }

    public void setDomActive(Integer domActive) {
        this.domActive = domActive;
    }

    public String getSellerType() {
        return sellerType;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public String getStockNo() {
        return stockNo;
    }

    public void setStockNo(String stockNo) {
        this.stockNo = stockNo;
    }

    public Integer getLastSeenAt() {
        return lastSeenAt;
    }

    public void setLastSeenAt(Integer lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
    }

    public String getLastSeenAtDate() {
        return lastSeenAtDate;
    }

    public void setLastSeenAtDate(String lastSeenAtDate) {
        this.lastSeenAtDate = lastSeenAtDate;
    }

    public Integer getScrapedAt() {
        return scrapedAt;
    }

    public void setScrapedAt(Integer scrapedAt) {
        this.scrapedAt = scrapedAt;
    }

    public String getScrapedAtDate() {
        return scrapedAtDate;
    }

    public void setScrapedAtDate(String scrapedAtDate) {
        this.scrapedAtDate = scrapedAtDate;
    }

    public Integer getFirstSeenAt() {
        return firstSeenAt;
    }

    public void setFirstSeenAt(Integer firstSeenAt) {
        this.firstSeenAt = firstSeenAt;
    }

    public String getFirstSeenAtDate() {
        return firstSeenAtDate;
    }

    public void setFirstSeenAtDate(String firstSeenAtDate) {
        this.firstSeenAtDate = firstSeenAtDate;
    }

    public Integer getRefPrice() {
        return refPrice;
    }

    public void setRefPrice(Integer refPrice) {
        this.refPrice = refPrice;
    }

    public Integer getRefPriceDt() {
        return refPriceDt;
    }

    public void setRefPriceDt(Integer refPriceDt) {
        this.refPriceDt = refPriceDt;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

//    public List<FinancingOption> getFinancingOptions() {
//        return financingOptions;
//    }
//
//    public void setFinancingOptions(List<FinancingOption> financingOptions) {
//        this.financingOptions = financingOptions;
//    }

    public Double getMiles() {
        return miles;
    }
}
