package com.cleverdare.tutor503.Clases;

public class ImagenVideo {

    private int id;
    private int imagen;
    private String url;

    public ImagenVideo(int id, int imagen, String url) {
        this.id = id;
        this.imagen = imagen;
        this.url = url;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
