package com.TubesRpl.vehicrent.backend.payloads.requests;

public class RatingRequest {
    
    private int rating;
    private String komentar;
    private int idClient;
    private int idKendaraan;

    public RatingRequest(int rating, String komentar, int idClient, int idKendaraan) {
        this.rating = rating;
        this.komentar = komentar;
        this.idClient = idClient;
        this.idKendaraan = idKendaraan;
    }

    public RatingRequest() {
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

}