package test;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MusteriTest {
    private MusteriService musteriService;
    private MusteriRepository musteriRepository;
    private BilgilendirmeServis bilgilendirmeServis;
    @Before
    public void setUp() throws Exception{
        musteriService=new MusteriService();

        bilgilendirmeServis= Mockito.mock(BilgilendirmeServis.class);
        musteriRepository= Mockito.mock(MusteriRepository.class);
        musteriService.setBilgilendirmeServis(bilgilendirmeServis);
        musteriService.setMusteriRepository(musteriRepository);

    }

    @Test
    public void testMusteriKaydet(){
        Musteri musteri=new Musteri();
        musteriService.kaydet(musteri);

        Mockito.verify(musteriRepository).kaydet(musteri); //Musteri Repositorydeki kaydet metodunun cağrılıp çağrılmadıgını kontrol ediyoruz

    }

    @Test
    public  void bilgilendirmeServis_test(){
        Musteri musteri=new Musteri();
        musteriService.yeniKayitGönder(musteri);

        Mockito.verify(bilgilendirmeServis).yeniKayitGönder(musteri);
    }
}
