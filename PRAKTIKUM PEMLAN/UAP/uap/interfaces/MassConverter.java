package uap.interfaces;

// Interface konversi dari gram ke kg
public interface MassConverter {
    // dari gram ke kg tinggal dibagi 1000
    int DENOMINATOR = 1000;
    // method nanti di implement di bentuk
    double gramToKilogram();
}