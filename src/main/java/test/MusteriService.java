package test;

public class MusteriService {
    private MusteriRepository musteriRepository;

    private BilgilendirmeServis bilgilendirmeServis;

    public void setMusteriRepository(MusteriRepository musteriRepository) {
        this.musteriRepository = musteriRepository;
    }

    public void setBilgilendirmeServis(BilgilendirmeServis bilgilendirmeServis) {
        this.bilgilendirmeServis = bilgilendirmeServis;
    }

    public void kaydet(Musteri musteri) {
        musteriRepository.kaydet(musteri);

    }

    public  void yeniKayitGönder(Musteri musteri){
        bilgilendirmeServis.yeniKayitGönder(musteri);
    }
}
