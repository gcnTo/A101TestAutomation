# A101TestAutomation

Jar Dosyaları İçin Link: https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.4.0/selenium-java-4.4.0.zip

Chrome WebDriver Linki: https://chromedriver.storage.googleapis.com/index.html?path=105.0.5195.52/

Notlar: 

        Ödeme adımından önceki son adım olan "Ön Bilgilendirme Koşulları’nı ve Uzaktan Satış Sözleşmesi’ni okudum ve kabul ediyorum" adımında checkbox 
        seçilirken offset kullanılmak zorunda kalınmıştır. By.cssSelector, By.name vb. diğer yöntemlerle alan seçimi yapıldığında sözleşmeleri açmaktadır.
        Offset kullanılması sebebi ile 1920x1080 tam ekran modunda test ettiğimi belirtmek isterim.
        
        A101 websitesine adres kaydederken herhangi bir değişiklik yapılmamış ise kaydet butonuna tıklanılamamaktadır. Bunun önüne geçmek için yeni adres girilmelidir.
        
        Kargo firmaları değişkenlik gösterebilmektedir. İlgili kargoya göre kod değiştirilmek durumundadır.
        Örnek olarak an itibarı ile İstanbul, Arnavutköy, Anadolu Mahallesi'nde Sendeo seçeneği mevcuttur ancak ileri bir tarihte veya başka bir adreste mevcut olmayabilir.
        Bunun önüne geçmek için 143. ve 144. satırlarda uygun kargo adı girilmelidir.
        
        Zaman zaman StaleElementReference exceptionı alınmaktadır. Program tekrar çalıştırılmalıdır.
        
        Zaman zaman Ten rengi çorap seçilmektedir ancak bu durmda program bunu kontrol edip bir önceki sayfaya geri dönüp siyah çorap seçildiğini doğrulamaktadır. 
        (Detayları için 70. satıra göz atmanız rica olunur.)
        
        Zaman zaman başlangıçta linklere tıklanamadığı durumlarla karşılaştım benzer bir durum ile karşılaşırsanız veya herhangi bir hata ile karşılaşırsanız lütfen             bildirin.
        
        E-Mail: gcnsntgrl@gmail.com
        LinkedIn: https://www.linkedin.com/in/gcnto/
        
