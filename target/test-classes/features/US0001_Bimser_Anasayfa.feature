

@Bimser
  Feature: US0001 Kullanici Bimser anasayfasinda test yapar.

    Scenario:  TC01 Kullanici anasayfa ekranında yer alan üst alanlarin kontrolunu yapar.

      Given Kullanici "BimserUrl" adresi ile anasayfaya gider
      And Bimser alanina tiklanir.
      And Bimsere tiklandigi dogrulanir.
      And Documentation alanina tiklanir
      And Bimser Blog alanina tiklanir.
      And Dil degisim alanina tiklanir.
      And Dil olarak English secilir.
      And Dil alaninin hemen yaninde yer alan Bimser alanina tiklanir.
      Then karanlik ve aydınlik mod arasinda gecis yapilir.
      And sayfayi kapatir.

