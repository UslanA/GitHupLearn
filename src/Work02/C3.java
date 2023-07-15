package Work02;

public class C3 {
    /*
        Kisisel kullanimda eski commitlere donmek istedigimizde
        tek bir git komutu yeterli olur
        ancak islemi yapmadan once projemizde commit yaparak
        son halini git'e gondermeliyiz
        Senaryo : eski bir commit'e gidip orada inceleme yaptiktan sonra
                  projenin son haline geri donun
        1- projenin son halini commit yapin
        2- git log --oneline diyerek tum commit gecmisini gorun
        3- istediginiz commit'e gitmek icin git checkout 123456
           (istenen commit'in hash kodunun ilk 7 hanesi)
        4- istedigimiz commit'i inceledik ve projenin son haline donmek istiyorsak
           git checkout 234567 (son kommit'in hash kodu)

        Senaryo : son yapilan commit'i gecersiz kilip,
                  bir onceki commit'e donun
            1- son halini commit yapin
            2- revert islemi icin git revert 1234567
                (geriye almak istedigim commit)

                NOT : geriye donme islemlerinde
                      local repo ile remote repo birbirinden farklilasacagi icin
                      geriye dondugumuzde baska islem yapmadan
                      remote repo'yu guncellemek gerekir.


            checkout : commit'ler arasinda gecis yapar
            ----revert  : geriye dondurur ve o halini oto matik olarak commit yapar
                      yani kalici olarak geriye dondurmus olur
         */
}
