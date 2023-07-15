package Work02;

public class C1 {
    /*

        1- dersTekrari klasoru icin once local'de git repo olusturalim
            - once terminal/cmd'de derstekrari klasorune gidelim
              users/ahmetbulutluoz/Desktop/dersTekrari
            - git init yazarak local repo olusturabiliriz
              bu komut workstation(Klasorumuz) ile git'i ilisiklendirir
              bu komut sonucunda "Initialized empty Git repository" yazisi aliriz. Bu islem bir work station icin sadece 1 kere yapilir
              git init komutu ile work station'da gizli bir klasor olusur .git
            - git add .  yazarak work station'daki tum dosyalari local repository'e yuklemek icin hazirliyoruz
              bu komutla git, versiyonlar arasinda sadece eklenen/degistirilen/silinen kisimlari tespit eder
            - git commit -m "commit aciklamasi" :
              git add . ile tespit edilen yedeklenecek kisimlar bir versiyon olusturularak git'e eklenir
              versiyon aciklamasi istedigimiz gibi olabilir, ancak sonradan geri donus ihtimalini dusunerek verdigimiz commit isimlerini anl;amli secmekte fayda vardir
        2- Bir work station icin local repo olusturulduktan sonra, yeniden commit almak istedigimizde
            - once terminal/cmd'de derstekrari klasorune gidelim
              users/ahmetbulutluoz/Desktop/dersTekrari
            - git add .
            - git commit -m "commit aciklamasi"
        3- Local'de olusturulan bir repo icin github.com'da repo olusturup dosyalarimizi gonderme
            - Once local'de bir repo olusturup, commit yapalim
            - github.com'da local repo'yu yukleyecegimiz bir remote repo olusturalim
            - remote repo'yu ilk defa olusturdugumuzda, yapmamiz gereken islemleri bize yazar
            - bunlardan ilk uc tanesi local repo olusturmakla ilgilidir, biz zaten yapmis oluruz
                git init
                git add README.md
                git commit -m "first commit"
            - sonraki 3 adim ise local repo'yu olusturdugumuz remote repo'ya gondermek icin gereklidir. Copy paste ile bu islemleri yapabiliriz.
                git branch -M main
                git remote add origin https://github.com/bulutluoz/dersTekrari.git
                git push -u origin main

    */
}
