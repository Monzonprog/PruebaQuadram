package com.example.jorge.pruebaquadram.Class;

import java.util.List;

/**
 * Created by jorge on 23/10/17.
 */

public class Results {

    private boolean isGameCenterEnabled;
    //private List<IpadScreenshotUrls>ipadScreenshotUrls;
    private List<AppletvScreenshotUrls>appletvScreenshotUrls;
    private String artworkUrl60;
    private String artworkUrl512;
    private String artworkUrl100;
    private String artistViewUrl;
    private String kind;
    //private List<Features>features;
    private List<String> supportedDevices;
    private List<String> screenshotUrls;
    //private List<Advisories>advisories;
    private double averageUserRatingForCurrentVersion;
    private String trackCensoredName;
    private List<String>languageCodesISO2A;
    private String fileSizeBytes;
    private String contentAdvisoryRating;
    private int userRatingCountForCurrentVersion;
    private String trackViewUrl;
    private String trackContentRating;
    private List<String>genreIds;
    private String currentVersionReleaseDate;
    private String releaseNotes;
    private String currency;
    private String wrapperType;
    private String version;
    private int artistId;
    private String artistName;
    private List<String>genres;
    private double price;
    private String description;
    private int trackId;
    private String trackName;
    private String bundleId;
    private boolean isVppDeviceBasedLicensingEnabled;
    private String primaryGenreName;
    private String releaseDate;
    private String formattedPrice;
    private String minimumOsVersion;
    private int primaryGenreId;
    private String sellerName;
    private double averageUserRating;
    private int userRatingCount;



    @Override
    public String toString() {
        return "Results" +
                "genres=" + genres +
                '}';
    }

    public Results() {
    }

    public boolean isGameCenterEnabled() {
        return isGameCenterEnabled;
    }

    public void setGameCenterEnabled(boolean gameCenterEnabled) {
        isGameCenterEnabled = gameCenterEnabled;
    }

    public List<AppletvScreenshotUrls> getAppletvScreenshotUrls() {
        return appletvScreenshotUrls;
    }

    public void setAppletvScreenshotUrls(List<AppletvScreenshotUrls> appletvScreenshotUrls) {
        this.appletvScreenshotUrls = appletvScreenshotUrls;
    }

    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    public String getArtworkUrl512() {
        return artworkUrl512;
    }

    public void setArtworkUrl512(String artworkUrl512) {
        this.artworkUrl512 = artworkUrl512;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }


    public List<String> getSupportedDevices() {
        return supportedDevices;
    }

    public void setSupportedDevices(List<String> supportedDevices) {
        this.supportedDevices = supportedDevices;
    }

    public List<String> getScreenshotUrls() {
        return screenshotUrls;
    }

    public void setScreenshotUrls(List<String> screenshotUrls) {
        this.screenshotUrls = screenshotUrls;
    }
    public double getAverageUserRatingForCurrentVersion() {
        return averageUserRatingForCurrentVersion;
    }

    public void setAverageUserRatingForCurrentVersion(double averageUserRatingForCurrentVersion) {
        this.averageUserRatingForCurrentVersion = averageUserRatingForCurrentVersion;
    }

    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    public void setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
    }

    public List<String> getLanguageCodesISO2A() {
        return languageCodesISO2A;
    }

    public void setLanguageCodesISO2A(List<String> languageCodesISO2A) {
        this.languageCodesISO2A = languageCodesISO2A;
    }

    public String getFileSizeBytes() {
        return fileSizeBytes;
    }

    public void setFileSizeBytes(String fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
    }

    public String getContentAdvisoryRating() {
        return contentAdvisoryRating;
    }

    public void setContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
    }

    public int getUserRatingCountForCurrentVersion() {
        return userRatingCountForCurrentVersion;
    }

    public void setUserRatingCountForCurrentVersion(int userRatingCountForCurrentVersion) {
        this.userRatingCountForCurrentVersion = userRatingCountForCurrentVersion;
    }

    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    public String getTrackContentRating() {
        return trackContentRating;
    }

    public void setTrackContentRating(String trackContentRating) {
        this.trackContentRating = trackContentRating;
    }

    public List<String> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<String> genreIds) {
        this.genreIds = genreIds;
    }

    public String getCurrentVersionReleaseDate() {
        return currentVersionReleaseDate;
    }

    public void setCurrentVersionReleaseDate(String currentVersionReleaseDate) {
        this.currentVersionReleaseDate = currentVersionReleaseDate;
    }

    public String getReleaseNotes() {
        return releaseNotes;
    }

    public void setReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getWrapperType() {
        return wrapperType;
    }

    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public boolean isVppDeviceBasedLicensingEnabled() {
        return isVppDeviceBasedLicensingEnabled;
    }

    public void setVppDeviceBasedLicensingEnabled(boolean vppDeviceBasedLicensingEnabled) {
        isVppDeviceBasedLicensingEnabled = vppDeviceBasedLicensingEnabled;
    }

    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getFormattedPrice() {
        return formattedPrice;
    }

    public void setFormattedPrice(String formattedPrice) {
        this.formattedPrice = formattedPrice;
    }

    public String getMinimumOsVersion() {
        return minimumOsVersion;
    }

    public void setMinimumOsVersion(String minimumOsVersion) {
        this.minimumOsVersion = minimumOsVersion;
    }

    public int getPrimaryGenreId() {
        return primaryGenreId;
    }

    public void setPrimaryGenreId(int primaryGenreId) {
        this.primaryGenreId = primaryGenreId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public double getAverageUserRating() {
        return averageUserRating;
    }

    public void setAverageUserRating(double averageUserRating) {
        this.averageUserRating = averageUserRating;
    }

    public int getUserRatingCount() {
        return userRatingCount;
    }

    public void setUserRatingCount(int userRatingCount) {
        this.userRatingCount = userRatingCount;
    }
}
