package be.vdab.xml.services;

class DefaultKwadraatService implements KwadraatService {
    @Override
    public int kwadraat(int getal) {
        return getal * getal;
    }
}